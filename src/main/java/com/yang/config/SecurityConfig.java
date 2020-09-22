package com.yang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/message/add").hasRole("vip")
                .antMatchers("/algorithm").hasRole("vip")
                .antMatchers("/message").hasRole("vip")
                .antMatchers("/album").hasRole("vip");
        http.csrf().disable();
        http.formLogin().loginPage("/toLogin")
//                .loginProcessingUrl("/login")
                .usernameParameter("username")
                .passwordParameter("password")
                .loginProcessingUrl("/login");
        http.logout().logoutSuccessUrl("/toLogin");
        http.rememberMe().rememberMeParameter("remember");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(new BCryptPasswordEncoder())
                .withUser("yangjian").password(new BCryptPasswordEncoder()
                .encode("yangjian"))
                .roles("vip").and()
                .withUser("yuanfeiyang")
                .password(new BCryptPasswordEncoder()
                        .encode("yuanfeiyang"))
                .roles("vip").and()
                .withUser("luyufang")
                .password(new BCryptPasswordEncoder()
                        .encode("luyufang")).roles("vip");
    }


}

package com.yang.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String uuid;
    String username;
    String password;
    String role;
    String createTime;
}

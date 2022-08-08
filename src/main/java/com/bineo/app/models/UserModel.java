package com.bineo.app.models;

import lombok.Data;

@Data
public class UserModel {
    private String code;
    private String email;
    private String password;
    private String otp;
}
package com.bineo.app.hooks;

import com.bineo.app.models.UserLoginModel;

import java.util.Map;


public class ConfiguratorUser {
    public UserLoginModel convertToUserLogin(Map<String, String> entry) {
        return new UserLoginModel(entry.get("Email"), entry.get("Password"));
    }
}

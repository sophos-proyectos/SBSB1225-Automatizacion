package com.sophos.app.hooks;

import com.sophos.app.models.UserModel;

import java.util.Map;

public class ConfiguratorUser {

    public UserModel convertToUserLogin(Map<String,String> entry){
        return new UserModel(entry.get("Username"),entry.get("Password"));
    }

}

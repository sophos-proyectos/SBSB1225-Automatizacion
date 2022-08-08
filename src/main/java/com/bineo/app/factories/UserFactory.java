package com.bineo.app.factories;

import com.bineo.app.models.UserModel;
import com.bineo.app.exceptions.NotFoundException;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class UserFactory {
    private static final String USERS_PATH = "json/login.json";

    private UserFactory() {
    }

    public static UserModel with(String code) {
        return getActors().stream()
                .filter(user -> user.getCode()
                        .equals(code))
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException(String.format("User with name %s not found", code)));
    }

    public static List<UserModel> getActors() {
        return Arrays.asList(from(getActorsFile()).getObject("users", UserModel[].class));
    }

    @SneakyThrows
    private static URL getActorsFile() {
        String path = USERS_PATH;
        URL filePath = UserFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for users: " + path);
        }
        return filePath;
    }
}
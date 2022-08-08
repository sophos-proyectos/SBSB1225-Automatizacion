package com.bineo.app.factories.apis;

import com.bineo.app.models.apis.createuser.CreateUserModel;
import com.bineo.app.exceptions.NotFoundException;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class CreateUserFactory {
    public static final String PATH = "json/apis/create_user.json";
    private static final String VALUE = "AUTOMATION";

    private CreateUserFactory() {
    }

    public static CreateUserModel withDataDefault() {
        return getData().stream()
                .filter(data -> data.getFirstName()
                        .equals(VALUE))
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException(String.format("data with value %s not found", VALUE)));
    }

    public static List<CreateUserModel> getData() {
        return Arrays.asList(from(getDataFile()).getObject("data", CreateUserModel[].class));
    }

    @SneakyThrows
    public static URL getDataFile() {
        String path = PATH;
        URL filePath = CreateUserFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for data: " + path);
        }
        return filePath;
    }
}

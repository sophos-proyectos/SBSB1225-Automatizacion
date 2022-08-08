package com.bineo.app.factories.apis;

import com.bineo.app.models.apis.updatedata.UpdateDataUserModel;
import com.bineo.app.exceptions.NotFoundException;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class UpdateDataUserFactory {

    public static final String PATH = "json/apis/update_data_user.json";
    private static final String VALUE = "0010t00001YPZBAAA5";

    private UpdateDataUserFactory() {
    }

    public static UpdateDataUserModel withDataDefault() {
        return getData().stream()
                .filter(data -> data.getSalesforceId()
                        .equals(VALUE))
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException(String.format("data with value %s not found", VALUE)));
    }

    public static List<UpdateDataUserModel> getData() {
        return Arrays.asList(from(getDataFile()).getObject("data", UpdateDataUserModel[].class));
    }

    @SneakyThrows
    public static URL getDataFile() {
        String path = PATH;
        URL filePath = UpdateDataUserFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for data: " + path);
        }
        return filePath;
    }
}

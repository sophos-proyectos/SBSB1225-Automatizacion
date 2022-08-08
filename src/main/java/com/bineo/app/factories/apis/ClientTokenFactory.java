package com.bineo.app.factories.apis;

import com.bineo.app.models.apis.updatedata.ClientTokenModel;
import com.bineo.app.exceptions.NotFoundException;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class ClientTokenFactory {
    public static final String DATA_PATH = "json/apis/consult_client.json";
    private static final String VALUE = "sms";

    private ClientTokenFactory() {
    }

    public static ClientTokenModel withDataDefault() {
        return getData().stream()
                .filter(data -> data.getTipoOTP()
                        .equals(VALUE))
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException(String.format("client with value %s not found", VALUE)));
    }

    public static List<ClientTokenModel> getData() {
        return Arrays.asList(from(getDataFile()).getObject("client", ClientTokenModel[].class));
    }

    @SneakyThrows
    public static URL getDataFile() {
        String path = DATA_PATH;
        URL filePath = ClientTokenFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for client: " + path);
        }
        return filePath;
    }
}

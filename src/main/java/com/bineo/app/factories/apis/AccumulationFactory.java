package com.bineo.app.factories.apis;

import com.bineo.app.models.apis.accumulationandclaim.AccumulationAndClaimModel;
import com.bineo.app.exceptions.NotFoundException;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import static io.restassured.path.json.JsonPath.from;

public class AccumulationFactory {
    public static final String DATA_PATH = "json/apis/accumulation.json";

    private AccumulationFactory() {
    }

    public static AccumulationAndClaimModel with(String code) {
        return getData().stream()
                .filter(user -> user.getAcumulaRedimeCliente().getTipoTransaccion()
                        .equals(code))
                .findFirst()
                .orElseThrow(() ->
                        new NotFoundException(String.format("data with name %s not found", code)));
    }

    public static List<AccumulationAndClaimModel> getData() {
        return Arrays.asList(from(getDataFile()).getObject("data", AccumulationAndClaimModel[].class));
    }

    @SneakyThrows
    public static URL getDataFile() {
        String path = DATA_PATH;
        URL filePath = AccumulationFactory.class.getClassLoader().getResource(path);
        if (filePath == null) {
            throw new FileNotFoundException("File not found for data: " + path);
        }
        return filePath;
    }
}

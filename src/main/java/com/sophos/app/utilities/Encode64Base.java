package com.sophos.app.utilities;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encode64Base {

    private Encode64Base() {
    }

    public static String encode(String s) {
        return new String(Base64.getEncoder().encode(s.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
    }
}
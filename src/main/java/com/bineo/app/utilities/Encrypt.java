package com.bineo.app.utilities;

import lombok.SneakyThrows;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class Encrypt {

    // llave
    public static final String AESKEY = "u6LykvD8N3bq0EDkqQoqmm7dtMzgWLZ8";
    public static final String AESIV = "mqWg&B7TNx[LFl*n";
    // Compensar
    private static final int OFFSET = 16;
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private static final String ALGORITHM = "AES";

    private Encrypt() {
    }

    public static String encrypt(String content) {
        return encrypt(content, AESKEY);
    }

    @SneakyThrows
    public static String encrypt(String content, String aesKey) {
        SecretKeySpec skey = new SecretKeySpec(aesKey.getBytes(), ALGORITHM);
        IvParameterSpec iv = new IvParameterSpec(AESIV.getBytes(), 0, OFFSET);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        byte[] byteContent = content.getBytes(StandardCharsets.UTF_8);
        cipher.init(Cipher.ENCRYPT_MODE, skey, iv);// Inicializar
        byte[] result = cipher.doFinal(byteContent);
        return new Base64().encodeToString(result); // cifrado
    }
}

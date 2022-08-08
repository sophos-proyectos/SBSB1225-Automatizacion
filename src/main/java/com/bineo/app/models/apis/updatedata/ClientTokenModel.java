package com.bineo.app.models.apis.updatedata;

import lombok.Data;

@Data
public class ClientTokenModel {
    private String tipoOTP;
    private String codigoOtp;
    private String tipoDocumento;
    private String numeroDocumento;
    private String origen;
}

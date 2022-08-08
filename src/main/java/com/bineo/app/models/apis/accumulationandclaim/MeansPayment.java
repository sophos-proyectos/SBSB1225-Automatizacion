package com.bineo.app.models.apis.accumulationandclaim;

import lombok.Data;

@Data
public class MeansPayment {
    private Integer codigoMedioPago;
    private Integer monto;
    private Integer millasRedimidas;
    private String codigoVoucher;

}

package com.bineo.app.models.apis.accumulationandclaim;

import lombok.Data;

import java.util.List;

@Data
public class AccumulationRedeemsCustomer {
    private String idVenta;
    private String fechaTransaccion;
    private String tipoTransaccion;
    private Integer montoTotal;
    private Integer descuento;
    private Integer valorPagar;
    private Integer impuesto;
    private String idPromotor;
    private String idPuntoVenta;
    private String origenVenta;
    private DocumentType tipoDocumento;
    private String tipoVenta;
    private List<Products> productos;
    private List<MeansPayment> mediosPago;
}

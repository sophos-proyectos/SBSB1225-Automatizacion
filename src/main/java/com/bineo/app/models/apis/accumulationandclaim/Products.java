package com.bineo.app.models.apis.accumulationandclaim;

import lombok.Data;

@Data
public class Products {
    private String idProducto;
    private Integer cantidad;
    private Integer valorUnitario;
    private String marca;
    private String categoria;
    private String subcategoria;
    private String codigoVoucher;

}

package com.bineo.app.models.apis.updatedata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UpdateDataUserModel {
    @JsonProperty("SalesforceId")
    private String salesforceId;
    private ProfileInformationModel informacionPerfil;
    private InformationClientTcModel informacionClienteTC;
}

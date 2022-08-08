package com.bineo.app.models.apis.updatedata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InformationClientTcModel {
    @JsonProperty("AgreedHD")
    private Boolean agreedHD;
    @JsonProperty("HDDate")
    private String hDDate;
    @JsonProperty("HDVersion")
    private String hDVersion;
    @JsonProperty("AgreedTC")
    private Boolean agreedTC;
    @JsonProperty("TCDate")
    private String tCDate;
    @JsonProperty("TCVersion")
    private String tCVersion;
    @JsonProperty("IP")
    private String iP;
    @JsonProperty("Origen")
    private String origen;
}

package com.bineo.app.models.apis.createuser;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateUserModel {
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("SecondName")
    private String secondName;
    @JsonProperty("FirstLastName")
    private String firstLastName;
    @JsonProperty("SecondLastName")
    private String secondLastName;
    @JsonProperty("CellPhone")
    private String cellPhone;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("DocumentTypeName")
    private String documentTypeName;
    @JsonProperty("DocumentCountry")
    private String documentCountry;
    @JsonProperty("Document")
    private String document;
    @JsonProperty("AppStatus")
    private String appStatus;
    @JsonProperty("AppUpdated")
    private Boolean appUpdated;
    @JsonProperty("IsOfLegalAge")
    private Boolean isOfLegalAge;
    @JsonProperty("AgreedHD")
    private Boolean agreedHD;
    @JsonProperty("HDDate")
    private String hdDate;
    @JsonProperty("HDVersion")
    private String hdVersion;
    @JsonProperty("AgreedTC")
    private Boolean agreedTC;
    @JsonProperty("TCDate")
    private String tcDate;
    @JsonProperty("TCVersion")
    private String tcVersion;
    @JsonProperty("IP")
    private String ip;
    @JsonProperty("Program")
    private String program;
    @JsonProperty("ReferalCode")
    private String referalCode;
    @JsonProperty("Origen")
    private String origen;
}

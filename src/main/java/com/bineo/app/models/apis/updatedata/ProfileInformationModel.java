package com.bineo.app.models.apis.updatedata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProfileInformationModel {
    @JsonProperty("BirthDate")
    private String birthDate;
    @JsonProperty("State")
    private String state;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("VehicleType")
    private String vehicleType;
    @JsonProperty("Gender")
    private String gender;
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
    @JsonProperty("IsOfLegalAge")
    private Boolean isOfLegalAge;
    @JsonProperty("ReferalCode")
    private String referalCode;
    @JsonProperty("AppStatus")
    private String appStatus;
    @JsonProperty("AppUpdated")
    private Boolean appUpdated;
    @JsonProperty("UpdateDate")
    private String updateDate;
    @JsonProperty("UpdateOrigen")
    private String updateOrigen;
}

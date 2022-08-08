package com.bineo.app.enums;

public enum Values {
    //Register
    USER_REGISTER_TYPE_DOCUMENT("CC"),
    USER_REFERRED("No"),
    //Redention
    CONFIGURE_BOND_WITH_AMOUNT_ZERO("0"),
    HOME_PAGE_OUTPUT_TEXT_AMOUNT_POINTS_BOND_SPLIT("puntos"),
    DAYS_VALIDITY_CODE("90"),
    CODE_STATUS_FOR_USED("Por Usar"),
    CODE_STATUS_EXPIRED("Expirado"),
    FILTER_USED("Usados"),
    FILTER_EXPIRED("Expirados"),
    BUSINESS_LINE("Combustible"),
    //Maps and filters
    FILTER_STATION_FUEL_ENERGY("Corriente"),
    FILTER_STATION_REPLACE1("("),
    FILTER_STATION_REPLACE2(")"),
    SIGN_PRICE_FUEL("$"),
    SUFFIX_DISTANCE_STATION("km"),
    CODE_DATA_JSON("programa"),
    //Transactions
    TRANSACTION_REDENTION("Redención"),
    //Reclamacion
    CODE_STATUS_USED("Usado"),
    PRICE_BOND_SPLIT("."),
    //APIS
    TRANSACTION_TYPE_ACCUMULATION("Acumulacion"),
    TRANSACTION_TYPE_CLAIM("Reclamacion"),
    ACCUMULATION_ALTOQUE("altoque"),
    ACCUMULATION_EDS("eds"),
    //EditUser
    INITIAL_CELL_PHONE_NUMBER("31"),
    CODE_DATA_USER_CREATE_API("api"),
    CELLPHONE_USER_API_FOR_EDIT_USER("3221238004"),
    //Challenger
    FILTER_AVAILABLE("Disponibles"),
    FILTER_IN_PROGRESS("En progreso"),
    FILTER_IN_FINALIZED("Finalizada"),
    SPLIT_TEXT_CHALLENGER("Premio"),
    STATUS_MISION_AVAILABLE("Disponible"),
    STATUS_MISION_COMPLETED("Completada"),
    LABEL_MISION("Misión"),
    NAME_TRANSACTION_REWARD_OPTIN("redención"),
    NAME_TRANSACTION_REWARD_WITHOUT_OPTIN("consumo superiores"),
    //Preferences
    PREFIX_NAME_STATION("Eds");

    private final String message;

    Values(String message) {
        this.message = message;
    }

    public String message() {
        return this.message;
    }

}

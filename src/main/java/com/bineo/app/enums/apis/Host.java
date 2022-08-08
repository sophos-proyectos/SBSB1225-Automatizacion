package com.bineo.app.enums.apis;

public enum Host {
    HOST("https://apis-legacy-fidelidad-demo-dcem-fidelizacion-qa.cloudapps.demo.com"),
    HOST_CONSULT_ACCOUNT("https://fidelidad-demo-gtic-apimanager-app-qa.cloudapps.demo.com:443"),
    HOST_CONSULT_ACCOUNT_TOKEN("https://fidelidad-pub-demo-gtic-apimanager-qa-staging.cloudapps.demo.com:443"),
    HOST_ACCOUNT("https://demo--FullCopy.my.salesforce.com/services/apexrest"),
    HOST_ACCOUNT_TOKEN("https://test.salesforce.com/services");

    private final String value;

    Host(String value) {
        this.value = value;
    }

    public String url() {
        return value;
    }
}

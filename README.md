# Introducción
Este proyecto permite ejecutar las pruebas automatizadas para la aplicacion  demo APP, en dispositivos o emuladores locales asi como en kobiton en paralelo

# Configuración
1.1 Instalar
- Java 11 jdk
- Gradle 7.3.3
- Intellij community version 2021.2.3 o posterior
- Android Virtual Studio 2020.3.1+
- Instalar Appium server
- Appium inspector preferiblemente version 2021.12.2  o posterior para integracion con kobiton

1.2 Configurar variables de entorno  java, gradle y Android

1.3 Para ejecutar los escenarios de forma local puede configurar un emulador (se recomienda con android 10 o posterior), tambien puede conectar un dispositivo localmente. en su archivo **serenity.properties**  o dentro de la carpeta parallel en los archivos **.properties** configure como minimo las siguientes propiedades:

       

1.4 Para ejecutar los escenarios en kobiton, en su archivo **serenity.properties**  o dentro de la carpeta parallel en los archivos **.properties**configure como minimo las siguientes propiedades:

        webdriver.driver=appium
        webdriver.timeouts.implicitlywait=20000
        webdriver.wait.for.timeout=20000
        serenity.timeout=20000
        serenity.take.screenshots=AFTER_EACH_STEP
        serenity.logging=VERBOSE
        serenity.report.encoding=utf8
        serenity.project.name=demo App
        feature.file.encoding=utf8
        feature.file.language=es
        #APPIUM GENERAL PROPERTIES
        appium.newCommandTimeout=5000
        appium.captureScreenshots=true
        appium.sessionName=
        #APPIUM ANDROID PROPERTIES
        appium.autoGrantPermissions=true
        #APPIUM IOS PROPERTIES
        appium.autoAcceptAlerts=true
        #KOBITON CAPABILITIES
        appium.deviceName=
        appium.platformVersion=
        appium.platformName=
        appium.hub=https://api.kobiton.com:443/wd/hub
        appium.app=kobiton-store:
        appium.username=
        appium.accessKey=

para mayor informacion sobre las propiedades a configurar en serenity puede consultar: https://serenity-bdd.github.io/theserenitybook/latest/serenity-system-properties.html y para el caso de appium en: https://appium.io/docs/en/writing-running-appium/caps/

# Modo de ejecución

Para ejecutar todos los test en paralelo, ejecute el comando

    ./gradlew parallel

para ejecutar todos los test sin ejecutarlos de forma paralela, puede ejecutar el siguiente comando :

    gradle clean test --tests *Runner -D"properties"="serenity.properties"

Para ejecutar un grupo de escenarios sin ejecutarlos de forma paralela con tags, puede ejecutar el siguiente comando:

    gradle clean test -D"cucumber.options"="--tags @Regresion" -D"properties"="serenity.properties"

donde **@Regresion** corresponde al nombre del tag designado para el escenario que deseo ejecutar del archivo **.feature**.


Main class: net.serenitybdd.cucumber.cli.Main
Shoreten command line: seleccione la opción JAR manifest


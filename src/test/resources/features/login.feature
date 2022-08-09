# language: es
@Logueo @SmokeTest @test
Característica: Ingreso al sistema
  Como un usuario  demo
  Quiero ingresar a la aplicación
  Para utilizar sus funcionalidades


  Escenario: Realizar ingreso exitoso a la aplicación
    Dado usuario desea ingresar a la aplicacion
    E ingresa con el correo exitoso
    Entonces valido que el ingreso exitoso
    E ingreso el codigo de verificacion


  Escenario: Realizar ingreso exitoso a la aplicación

    Dado usuario desea ingresar a la aplicacion
    E ingreso con la siguiente informacion
      | Email                      | Password    |
      | backbaseUser2@backbase.com | Qwerty9876$ |
    Entonces valido que el ingreso exitoso
    E ingreso el codigo de verificacion 111111

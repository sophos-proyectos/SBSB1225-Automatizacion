#language: es
Característica: Yo como usuario de
  la app de Backbase deseo loguearme usando un usuario y una contraseña

  Escenario: Ingreso exitoso a la aplicacion
    Dado usuario desea ingresar a la aplicacion
    E ingresa un usuario y una contraseña
      | Username      | Password                         |
      | sdbx-prd-sara | ZGY2NDFkOThkOGQyMjU2MmNjMmYyOTg5 |
    E ingreso con el passcode 15973
    Entonces valido que el ingreso sea exitoso

  Escenario: Creación exitosa de pocket
    Dado usuario desea crear un pocket
    E ingresar nombre de pocket y monto
      | Nombre de Pocket      | Monto                         |
      | Viaje a Bahamas       | 100                           |
    Entonces valido que la creacion sea exitosa
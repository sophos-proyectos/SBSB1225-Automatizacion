#language: es
  Característica: Yo como usuario de
    la app de Backbase deseo loguearme usando un usuario y una contraseña

  Escenario: Ingreso exitoso a la aplicacion
    Dado usuario desea ingresar a la aplicacion
    E ingresa un usuario y una contraseña
    |Username                  |Password                          |
    |sdbx-prd-sara             |ZGY2NDFkOThkOGQyMjU2MmNjMmYyOTg5  |
    Entonces valido que el ingreso sea exitoso
#language: es
Característica: Yo como usuario de
  la app de Backbase deseo crear un pocket

  Escenario: Creación exitosa de pocket
    Dado usuario desea crear un pocket
    E ingresar nombre de pocket y monto
      | Nombre de Pocket      | Monto                         |
      | Viaje a Bahamas       | 100                           |
    Entonces valido que la creacion sea exitosa
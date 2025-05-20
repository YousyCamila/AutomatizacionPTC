# language: es
# author: Andres Duarte

Característica: Edición de cliente en la página de PTC
  Como usuario autenticado en el portal de PTC
  Quiero editar los datos de un cliente existente
  Para mantener su información actualizada y precisa.

  @editarCliente

  Escenario: Verificar la edición exitosa de los datos de un cliente
    Dado que el usuario se encuentra en la sección de edición de un cliente en PTC
    Cuando actualice los datos del cliente con la siguiente información
      | tipo de documento | número de documento | nombres     | apellidos       | correo electrónico     | fecha de nacimiento |
      | Cédula            | 123456789           | Juan Carlos | Pérez Rodríguez | juan.carlos@gmail.com  | 1990-07-20          |
    Entonces se debe verificar que los datos del cliente hayan sido actualizados correctamente y se reflejen en la lista de clientes

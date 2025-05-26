# language: es
# author: Andres Duarte

Característica: Edición de cliente en la página de PTC
  Como usuario autenticado en el portal de PTC
  Quiero editar los datos de un cliente existente
  Para mantener su información actualizada y precisa.

  Antecedentes:
    Dado que el usuario se encuentra en la página de inicio de sesión de PTC
    Cuando ingrese las credenciales correctas (correo y contraseña)
      | correos       | contraseña | rol           |
      | Lol@gmail.com | shadamy159 | Administrador |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a la página principal

  @editarCliente
  Escenario: Verificar la edición exitosa de los datos de un cliente
    Dado que el usuario se encuentra en la sección de edición de un cliente en PTC
    Cuando actualice los datos del cliente con la siguiente información
      | tipo de documento | número de documento | nombres     | apellidos     | correo electrónico    |
      | Cédula            | 123456789           | SOFÍA MARÍA | MUÑOZ SALAZAR | sofia.munoz@gmail.com |
    Entonces se debe verificar que los datos del cliente hayan sido actualizados correctamente y se reflejen en la lista de clientes

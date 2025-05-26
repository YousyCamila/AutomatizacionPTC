# language: es
# author: Andres Duarte

Característica: Edición de cliente en la página de PTC
  Como usuario autenticado en el portal de PTC
  Quiero editar los datos de un cliente existente
  Para mantener su información actualizada y precisa.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de PTC
    Cuando ingrese las credenciales correctas (usuario, contrasena y rol)
      | correos       | contraseña | rol           |
      | Lol@gmail.com | shadamy159 | Administrador |


  @editarCliente
  Escenario: Verificar la edición exitosa de los datos de un cliente
    Cuando actualice los datos del cliente con la siguiente información
      | tipo de documento | número de documento | nombres     | apellidos     | correo electrónico    |
      | Cédula            | 123456789           | SOFÍA MARÍA | MUÑOZ SALAZAR | sofia.munoz@gmail.com |
    Entonces se debe verificar que los datos del cliente hayan sido actualizados correctamente y se reflejen en la lista de clientes

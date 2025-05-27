# language: es
# author: Andres Duarte

Característica: Creación de cliente en la página de PTC
  Como usuario autenticado en el portal de PTC
  Quiero registrar un nuevo cliente en el sistema
  Para poder gestionarlo dentro del flujo de negocio.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de PTC
    Cuando ingrese las credenciales correctas (usuario, contrasena y rol)
      | correos       | contraseña | rol           |
      | Lol@gmail.com | shadamy159 | Administrador |

  @crearCliente
  Escenario: Verificar la creación exitosa de un nuevo cliente
    Cuando ingrese los datos requeridos del cliente
      | tipo de documento | número de documento | nombres     | apellidos    | correo electrónico    | fecha de nacimiento |
      | Cedula            | 123456459           | Juan Andrés | Pérez Duarte | junid.perez@gmail.com | 15-05-1990          |
    Entonces se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de clientes

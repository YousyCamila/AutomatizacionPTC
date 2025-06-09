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
    Entonces se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de clientes

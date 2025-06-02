# language: es
# author:Santiago

Característica: Eliminación lógica de detective en la página de PTC
  Como usuario autenticado en el portal de PTC
  Quiero poder eliminar cualquier detective existente presionando un botón
  Para que el cliente quede inactivo en el sistema sin ser eliminado físicamente.


  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de PTC
    Cuando ingrese las credenciales correctas (usuario, contrasena y rol)
      | correos       | contraseña | rol           |
      | Lol@gmail.com | shadamy159 | Administrador |

  @eliminarCliente
  Escenario: Verificar la eliminación lógica (inactivación) de un detective
    Cuando presione el botón "Eliminar" correspondiente a un detective activo
    Entonces el detective debe aparecer con estado inactivo en la lista de detectives

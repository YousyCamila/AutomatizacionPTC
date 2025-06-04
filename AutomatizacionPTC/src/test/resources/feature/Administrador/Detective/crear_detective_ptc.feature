# language: es
# author: Juan Sebastian Ordoñez

Característica: Creación de detective en la página de PTC
  Como usuario autenticado en el portal de PTC
  Quiero registrar un nuevo detective en el sistema
  Para poder gestionarlo dentro del flujo de negocio.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de PTC
    Cuando ingrese las credenciales correctas (usuario, contrasena y rol)
      | correos       | contraseña | rol           |
      | Lol@gmail.com | shadamy159 | Administrador |

  @crearDetective
  Escenario: Verificar la creación exitosa de un nuevo detective
    Dado que el usuario se encuentra en el formulario de creación de detective en PTC
    Cuando ingrese los datos requeridos del detective de forma aleatoria
    Entonces se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de detectives

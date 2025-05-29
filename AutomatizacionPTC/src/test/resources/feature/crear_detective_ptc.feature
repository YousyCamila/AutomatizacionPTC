# language: es
# author: Andres Duarte

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
    Cuando ingrese los datos requeridos del detective
      | tipo de documento | número de documento | nombres       | apellidos     | correo electrónico     | fecha de nacimiento |
      | Cédula            | 123456789           | Juan Sebastian   | Ordoñez sierra  | juan.perez@gmail.com   | 1990-05-15          |
    Entonces se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de clientes

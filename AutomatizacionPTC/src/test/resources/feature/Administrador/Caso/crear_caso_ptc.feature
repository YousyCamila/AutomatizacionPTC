# language: es
# author: Camila Guerra

Característica: Creacion del caso en la página de PTC
Como usuario autenticado en el portal de PTC
Quiero registrar un nuevo caso en el sistema
Para poder gestionarlo dentro del flujo de negocio.

Antecedentes:
Dado que el usuario se encuentra en la pagina de inicio de sesion de PTC
Cuando ingrese las credenciales correctas (usuario, contrasena y rol)
| correos       | contraseña | rol           |
| Lol@gmail.com | shadamy159 | Administrador |

@crearCaso
Escenario: Verificar el registro exitoso de un caso
Cuando registre los datos del cliente con la siguiente información
  | nombre caso        | cliente           | detective     |
  | Cadena de custodia | FERNANDO TRUJILLO | LUIS HERNADEZ |
  Entonces se debe verificar que los datos del caso hayan sido registrados correctamente y se reflejen en la lista de casos

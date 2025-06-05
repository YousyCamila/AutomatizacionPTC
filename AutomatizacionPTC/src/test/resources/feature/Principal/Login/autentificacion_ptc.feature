
#language:es
#author:Camila Guerra

Característica: Autenticacion en la pagina de PTC
  Como usuario de Facebook
  Quiero autenticarme en el portal de PTC
  Para poder acceder al contenido y funcionalidades disponibles en mi rol.

  @autenticacion

  Escenario: Verificar la autenticacion exitosa en la pagina de PTC
    Dado que el usuario se encuentra en la pagina de inicio de sesion de PTC
    Cuando ingrese las credenciales correctas (usuario, contrasena y rol)
      | correos       | contraseña | rol           |
      | Lol@gmail.com | shadamy159 | Administrador |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su panel correspondiente
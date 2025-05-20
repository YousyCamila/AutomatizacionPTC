# language: es
# author: Andres Duarte

Característica: Registro de usuario en la página de PTC
  Como nuevo usuario de PTC
  Quiero registrarme en el portal de PTC
  Para poder acceder al contenido y funcionalidades disponibles en mi rol.

  @registro

  Escenario: Verificar el registro exitoso de un nuevo usuario en la página de PTC
    Dado que el usuario se encuentra en la página de registro de PTC
    Cuando ingrese los datos requeridos para el registro
      | nombre completo | correo electrónico | contraseña | confirmar contraseña | rol           | código de verificación |
      | Camila Guerra   | cami@gmail.com     | clave123   | clave123             | administrador | 123456                 |
    Entonces se debe verificar que el usuario haya sido registrado correctamente y redirigido a la página de inicio de sesión

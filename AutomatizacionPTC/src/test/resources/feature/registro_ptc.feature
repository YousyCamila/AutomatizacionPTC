# language: es
# author: Camila Guerra

Característica: Registro de usuario en el portal de PTC
  Como nuevo usuario
  Quiero completar el proceso de registro en el portal de PTC
  Para poder acceder con mi rol y utilizar las funcionalidades disponibles.

  @registro

  Escenario: Registro exitoso de un nuevo usuario
    Dado que el usuario accede a la página de registro de PTC
    Cuando el usuario completa el primer formulario con los datos:
      | nombre completo      | Camila Guerra   |
      | correo electrónico   | camil@gmail.com |
      | contraseña           | clave123        |
      | confirmar contraseña | clave123        |
      | rol                  | Administrador   |
      | código verificación  | 123456          |
    Y hace clic en el botón "Registrarse"
    Y completa el segundo formulario con los datos:
      | tipo documento        | Cédula de ciudadanía     |
      | número documento      | 1098765432               |
      | nombres               | Camila Andrea            |
      | apellidos             | Guerra Torres            |
      | fecha de nacimiento   | 15/08/1995               |
    Y hace clic en el botón "Guardar"
    Entonces el usuario debe ser registrado exitosamente y redirigido a la página de inicio de sesión

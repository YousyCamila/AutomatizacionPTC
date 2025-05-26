# language: es
# author: Camila Guerra

Característica: Registro de usuario en el portal de PTC
  Como nuevo usuario
  Quiero completar el proceso de registro en el portal de PTC
  Para poder acceder con mi rol y utilizar las funcionalidades disponibles.

  @registro

  Escenario: Registro exitoso de un nuevo usuario
    Dado que el usuario se encuentra en la página de registro de PTC
    Cuando ingrese los datos requeridos para el registro
      | nombreCompleto      | Camoisa Rincon       |
      | correoElectrónico   | camiisl@hotmail.com  |
      | contraseña          | clave123             |
      | confirmarContrasena | clave123             |
      | rol                 | Administrador        |
      | codigoVerificacion  | 123456               |
      | tipoDocumento       | Cédula de ciudadanía |
      | numeroDocumento     | 10987655984          |
      | nombres             | Camila Andrea        |
      | apellidos           | Guerra Torres        |
      | fechaNacimiento     | 15/08/1995           |
    Entonces se debe verificar que el usuario haya sido registrado correctamente y redirigido a la página de inicio de sesión

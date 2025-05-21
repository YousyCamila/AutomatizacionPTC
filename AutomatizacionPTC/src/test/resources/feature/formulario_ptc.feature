#language:es
#author: JohnRondon

Característica: Envío de formulario de contacto en la página de PTC
  Como visitante del sitio web de PTC
  Quiero llenar el formulario de "Contáctanos"
  Para que la empresa pueda recibir y gestionar mi solicitud o consulta.

  @formulario_contacto

  Escenario: Enviar exitosamente el formulario de contacto
    Dado que el usuario se encuentra en la página de contacto de PTC
    Cuando completa el formulario con la información requerida
      | nombre          | correo                  | telefono   | mensaje                          |
      | Angela Bonilla  | ejemplo.as3@gmail.com   | 3152674332  | Caso de maltrato intrafamiliar   |
    Y envía el formulario
    Entonces se debe mostrar una confirmación de envío exitoso del mensaje

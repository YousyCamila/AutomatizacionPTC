# language: es
# author: Andres Duarte

Característica: Creación de cliente en la página de PTC
  Como usuario autenticado en el portal de PTC
  Quiero registrar un nuevo cliente en el sistema
  Para poder gestionarlo dentro del flujo de negocio.

  @crearCliente

  Escenario: Verificar la creación exitosa de un nuevo cliente
    Dado que el usuario se encuentra en el formulario de creación de cliente en PTC
    Cuando ingrese los datos requeridos del cliente
      | tipo de documento | número de documento | nombres       | apellidos     | correo electrónico     | fecha de nacimiento |
      | Cédula            | 123456789           | Juan Andrés   | Pérez Duarte  | juan.perez@gmail.com   | 1990-05-15          |
    Entonces se debe verificar que el cliente haya sido registrado correctamente y aparezca en la lista de clientes

# language: es
# author: Andres Duarte

Característica: Creación de los contratos para la empresa PTC

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de PTC
    Cuando ingrese las credenciales correctas (usuario, contrasena y rol)
      | correos       | contraseña | rol           |
      | Lol@gmail.com | shadamy159 | Administrador |

  @Crearcontrato
  Escenario: Crear contrato exitosamente con todos los datos requeridos
    Cuando completa el formulario de contrato con la información requerida
      | cliente     | detective    | descripcionServicio      | fechaInicio | fechaCierre | metodoPago | tipoTarifa | tarifa | clausulasAdicionales     |
      |prueba 1|Camila guerra|Seguimiento y vigilancia|21-05-2025|21-01-2025|Pago en Efectivo|Tarifa por Hora|10.000|Confidencialidad total|
    Entonces se debe mostrar una confirmación de creación exitosa del contrato

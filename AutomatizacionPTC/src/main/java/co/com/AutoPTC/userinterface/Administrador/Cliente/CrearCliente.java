package co.com.AutoPTC.userinterface.Administrador.Cliente;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CrearCliente {

    public static final Target ABRIR_OPCIONES = Target.the("Botón para abrir el menú de opciones")
            .located(By.xpath("//*[@id=\"root\"]/div/div[1]/div/button"));

    public static final Target ABRIR_GESTIONCLIENTES = Target.the("Botón para abrir gestión de clientes")
            .located(By.xpath("/html/body/div[2]/div[3]/ul/li[1]/div"));

    public static final Target BTN_CREAR_CLIENTE = Target.the("Botón para crear un nuevo cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/button"));

    public static final Target SELECT_TIPO_DOCUMENTO = Target.the("Selector del tipo de documento")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div[1]/div[1]/div/div/div"));


    public static Target opcionTipoDocumento(String tipo) {
        return Target.the("Opción de tipo de documento: " + tipo)
                .located(By.xpath("//li[@role='option' and @data-value='" + tipo + "']"));
    }

    public static final Target INPUT_NUMERO_DOCUMENTO = Target.the("Campo para el número de documento")
            .located(By.xpath("//*[@id=\":r7k:\"]"));



    public static final Target INPUT_NOMBRES = Target.the("Campo para los nombres del cliente")
            .located(By.xpath("//*[@id=\":r7l:\"]"));

    public static final Target INPUT_APELLIDOS = Target.the("Campo para los apellidos del cliente")
            .located(By.xpath("//*[@id=\":r7m:\"]"));

    public static final Target INPUT_CORREO_ELECTRONICO = Target.the("Campo para el correo electrónico")
            .located(By.xpath("//*[@id=\":r7n:\"]"));

    public static final Target INPUT_FECHA_NACIMIENTO = Target.the("Campo para la fecha de nacimiento")
            .located(By.xpath("//*[@id=\":r7o:\"]"));

    public static final Target BTN_GUARDAR_CLIENTE = Target.the("Botón para guardar el nuevo cliente")
            .located(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div[2]/button[2]"));
}

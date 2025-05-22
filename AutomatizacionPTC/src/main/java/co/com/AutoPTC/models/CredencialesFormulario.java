package co.com.AutoPTC.models;

public class CredencialesFormulario {

    private String nombre;
    private String correo;
    private String telefono;
    private String mensaje;

    // Constructor vacío requerido por Cucumber
    public CredencialesFormulario() {}

    public CredencialesFormulario(String nombre, String correo, String telefono, String mensaje) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.mensaje = mensaje;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}

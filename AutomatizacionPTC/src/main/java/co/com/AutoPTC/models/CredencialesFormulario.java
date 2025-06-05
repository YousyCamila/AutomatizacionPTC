package co.com.AutoPTC.models;

public class CredencialesFormulario {

    private String nombre;
    private String correos;
    private String telefono;
    private String mensaje;
    private String correo;
    private String contraseña;
    private String roles;

    public CredencialesFormulario() {}

    public CredencialesFormulario(String roles, String contraseña, String correo,String nombre, String correos, String telefono, String mensaje) {
        this.nombre = nombre;
        this.correos = correos;
        this.telefono = telefono;
        this.mensaje = mensaje;
        this.correo = correo;
        this.contraseña = contraseña;
        this.roles = roles;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreos() { return correos; }
    public void setCorreo(String correo) { this.correos = correos; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }


    public String getCorreo() { return correo; }
    public String getContraseña(){ return contraseña; }
    public String getRoles (){ return roles; }


}

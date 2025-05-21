package co.com.AutoPTC.models;

public class DatosRegistro {

    private String nombreCompleto;
    private String email;
    private String contrasena;

    private String confirmarContrasena;
    private String rol;
    private String codigoVerificacion;


    public DatosRegistro(String nombreCompleto, String email, String contrasena,String confirmarContrasena, String rol, String codigoVerificacion) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.contrasena = contrasena;
        this.confirmarContrasena = confirmarContrasena;
        this.rol = rol;
        this.codigoVerificacion = codigoVerificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getEmail() {
        return email;
    }
    public String getContrasena() {
        return contrasena;
    }
    public String getConfirmarContrasena(){return confirmarContrasena;}
    public String getRol() {
        return rol;
    }
    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

}

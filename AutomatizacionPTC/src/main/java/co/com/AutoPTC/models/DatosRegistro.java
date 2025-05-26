package co.com.AutoPTC.models;

public class DatosRegistro {

    private String nombreCompleto;
    private String email;
    private String contrasena;
    private String confirmarContrasena;
    private String rol;
    private String codigoVerificacion;

    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;

    public DatosRegistro(String nombreCompleto, String email, String contrasena, String confirmarContrasena,
                         String rol, String codigoVerificacion, String tipoDocumento, String numeroDocumento,
                         String nombres, String apellidos, String fechaNacimiento) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.contrasena = contrasena;
        this.confirmarContrasena = confirmarContrasena;
        this.rol = rol;
        this.codigoVerificacion = codigoVerificacion;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getConfirmarContrasena() {
        return confirmarContrasena;
    }

    public String getRol() {
        return rol;
    }

    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}

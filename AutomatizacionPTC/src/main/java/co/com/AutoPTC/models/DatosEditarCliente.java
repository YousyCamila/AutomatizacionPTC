package co.com.AutoPTC.models;

public class DatosEditarCliente {


    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private String correoElectronico;

    public DatosEditarCliente (String tipoDocumento, String numeroDocumento, String nombres,
                               String apellidos, String correoElectronico) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
    }

    // Getters
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}

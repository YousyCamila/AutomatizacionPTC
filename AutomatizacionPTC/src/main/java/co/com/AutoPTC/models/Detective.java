package co.com.AutoPTC.models;

import java.util.List;

public abstract class Detective {

    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String fechaNacimiento;
    private List<String> especialidades;

    public Detective(String tipoDocumento, String numeroDocumento, String nombres,
                     String apellidos, String correoElectronico, String fechaNacimiento, List<String> especialidades) {

        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.especialidades = especialidades;
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
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public List<String> getEspecialidades() { return especialidades; }
}

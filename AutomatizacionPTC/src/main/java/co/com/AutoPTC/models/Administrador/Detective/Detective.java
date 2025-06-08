package co.com.AutoPTC.models.Administrador.Detective;

import java.util.List;

public class Detective {

    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String fechaNacimiento;
    private String especialidades;

    public Detective() {
    }

    public Detective(String tipoDocumento, String numeroDocumento, String nombres,
                     String apellidos, String correoElectronico, String fechaNacimiento, String especialidades) {

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
    public String getEspecialidades() { return especialidades; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }
    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public void setEspecialidades(String especialidades) { this.especialidades = especialidades; }
}
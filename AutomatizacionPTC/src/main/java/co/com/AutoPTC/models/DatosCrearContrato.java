package co.com.AutoPTC.models;

public class DatosCrearContrato {

    private String cliente;
    private String detective;
    private String descripcionServicio;
    private String fechaInicio;
    private String fechaCierre;
    private String metodoPago;
    private String tipoTarifa;
    private String tarifa;
    private String clausulasAdicionales;

    public DatosCrearContrato(String cliente, String detective, String descripcionServicio,
                              String fechaInicio, String fechaCierre, String metodoPago,
                              String tipoTarifa, String tarifa, String clausulasAdicionales) {
        this.cliente = cliente;
        this.detective = detective;
        this.descripcionServicio = descripcionServicio;
        this.fechaInicio = fechaInicio;
        this.fechaCierre = fechaCierre;
        this.metodoPago = metodoPago;
        this.tipoTarifa = tipoTarifa;
        this.tarifa = tarifa;
        this.clausulasAdicionales = clausulasAdicionales;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDetective() {
        return detective;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaCierre() {
        return fechaCierre;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public String getTarifa() {
        return tarifa;
    }

    public String getClausulasAdicionales() {
        return clausulasAdicionales;
    }
}

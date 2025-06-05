package co.com.AutoPTC.models.Administrador.Caso;

public class ModelCrearCaso {

    private String idCaso;
    private String nombreCaso;
    private String nombreCliente;
    private String nombreDetective;


    public ModelCrearCaso (String nombreCaso,String nombreCliente,String nombreDetective){
        this.nombreCaso = nombreCaso;
        this.nombreCliente= nombreCliente;
        this.nombreDetective=nombreDetective;
        this.idCaso = idCaso;
    }

    public String getNombreCaso()
    {
        return nombreCaso;
    }
    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public String getNombreDetective()
    {
        return nombreDetective;
    }

    public String getId(){return idCaso;}
}

package modelo;

/**
 *
 * @author Omar Tc,yosse
 */
public class ProdMedicos extends Productos{
    
    private double contenido;
    private String tipoFabricado;

    public ProdMedicos(double contenido, String tipoFabricado, String nombre_producto, int codigo, Long RucProveedor, String tipo, double precio, int stock, double result) {
        super(nombre_producto, codigo, RucProveedor, tipo, precio, stock, result);
        this.contenido = contenido;
        this.tipoFabricado = tipoFabricado;
    }

    //Getters and Setters
    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    public String getTipoFabricado() {
        
        switch (tipoFabricado) {
            case "Capsulas":
                tipoFabricado="Capsulas";
                break;
            case "Liquidos":
                tipoFabricado="Liquidos";
                break;
            case "Cremas":
                tipoFabricado="Cremas";
                break;
            case "Parches":
                tipoFabricado="Parcches";
                break;
        }
        return tipoFabricado;
    }

    public void setTipoFabricado(String tipoFabricado) {
        this.tipoFabricado = tipoFabricado;
    }
    
    
}

package modelo;

/**
 *
 * @author Omar Tc,yosse
 */
public class ProdCuidadoPersonal extends Productos{
    
    private double contenido;
    private String UnidadMed;

    public ProdCuidadoPersonal(double contenido, String UnidadMed, String nombre_producto, int codigo, Long RucProveedor, String tipo, double precio, int stock, double result) {
        super(nombre_producto, codigo, RucProveedor, tipo, precio, stock, result);
        this.contenido = contenido;
        this.UnidadMed = UnidadMed;
    }

    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    public String getUnidadMed() {
        return UnidadMed;
    }

    public void setUnidadMed(String UnidadMed) {
        this.UnidadMed = UnidadMed;
    }
    
    public String toString(){
        return "\nNombre prod: "+getNombre_producto()+"\n"
                + "Codigo: "+getCodigo()+"\nTipo: "+getTipo()+
                "\nPrecio: "+getPrecio()+"\nStock: "+getStock()+
                "\nU. Med: "+getUnidadMed()+"\nContedino: "+getContenido()+"\nRUC: "+getRucProveedor()+"\n";
    }
    
}

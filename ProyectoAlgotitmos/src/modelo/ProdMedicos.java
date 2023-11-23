package modelo;

/**
 *
 * @author Omar Tc,yosse
 */
public class ProdMedicos extends Productos{
    
    private double contenido;
    private String UniMed;

    public ProdMedicos(double contenido, String UniMed, String nombre_producto, int codigo, Long RucProveedor, String tipo, double precio, int stock, double result) {
        super(nombre_producto, codigo, RucProveedor, tipo, precio, stock, result);
        this.contenido = contenido;
        this.UniMed = UniMed;
    }
       
    //Getters and Setters
    public double getContenido() {
        return contenido;
    }

    public void setContenido(double contenido) {
        this.contenido = contenido;
    }

    public String getUniMed() {
        
        switch (UniMed) {
            case "Capsulas":
                UniMed="Capsulas";
                break;
            case "Liquidos":
                UniMed="Liquidos";
                break;
            case "Cremas":
                UniMed="Cremas";
                break;
            case "Parches":
                UniMed="Parches";
                break;
        }
        return UniMed;
    }

    public void setUniMed(String tipoFabricado) {
        this.UniMed = tipoFabricado;
    }
    
    public double calcdescuentoRecursivo(double precio, int cantidad){
        if (cantidad <=0) {
            return precio*cantidad;
        }
        
        double descuento=0;
        
        if (precio>50) {
            descuento += 0.1*precio; //Aplica descuento del 10% si el precio es mayor a 50
        }
        
        if (cantidad>5) {
            descuento += 0.05*(precio*cantidad); //descuento del 5% si la cantidad es mayor a 5 
        }else{
            return precio*cantidad;
        }
        return descuento+calcdescuentoRecursivo(precio, cantidad-1);
    }
    
}

package modelo;

/**
 *
 * @author Omar Tc, yosse
 */
public class ProdComestibles extends Productos{
    
    private int caducidad;

    public ProdComestibles(int caducidad, String nombre_producto, int codigo, Long RucProveedor, String tipo, double precio, int stock, double result) {
        super(nombre_producto, codigo, RucProveedor, tipo, precio, stock, result);
        this.caducidad = caducidad;
    }

    public double condicionarTipo(){
        double precioB = 0;
        switch (getTipo()) {
            case "Fruta/Verdura":
                precioB=getPrecio()+getPrecio()*0.05;
                break;
            case "Embutidos":
                precioB= getPrecio() + getPrecio()*0.1;
                break;
            case "Otros":
                precioB= getPrecio() + getPrecio()*0.2;
                break;
            case "Bebida":
                precioB= getPrecio() + getPrecio()*0.3;
                break;
            case "Proteina":
                precioB= getPrecio() + getPrecio()*0.35;
                break;
        }
        return precioB;
    }
    
    //Getter and Setter
    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }
    
    
}

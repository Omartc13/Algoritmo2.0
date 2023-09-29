package modelo;

/**
 *
 * @author Omar Tc,yosse
 */
public class ProdCuidadoPersonal extends Productos{
    
    private String tonos;
    private String dirigidoPara;
    private String fabricado;

    public ProdCuidadoPersonal(String tonos, String dirigidoPara, String fabricado, String nombre_producto, int codigo, Long RucProveedor, String tipo, double precio, int stock, double result) {
        super(nombre_producto, codigo, RucProveedor, tipo, precio, stock, result);
        this.tonos = tonos;
        this.dirigidoPara = dirigidoPara;
        this.fabricado = fabricado;
    }

    //Getters and Setters
    public String getTonos() {
        return tonos;
    }

    public void setTonos(String tonos) {
        this.tonos = tonos;
    }

    public String getDirigidoPara() {
        return dirigidoPara;
    }

    public void setDirigidoPara(String dirigidoPara) {
        this.dirigidoPara = dirigidoPara;
    }

    public String getFabricado() {
        if (fabricado.equals("Cruelty free")) {
            fabricado = "Cruelty free";
        } else
            if (fabricado.equals("NO CF")) {
            fabricado = "NO CF";
        }
        
        return fabricado;
    }

    public void setFabricado(String fabricado) {
        this.fabricado = fabricado;
    }
    
    
}


package misCAbstractas;

/**
 *
 * @author yosse,OmarTc
 */
public abstract class DatosEncargado {
    private String nombreProveedor;

    public DatosEncargado(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public DatosEncargado() {
    }

    //Metodo abstracto
    public abstract String tiempoProvedor();
    
    
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    
    
    
}

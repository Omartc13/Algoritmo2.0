package modelo;

/**
 *
 * @author yosse, Omar Tc
 */

public class SucursalesProvincia extends Sucursales{
    
    private String provincia;
    private int codigoProvincia;

    public SucursalesProvincia(String provincia, int codigoProvincia, int numSucursal, String encargado, int DNI, int telefono, String ciudad, String dirección) {
        super(numSucursal, encargado, DNI, telefono, ciudad, dirección);
        this.provincia = provincia;
        this.codigoProvincia = codigoProvincia;
    }

    
    //Getters and setters
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(int codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }
    
}

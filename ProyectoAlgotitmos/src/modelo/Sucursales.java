package modelo;

/**
 *
 * @author yosse,Omar Tc
 */
public class Sucursales {
    
    private int numSucursal;
    private String encargado;
    private int DNI;
    private int telefono;
    private String ciudad;
    private String dirección;

    public Sucursales(int numSucursal, String encargado, int DNI, int telefono, String ciudad, String dirección) {
        this.numSucursal = numSucursal;
        this.encargado = encargado;
        this.DNI = DNI;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.dirección = dirección;
    }

    public int getNumSucursal() {
        return numSucursal;
    }

    public void setNumSucursal(int numSucursal) {
        this.numSucursal = numSucursal;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    
    
    
}

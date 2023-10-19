package modelo;


public class Sucursales {
    
    private int numSucursal;
    private String distrito;
    private String encargado;
    private int telefono;
    private String dirección;
    private int DNI;

    public Sucursales(int numSucursal, String distrito, String encargado, int telefono, String dirección, int DNI) {
        this.numSucursal = numSucursal;
        this.distrito = distrito;
        this.encargado = encargado;
        this.telefono = telefono;
        this.dirección = dirección;
    }   

    public Sucursales() {
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

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
      
    
}

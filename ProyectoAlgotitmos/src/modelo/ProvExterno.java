package modelo;

import misCAbstractas.DatosEncargado;

/**
 *
 * @author Yosse
 */
public class ProvExterno extends DatosEncargado{
    
    private long RUC;
    private String direccion;
    private int telefono;
    private String correo;
    private String encargado;
    private int añoIngreso;
    private String demo;

    public ProvExterno(long RUC, String direccion, int telefono, String correo, String encargado, int añoIngreso, String demo, String nombreProveedor) {
        super(nombreProveedor);
        this.RUC = RUC;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.encargado = encargado;
        this.añoIngreso = añoIngreso;
        this.demo = demo;
    }

    public ProvExterno(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    
    @Override
    public String tiempoProvedor(){
        String demora= null;
        if (getAñoIngreso()>=1 && getAñoIngreso()<=4) {
            demora="40 dias";
        }if (getAñoIngreso()>=4 && getAñoIngreso()<=9) {
            demora="25 dias";
        }if (getAñoIngreso()>=10) {
            demora="20 dias";
        }
        return demora;
        
    }
    
    
    
    public long getRUC() {
        return RUC;
    }

    public void setRUC(long RUC) {
        this.RUC = RUC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }
    
}

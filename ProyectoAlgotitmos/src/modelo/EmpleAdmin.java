package modelo;

import misInterfaces.Sueldo;

/**
 *
 * @author yosse,OmarTc
 */
public class EmpleAdmin implements Sueldo{
    
    private String nombre;
    private String apellido_Completo;
    private int DNI;
    private int año;
    private int sueldo;
    private String afiliacion;
    private double sueldob;

    public EmpleAdmin(String nombre, String apellido_Completo, int DNI, int año, int sueldo, String afiliacion, double sueldob) {
        this.nombre = nombre;
        this.apellido_Completo = apellido_Completo;
        this.DNI = DNI;
        this.año = año;
        this.sueldo = sueldo;
        this.afiliacion = afiliacion;
        this.sueldob = sueldob;
    }

    public EmpleAdmin() {
    }
    
    //Constructor para calcular sueldobruto

    public EmpleAdmin(int sueldo, String afiliacion) {
        this.sueldo = sueldo;
        this.afiliacion = afiliacion;
    }

    @Override
    public double bonificación() {
        return 0.2*sueldo;
    }
   
    @Override
    public double descuento() {
        double a=0;
        if (afiliacion.equalsIgnoreCase("AFP")) {
            a= 0.15 * sueldo;
        }else if (afiliacion.equalsIgnoreCase("ONP")){
            a=  0.11*sueldo;
        }
        else 
            a=  0.09*sueldo;
        
        return a;
    }
    
    @Override
    public double sueldoBruto() {
        double sueldoB= sueldo + bonificación()-descuento();
        
        return sueldoB;
    }
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_Completo() {
        return apellido_Completo;
    }

    public void setApellido_Completo(String apellido_Completo) {
        this.apellido_Completo = apellido_Completo;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public double getSueldob() {
        return sueldob;
    }

    public void setSueldob(double sueldob) {
        this.sueldob = sueldob;
    }
}

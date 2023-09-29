package modelo;

import misInterfaces.Sueldo;

/**
 *
 * @author yosse,Omar Tc
 */
public class Empleado implements Sueldo{
    
    private String nombre;
    private String apellido_Completo;
    private int DNI;
    private String tipo;
    private int sueldoini;
    private double sueldob;

    public Empleado(String nombre, String apellido_Completo, int DNI, String tipo, int sueldoini, double sueldob) {
        this.nombre = nombre;
        this.apellido_Completo = apellido_Completo;
        this.DNI = DNI;
        this.tipo = tipo;
        this.sueldoini = sueldoini;
        this.sueldob = sueldob;
    }

    public Empleado() {
    }
    
    //Constructor para calcular sueldo Inicial

    public Empleado(String tipo) {
        this.tipo = tipo;
    }

    public int sueldoInicial() {
        int sueldoIn=0;
        switch (tipo) {
    case "Cajero":
       sueldoIn = 1300;
        break;
    case "Limpieza":
        sueldoIn = 980;
        break;
    case "Seguridad":
        sueldoIn = 1700;
        break;
    case "Asistente":
        sueldoIn = 1000;
        break;
    }
        return sueldoIn;
    }


    @Override
    public double bonificación() {
        if(sueldoInicial()< 1000)
            return 0;
        else
            return sueldoInicial()*0.1;
    }

    @Override
    public double descuento() {
        if(sueldoInicial()< 1000)
            return 0.10*sueldoInicial();
        else
            return sueldoInicial()*0.15;
    }

    @Override
    public double sueldoBruto() {
        double sueldoB = sueldoInicial()+bonificación()-descuento();
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSueldoini() {
        return sueldoini;
    }

    public void setSueldoini(int sueldoini) {
        this.sueldoini = sueldoini;
    }

    public double getSueldob() {
        return sueldob;
    }

    public void setSueldob(double sueldob) {
        this.sueldob = sueldob;
    }
    
    
    
}

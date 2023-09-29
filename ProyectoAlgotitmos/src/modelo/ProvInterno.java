
package modelo;

import misCAbstractas.DatosEncargado;

/**
 *
 * @author Yosse
 */

public class ProvInterno extends DatosEncargado{
    private String area;
    private int dni;
    private double suel;

    public ProvInterno(String area, int dni, double suel, String nombreProveedor) {
        super(nombreProveedor);
        this.area = area;
        this.dni = dni;
        this.suel = suel;
    }

    public ProvInterno(String area) {
        this.area = area;
    }
    
    public double calcsueldo(String ar){
        double sueldoas=0;
        switch (ar) {
            case "Dirección":
                sueldoas=6000;
                break;
            case "Recursos Humanos":
                sueldoas=5000;
                break;
            case "Finanzas":
                sueldoas=4000;
                break;
            case "Marketing":
                sueldoas=3000;
                break;
            case "Tecnología":
                sueldoas=7500;
                break;
        }
        return sueldoas;
    }
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSuel() {
        return suel;
    }

    public void setSuel(double suel) {
        this.suel = suel;
    }
    
    
    @Override
    public String tiempoProvedor(){
        return "";
    }
}

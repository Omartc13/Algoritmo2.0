package ArrayLists;

import java.util.ArrayList;
import modelo.Sucursales;

/**
 *
 * @author Omar Tc,yosse
 */
public class ASucursales {
    
    private ArrayList <Sucursales> sucursales;
    
    public ASucursales(){
        sucursales=new ArrayList<Sucursales>();
    }
    
    //Agregar Sucursales
    public void agregarSucursal(Sucursales suc){
        sucursales.add(suc);
    }
    
    //Eliminar sucursal
    public void eliminarSucursal(int nroSuc){
        sucursales.remove(nroSuc);
    }
    
    public Sucursales obtener (int posicion){
        return sucursales.get(posicion);
    }
    
    public int tamañoArreglo(){
        return sucursales.size();
    }
    
    public void ordenarPorInsercion(){
        int n=tamañoArreglo();
        
        for (int i = 1; i < n; i++) {
            Sucursales currentSucursal=obtener(i);
            int j=i-1;
            
            while (j>=0 && obtener(j).getDNI()>currentSucursal.getDNI()) {                
                sucursales.set(j+1, obtener(j));
                j--;
            }
            sucursales.set(j+1, currentSucursal);
        }
    }
}

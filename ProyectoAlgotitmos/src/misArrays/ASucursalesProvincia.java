package misArrays;

import java.util.ArrayList;
import modelo.SucursalesProvincia;

/**
 *
 * @author Omar Tc,yosse
 */
public class ASucursalesProvincia {
    
    private ArrayList <SucursalesProvincia> sucursalesP;
    
    public ASucursalesProvincia(){
        sucursalesP=new ArrayList<SucursalesProvincia>();
    }
    
    //Agregar SucProvincia
    public void agregarSucursalPro(SucursalesProvincia suc){
        sucursalesP.add(suc);
    }
    
    //Eliminar SucProvincia
    public void eliminarSucursalPro(int nroSucPro){
        sucursalesP.remove(nroSucPro);
    }
    
    public SucursalesProvincia obtener (int posicion){
        return sucursalesP.get(posicion);
    }
    
    public int tamañoArreglo(){
        return sucursalesP.size();
    }
    
    public void ordenarPorDNISelec(){
        int n=tamañoArreglo();
        
        for (int i = 0; i < n-1; i++) {
            int minIndex=i;
            
            for (int j = i+1; j < n; j++) {
                
                if (obtener(j).getDNI()< obtener(minIndex).getDNI()) {
                    minIndex=j;
                }
            }
            
            SucursalesProvincia temp= obtener(i);
            sucursalesP.set(i, obtener(minIndex));
            sucursalesP.set(minIndex,temp);
        }
    }
}

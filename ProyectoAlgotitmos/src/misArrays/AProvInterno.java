package misArrays;

import java.util.ArrayList;
import modelo.ProvInterno;

/**
 *
 * @author Omar Tc,yosse
 */
public class AProvInterno {
    
    private ArrayList <ProvInterno> interno;
    
    public AProvInterno() {
       interno=new ArrayList<ProvInterno>();
    }
    
    //Agregar ProvInterno
    public void agregarProvInterno(ProvInterno in){
        interno.add(in);
    }
    
    //Eliminar ProvInterno
    public void eliminarProvinterno(int nroProInter){
        interno.remove(nroProInter);
    }
    
    public ProvInterno obtener (int posicion){
        return interno.get(posicion);
    }
    
    public int tamañoArreglo(){
        return interno.size();
    }
    
    public void ordenarDniBurbujaMejorado(){
        int n= tamañoArreglo();
        boolean ICambio;
        
        for (int i = 0; i < n-1; i++) {
            ICambio=false;
            for (int j = 0; j < n-1; j++) {
                if (obtener(i).getDni()>obtener(j+1).getDni()) {
                    ProvInterno temp= obtener(j);
                    interno.set(j, obtener(j+1));
                    interno.set(j+1, temp);
                    ICambio=true;
                }
            }
            if (!ICambio) {
                break;
            }
        }        
    }    
}

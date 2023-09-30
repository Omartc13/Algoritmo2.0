package misArrays;

import java.util.ArrayList;
import modelo.ProvExterno;

/**
 *
 * @author Omar Tc,yosse
 */
public class AProvExterno {
    
    private ArrayList <ProvExterno> externo;

    public AProvExterno() {
        externo=new ArrayList<ProvExterno>();
    }
    
    //Agregar ProvedorExterno
    public void agregarProvExt(ProvExterno ex){
        externo.add(ex);
    }
    
    //Eliminar ProvedorExterno
    public void eliminarProvExt(int nroProvExt){
        externo.remove(nroProvExt);
    }
    
    public ProvExterno obtener(int posicion){
        return externo.get(posicion);
    }
    
    public int tamañoArreglo(){
        return externo.size();
    }
    
    public ProvExterno busquedaS(long Ruc){
        ProvExterno refc=null;
        boolean estado=false;
        int i=0;
        
        while (i<tamañoArreglo() && estado==false) {            
            if (obtener(i).getRUC()==Ruc) {
                estado=true;
                refc=obtener(i);
            }else{
                i++;
            }
        }
        return refc;
    }
    
    public void ordenarProPorTelf(){
        ProvExterno aux;
        
        for (int i = 0; i < tamañoArreglo()-1; i++) {
            for (int j = i+1; j < tamañoArreglo(); j++) {
                if (obtener(i).getTelefono()>obtener(j).getTelefono()) {
                    aux=obtener(i);
                    externo.set(i, obtener(j));
                    externo.set(j, aux);
                }
            }
        }
    }
    
    public ProvExterno busquedaB(int telf){
        ProvExterno refc=null;
        int izq,der,cen;
        boolean estado=false;
        
        izq=0;
        der=tamañoArreglo()-1;
        
        while (izq<=der &&estado==false) {            
            cen=(izq+der)/2;
            if (telf==obtener(cen).getTelefono()) {
                refc=obtener(cen);
                estado=true;
            }else if (telf<obtener(cen).getTelefono()) {
                der=cen-1;
            }else{
                izq=cen+1;
            }
        }
        return refc;
    }
}

package misArrays;

import java.util.ArrayList;
import modelo.EmpleAdmin;

/**
 *
 * @author Omar Tc,yosse
 */
public class AEmpleAdmin {
    
    private ArrayList <EmpleAdmin> administrador;
    
    public AEmpleAdmin(){
        administrador=new ArrayList<EmpleAdmin>();
    }
    
    //Agregar EmpleAdmin
    public void agregarAdmin(EmpleAdmin admin){
        administrador.add(admin);
    }
    
    //Eliminar EmpleAdmin
    public void eliminarAdmin(int nroadmin){
        administrador.remove(nroadmin);
    }
    
    public EmpleAdmin obtener (int posicion){
        return administrador.get(posicion);
    }
    
    public int tamañoArreglo(){
        return administrador.size();
    }
    
    public void ordenarDniBurbuja(){
        int n= tamañoArreglo();
        
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (obtener(j).getDNI()> obtener(j+1).getDNI()) {
                    EmpleAdmin temp=obtener(j);
                    administrador.set(j, obtener(j+1));
                    administrador.set(j+1, temp);
                }
            }
        }
    }
    
    public void QuickSort(){
        ordenarQuickSort(administrador, 0, tamañoArreglo()-1);
    }
    
    public void ordenarQuickSort(ArrayList<EmpleAdmin> lista, int primero, int ultimo){
        double pivot,temp;
        int i,j;
        
        pivot= obtener(ultimo).getSueldob();
        i=primero;
        j=ultimo;
        
        do{
            while (lista.get(i).getSueldob()<pivot) {                
                i++;
            }
            while (lista.get(j).getSueldob()>pivot) {                
                j--;
            }
            if (i<=j) {
                temp=lista.get(i).getSueldob();
                lista.get(i).setSueldob(lista.get(j).getSueldob());
                lista.get(j).setSueldob(temp);
                i++;
                j--;
            }
        }while (i<j);  
            
        if (primero<j) {
            ordenarQuickSort(lista, primero, j);
        }if (i<ultimo) {
            ordenarQuickSort(lista, i, ultimo);
        }
    }
    
}

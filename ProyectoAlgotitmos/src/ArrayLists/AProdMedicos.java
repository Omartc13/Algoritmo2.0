package ArrayLists;

import java.util.ArrayList;
import java.util.List;
import modelo.ProdMedicos;

/**
 *
 * @author Omar Tc, Yosse
 */
public class AProdMedicos {
    private ArrayList <ProdMedicos> medicina;

    public AProdMedicos() {
        medicina=new ArrayList<ProdMedicos>();
    }

    //agregar producto higiene
    public void agregarProductoH(ProdMedicos hig){
        medicina.add(hig);
    }
    
    //eliminar producto higiene
    public void eliminarProductoH(int nrohig){
        medicina.remove(nrohig);
    }
    
    public ProdMedicos obtener (int posicion){
        return medicina.get(posicion);
    }
    
    public int tamañoArreglo(){
        return medicina.size();
    }
    
    public void mergeSortCod(){
        mergeSortCod(0, tamañoArreglo()-1);
    }
    
    private void mergeSortCod(int izq, int der){
        if (izq<der) {
            int medio=(izq+der)/2;
            //Ordenar mitades de Izq y Der
            mergeSortCod(izq, medio);
            mergeSortCod(medio+1, der);
            //Conbinar mitades ordenadas
            mergeCod(izq, medio, der);
        }
    }
    
    private void mergeCod(int izquierda, int medio, int derecho){
        int n1= medio-izquierda+1;
        int n2= derecho-medio;
        
        //Listas Temporales 
        List<ProdMedicos> listaIzquierda= new ArrayList<>();
        List<ProdMedicos> listaDerecha= new ArrayList<>();
        
        //Copiar los datos a los Arrays nuevos
        
        for (int i = 0; i < n1; i++) {
            listaIzquierda.add(obtener(izquierda+i));
        }
        for (int j = 0; j < n2; j++) {
            listaDerecha.add(obtener(medio+1+j));
        }
        
        //Combinar los Arrays
        int i=0, j=0, k=izquierda;
        while (i<listaIzquierda.size() && j<listaDerecha.size()) {
            if (listaIzquierda.get(i).getCodigo() <= listaDerecha.get(j).getCodigo()) {
                medicina.set(k, listaIzquierda.get(i));
                i++;
            }else{
                medicina.set(k, listaDerecha.get(j));
                j++;
            }
            k++;
        }
        //Copiar los elementos restantes de der o izq si hay
        
        while (i<n1) {            
            medicina.set(k, listaIzquierda.get(i));
            i++;
            k++;
        }
        while (j<n2) {            
            medicina.set(k, listaDerecha.get(j));
            j++;
            k++;
        }
    }
    
    public void mergeSortNom(){
        mergeSortNom(0, tamañoArreglo()-1);
    }
    
    private void mergeSortNom(int izq, int der){
        if (izq<der) {
            int medio=(izq+der)/2;
            //Ordenar mitades de Izq y Der
            mergeSortNom(izq, medio);
            mergeSortNom(medio+1, der);
            //Conbinar mitades ordenadas
            mergeNom(izq, medio, der);
            
        }
    }
    
    private void mergeNom(int izquierda, int medio, int derecho){
        int n1= medio-izquierda+1;
        int n2= derecho-medio;
        
        //Listas Temporales 
        List<ProdMedicos> listaIzquierda= new ArrayList<>();
        List<ProdMedicos> listaDerecha= new ArrayList<>();
        
        //Copiar los datos a los Arrays nuevos
        
        for (int i = 0; i < n1; i++) {
            listaIzquierda.add(obtener(izquierda+i));
        }
        for (int j = 0; j < n2; j++) {
            listaDerecha.add(obtener(medio+1+j));
        }
        
        //Combinar los Arrays
        int i=0, j=0, k=izquierda;
        while (i<listaIzquierda.size() && j<listaDerecha.size()) {
            if (listaIzquierda.get(i).getNombre_producto().compareToIgnoreCase(listaDerecha.get(j).getNombre_producto()) <= 0) {
                medicina.set(k, listaIzquierda.get(i));
                i++;
            }else{
                medicina.set(k, listaDerecha.get(j));
                j++;
            }
            k++;
        }
        //Copiar los elementos restantes de der o izq si hay
        
        while (i<n1) {            
            medicina.set(k, listaIzquierda.get(i));
            i++;
            k++;
        }
        while (j<n2) {            
            medicina.set(k, listaDerecha.get(j));
            j++;
            k++;
        }
    }
}

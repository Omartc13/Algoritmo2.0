package misArrays;

import java.util.ArrayList;
import java.util.List;
import modelo.ProdComestibles;

/**
 *
 * @author Omar Tc, Yosse
 */
public class AProdComestible {
    private ArrayList <ProdComestibles> comida;

    public AProdComestible() {
        comida=new ArrayList<ProdComestibles>();
    }

    //agregar ProductoComida
    public void agregarProductoC(ProdComestibles com){
        comida.add(com);
    }
    
    //eliminar ProductoComida
    public void eliminarProductoC(int nrocom){
        comida.remove(nrocom);
    }
    
    public ProdComestibles obtener (int posicion){
        return comida.get(posicion);
    }
    
    public int tamañoArreglo(){
        return comida.size();
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
        List<ProdComestibles> listaIzquierda= new ArrayList<>();
        List<ProdComestibles> listaDerecha= new ArrayList<>();
        
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
                comida.set(k, listaIzquierda.get(i));
                i++;
            }else{
                comida.set(k, listaDerecha.get(j));
                j++;
            }
            k++;
        }
        //Copiar los elementos restantes de der o izq si hay
        
        while (i<n1) {            
            comida.set(k, listaIzquierda.get(i));
            i++;
            k++;
        }
        while (j<n2) {            
            comida.set(k, listaDerecha.get(j));
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
        List<ProdComestibles> listaIzquierda= new ArrayList<>();
        List<ProdComestibles> listaDerecha= new ArrayList<>();
        
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
                comida.set(k, listaIzquierda.get(i));
                i++;
            }else{
                comida.set(k, listaDerecha.get(j));
                j++;
            }
            k++;
        }
        //Copiar los elementos restantes de der o izq si hay
        
        while (i<n1) {            
            comida.set(k, listaIzquierda.get(i));
            i++;
            k++;
        }
        while (j<n2) {            
            comida.set(k, listaDerecha.get(j));
            j++;
            k++;
        }
    }
}

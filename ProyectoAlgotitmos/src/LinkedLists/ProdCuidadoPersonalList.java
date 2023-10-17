package LinkedLists;

import misCAbstractas.Nodo;
import modelo.ProdCuidadoPersonal;

/**
 *
 * @author Omar Tc
 */
public class ProdCuidadoPersonalList {
    private Nodo inicio,fin;
    private ProdCuidadoPersonal cuid;
    
    public ProdCuidadoPersonalList() {
        inicio=null;
        fin=null;
    }
    
    public void agregarInicio(ProdCuidadoPersonal dato) { 
        inicio = new Nodo(dato, inicio);
        if (fin==null){
            fin=inicio;
        }else{
            Nodo temp=inicio;
            Nodo nuevo = new Nodo(dato);
            nuevo.enlazarNextNodo(temp);
            inicio=nuevo;
        }
        System.out.println("Elemento agregado al inicio de la lista: " + dato);
    }
    
    public void agregarFinal(ProdCuidadoPersonal dato) {
        if (estaVacio()) {
            inicio = fin = new Nodo(dato);
        }
        else {
            fin.setNextNodo(new Nodo(dato));
            fin = fin.getNextNodo();
        }
        System.out.println("Elemento agregado al final de la lista: " + dato);
    }
    
    public void eliminarPrimero(){
        inicio=inicio.getNextNodo();
    }
    
    public ProdCuidadoPersonal obtener(int index){
        int contador=0;
        Nodo temporal=inicio;
        while (contador<index) {            
            temporal=temporal.getNextNodo();
            contador++;
        }
        System.out.println("Elemento obtenido de la lista: " + temporal.getDato());
        return (ProdCuidadoPersonal) temporal.getDato();
    }
    
    //Verifica si la lista esta vacia;
    public boolean estaVacio() {
        return (inicio == null);
    }
    
}

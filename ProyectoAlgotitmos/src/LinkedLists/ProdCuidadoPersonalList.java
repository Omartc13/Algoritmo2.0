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
    
    Nodo nodoCui= new Nodo(cuid);
    
    public ProdCuidadoPersonalList() {
        inicio=null;
        fin=null;
    }
    
    public void agregarInicio(ProdCuidadoPersonal dato) { 
        inicio = new Nodo(dato, inicio);
        if (fin==null){
            fin=inicio;
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
        if (inicio!=null) {
            Object c = inicio.getDato();
            if (inicio==fin) {
                inicio=null;
                fin=null;
            }else{
                inicio=inicio.getNextNodo();
            }
            System.out.println("Elemento eliminado ---> "+c);
        }else{
            if (estaVacio()==true) {
                System.out.println("Lista vacia");
            }
        }
    }
    
    public void eliminarFin(){
        if (!estaVacio()) {
            if (inicio==fin) {
                inicio=fin=null;
            }else{
                Nodo temp= inicio;
                Nodo prev=null;
                while (temp.getNextNodo()!=null) {
                    prev=temp;
                    temp=temp.getNextNodo();
                }
                prev.setNextNodo(null);
            fin = prev;
            }
            System.out.println("Elemento eliminado al final de la lista");
        }else{
            System.out.println("La lista está vacia");
        }
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
    
    
    public void mostrar(){
        Nodo actual=inicio;
        System.out.println("Elementos");
        while (actual!=null) {
            System.out.println(actual.getDato().toString());
            actual=actual.getNextNodo();
        }
        System.out.println("");
    }
    
    //Verifica si la lista esta vacia;
    public boolean estaVacio() {
        return (inicio == null);
    }
}

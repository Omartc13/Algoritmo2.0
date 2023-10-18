
package LinkedLists;

import modelo.Sucursales;
import misCAbstractas.Nodo;


public class SucursalesList {
    
        private Nodo inicio, fin;
        
        public SucursalesList(){
        this.inicio= null;
        this.fin= null;
    }
        
    public boolean estaVacio() {
        return (inicio == null);
    } 
    
    
    public void agregarInicio(Sucursales dato) { 
        inicio = new Nodo(dato, inicio);
        if (fin==null){
            fin=inicio;
        }
    }

    public void agregarFinal(Sucursales dato) {
        if (estaVacio()) {
            inicio = fin = new Nodo(dato);
        }
        else {
            fin.setNextNodo(new Nodo(dato));
            fin = fin.getNextNodo();
        }
    }
    
        public Sucursales quitarPila() {
        if (estaVacio()) {
            throw new IllegalStateException("La pila está vacía.");
        }

        Sucursales dato = (Sucursales) fin.getDato();
        fin = fin.getNextNodo();
        return dato;
    }
    
    public void mostrarElementos() {
        Nodo elemento = fin;
        System.out.println("Elementos en la pila:");
        while (elemento != null) {
            System.out.println("-->" + elemento.getDato());
            elemento = elemento.getNextNodo();
        }
        System.out.println();
    }
     

    
}


package misCAbstractas;


public class Nodo {
    private Object dato;
    private Nodo nextNodo;
    
    public Nodo(Object dato) {
        this.dato = dato;
        this.nextNodo = null;
    }
    
    public Nodo(Object dato, Nodo nextNodo) { 
        this.dato = dato;
        this.nextNodo= nextNodo;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getNextNodo() {
        return nextNodo;
    }

    public void setNextNodo(Nodo nextNodo) {
        this.nextNodo = nextNodo;
    }
    
    
}

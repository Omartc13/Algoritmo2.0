
package misCAbstractas;

import modelo.Sucursales;


public class NodoPila {
   
    private Object dato;
    private NodoPila nextNodo;

    public NodoPila(Object dato) {
        this.dato = dato;
        this.nextNodo=null;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoPila getNextNodo() {
        return nextNodo;
    }

    public void setNextNodo(NodoPila nextNodo) {
        this.nextNodo = nextNodo;
    }
    
}
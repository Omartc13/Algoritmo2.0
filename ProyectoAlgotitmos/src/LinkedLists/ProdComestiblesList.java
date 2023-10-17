package LinkedLists;

import misCAbstractas.Nodo;
import modelo.ProdComestibles;

/**
 *
 * @author Omar Tc
 */
public class ProdComestiblesList {
    private Nodo inicio,fin;

    public ProdComestiblesList() {
        inicio=null;
        fin=null;
    }
    
    public void agregarInicio(ProdComestibles dato) { 
        inicio = new Nodo(dato, inicio);
        if (fin==null){
            fin=inicio;
        }
    }
    
    public void agregarFinal(ProdComestibles dato) {
        if (estaVacio()) {
            inicio = fin = new Nodo(dato);
        }
        else {
            fin.setNextNodo(new Nodo(dato));
            fin = fin.getNextNodo();
        }
    }
    
    public void mostrarElementos () {
        Nodo elemento = inicio;
        System.out.println();
        while (elemento!=null) {
                System.out.println("-->"+ elemento.getDato());
            elemento = elemento.getNextNodo();
        }
        System.out.println();
    }
    
    public boolean estaVacio() {
        return (inicio == null);
    }
    
    
}

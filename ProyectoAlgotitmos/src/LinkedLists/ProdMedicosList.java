package LinkedLists;

import misCAbstractas.Nodo;
import modelo.ProdMedicos;

/**
 *
 * @author Omar Tc
 */
public class ProdMedicosList {
    private Nodo inicio, fin;

    public ProdMedicosList() {
        inicio=null;
        fin=null;
    }
    
    public void agregarInicio(ProdMedicos dato) { 
        inicio = new Nodo(dato, inicio);
        if (fin==null){
            fin=inicio;
        }
    }
    
    public void agregarFinal(ProdMedicos dato) {
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

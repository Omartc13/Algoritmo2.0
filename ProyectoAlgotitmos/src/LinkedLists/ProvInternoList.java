package LinkedLists;

import misCAbstractas.Nodo;
import modelo.ProvInterno;
import modelo.Sucursales;

/**
 *
 * @author Omar Tc
 */
public class ProvInternoList {

    private Nodo inicio, fin;
    private ProvInterno provin;
    private int nElementos;

    public ProvInternoList() {
        inicio = null;
        fin = null;
        this.nElementos = 0;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public int getnElementos() {
        return nElementos;
    }

    public void setnElementos(int nElementos) {
        this.nElementos = nElementos;
    }

    public void insertarCola(ProvInterno dato) {
        Nodo nuevo = new Nodo(dato);

        if (inicio == null) {
            inicio = fin = nuevo;
        } else {
            fin.setNextNodo(nuevo);
            fin = fin.getNextNodo();
        }
        nElementos++;
    }

    public void QuitardelaCola() {

        if (ColaVacia()) {
            System.out.println("La cola está vacia");
        }

        Object dato = inicio.getDato();
        inicio = inicio.getNextNodo();
        nElementos--;
        System.out.println("Elemento eliminado -->" + dato);
    }

    public void mostar() {
        Nodo actual = inicio;
        if (ColaVacia()) {
            System.out.println("Cola Vacia.....");
        } else {
            System.out.println("Elementos en Cola:");
            while (actual != null) {
                System.out.println(actual.getDato().toString());
                actual = actual.getNextNodo();
            }
            System.out.println("");
        }
    }

    public boolean ColaVacia() {
        return (inicio == null);
    }

}

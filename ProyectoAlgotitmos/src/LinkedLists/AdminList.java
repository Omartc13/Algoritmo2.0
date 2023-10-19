
package LinkedLists;

import javax.swing.JOptionPane;
import modelo.Admin;
import misCAbstractas.Nodo;


public class AdminList {
        private Nodo inicio, fin;
    
    public AdminList() {
        inicio = null;
        fin = null;
    }
    
    public void agregarInicio(Admin dato) { 
        inicio = new Nodo(dato, inicio);
        if (fin==null){
            fin=inicio;
        }
    }
    
    public void agregarFinal(Admin dato) {
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
                System.out.println(elemento.getDato().toString());
            elemento = elemento.getNextNodo();
        }
        System.out.println();
        
        if(estaVacio()==true) {
            System.out.println("Lista vacía");
            JOptionPane.showMessageDialog(null, "Lista vacía.");
        }
    }
    
    public boolean estaVacio() {
        return (inicio == null);
    }
    
    public void eliminarPrimero() {
        if (inicio!=null) {
            Object elemento = inicio.getDato();
            if (inicio==fin) {
                inicio=null;
                fin=null;
            }else{
                inicio=inicio.getNextNodo();
            }
            System.out.println("Elemento eliminado ---> "+elemento);
        }else{
            if (estaVacio()==true) {
                System.out.println("Lista vacía.");
               JOptionPane.showMessageDialog(null, "Lista vacía.");
            }
        }
    }
    
    public void eliminarFin() {
        if (!estaVacio()) {
            if (inicio==fin) {
                inicio=fin=null;
            } else {
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
            System.out.println("Lista vacia");
            JOptionPane.showMessageDialog(null, "Lista vacía.");
        }
    }
    
    
}

package LinkedLists;
import javax.swing.JOptionPane;
import misCAbstractas.NodoPila;
import modelo.Sucursales;
import misCAbstractas.Nodo;


public class SucursalesList {
   private NodoPila inicio;
   private int numElementos;
   
    public SucursalesList() {
        this.inicio = null;
        this.numElementos=0;
    }
  
    public void setInicio(NodoPila inicio) {
        this.inicio = inicio;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }
    
    
    
    public void insertarPila(Sucursales dato) {
        NodoPila nuevoNodo = new NodoPila(dato);
        nuevoNodo.setNextNodo(inicio);
        inicio = nuevoNodo;
        numElementos++;
    }
    
    public void eliminarPila() {
        Object elemento = null;
        if (inicio!=null) {
            elemento =  inicio.getDato();
            System.out.println("Objeto eliminado de la pila");
            inicio = inicio.getNextNodo();
            numElementos--;
            JOptionPane.showMessageDialog(null, "Objeto eliminado de la pila.");
        }
        else {
            System.out.println("Pila vacia.");
            JOptionPane.showMessageDialog(null, "Pila vacia.");
        }
    }
    
}

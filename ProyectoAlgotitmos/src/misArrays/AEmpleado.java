package misArrays;

import java.util.ArrayList;
import modelo.Empleado;

/**
 *
 * @author yosse,Omar Tc
 */
public class AEmpleado {
    private ArrayList <Empleado> empleados;

    public AEmpleado() {
        empleados=new ArrayList<Empleado>();
    }

    //agregar empleado
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void eliminarEmpleado(int nroemple){
        empleados.remove(nroemple);
    }
    
    public Empleado obtener (int posicion){
        return empleados.get(posicion);
    }
    
    public int tamañoArreglo(){
        return empleados.size();
    }
    
    public void QuickSort(){
        ordenarQuickSort(empleados, 0, tamañoArreglo()- 1);
    }
    
    public void ordenarQuickSort(ArrayList<Empleado> lista, int primero, int ultimo){
         double pivot, temp;
         int i, j;
         pivot = lista.get(ultimo).getSueldob();
         i = primero;
         j = ultimo;
        do{
            while (lista.get(i).getSueldob()< pivot) {
                i++;
            }
            while (lista.get(j).getSueldob()> pivot) {
                j--;
            }
            if (i <= j) {
                temp = lista.get(i).getSueldob();
                lista.get(i).setSueldob(lista.get(j).getSueldob());
                lista.get(j).setSueldob(temp);
                i++;
                j--;
            }
        } while (i < j);
        
        if (primero < j) {
        ordenarQuickSort(lista, primero, j); // Corregir los argumentos aquí
        }
        if (i < ultimo) {
        ordenarQuickSort(lista, i, ultimo); // Corregir los argumentos aquí
            }
        }
    
    
}

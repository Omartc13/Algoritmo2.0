package misCGenericas;

/**
 *
 * @author Omar Tc
 */
public class Generico1<T1,T2> {
    private T1 dato1;
    private T2 dato2;

    public Generico1(T1 dato1, T2 dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public T1 getDato1() {
        return dato1;
    }

    public T2 getDato2() {
        return dato2;
    }

    public double multiplicar(){
        //es una condición que verifica si tanto dato1 como dato2 son instancias de la clase Number
        if (dato1 instanceof Number && dato2 instanceof Number) {
            double num1 = ((Number) dato1).doubleValue();
            double num2 = ((Number) dato2).doubleValue();
            return Math.round((num1 * num2+0.18*num1*num2)*100)/100.0;
        } else {
            throw new UnsupportedOperationException("Los tipos de dato1 y dato2 no son numéricos.");
        }
    }
    
    
    
}

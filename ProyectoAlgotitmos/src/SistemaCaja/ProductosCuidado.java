package SistemaCaja;

import java.util.ArrayList;

public class ProductosCuidado {

    private String id;
    private String nombre;
    private double precio;

    public ProductosCuidado(String id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public class CuidadoPersonal{

        public static ArrayList<ProductosCuidado> obtenerCuidado() {

            ArrayList<ProductosCuidado> listaCuidado = new ArrayList<>();

        listaCuidado.add(new ProductosCuidado("P031", "Shampoo de Hierbas", 5.50));
        listaCuidado.add(new ProductosCuidado("P032", "Crema Hidratante de Aloe Vera", 8.00));
        listaCuidado.add(new ProductosCuidado("P033", "Jabón de Rosa Mosqueta", 3.20));
        listaCuidado.add(new ProductosCuidado("P034", "Desodorante de Lima", 4.20));
        listaCuidado.add(new ProductosCuidado("P035", "Colonia de Lavanda", 7.50));
        listaCuidado.add(new ProductosCuidado("P036", "Cepillo de Dientes de Bambú", 2.80));
        listaCuidado.add(new ProductosCuidado("P037", "Mascarilla Capilar de Maca", 6.30));
        listaCuidado.add(new ProductosCuidado("P038", "Dentífrico de Menta", 3.00));
        listaCuidado.add(new ProductosCuidado("P039", "Aceite Esencial de Eucalipto", 9.10));
        listaCuidado.add(new ProductosCuidado("P040", "Toallas Higiénicas de Algodón Orgánico", 4.80));
        listaCuidado.add(new ProductosCuidado("P041", "Gel de Ducha de Maracuyá", 6.70));
        listaCuidado.add(new ProductosCuidado("P042", "Bálsamo Labial de Coco", 2.50));
        listaCuidado.add(new ProductosCuidado("P043", "Loción Corporal de Vainilla", 7.80));
        listaCuidado.add(new ProductosCuidado("P044", "Cuchilla de Afeitar de Bambú", 5.00));
        listaCuidado.add(new ProductosCuidado("P045", "Cepillo de Pelo de Madera", 4.50));

        return listaCuidado;
        }
    }
}

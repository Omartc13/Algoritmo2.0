package SistemaCaja;

import java.util.ArrayList;

public class ProductosMedicos {

    private String id;
    private String nombre;
    private double precio;

    public ProductosMedicos(String id, String nombre, double precio) {
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

    public class Medicinas{

        public static ArrayList<ProductosMedicos> obtenerMedicinas() {

            ArrayList<ProductosMedicos> listaProductos = new ArrayList<>();

            listaProductos.add(new ProductosMedicos("P001", "Paracetamol", 5.00));
            listaProductos.add(new ProductosMedicos("P002", "Ibuprofeno", 7.00));
            listaProductos.add(new ProductosMedicos("P003", "Vendaje Elástico", 3.00));
            listaProductos.add(new ProductosMedicos("P004", "Termómetro Digital", 12.50));
            listaProductos.add(new ProductosMedicos("P005", "Gasas Estériles", 4.00));
            listaProductos.add(new ProductosMedicos("P006", "Jeringa de Insulina", 9.00));
            listaProductos.add(new ProductosMedicos("P007", "Vitamina C (100 tabletas)", 8.50));
            listaProductos.add(new ProductosMedicos("P008", "Antiséptico en Spray", 6.20));
            listaProductos.add(new ProductosMedicos("P009", "Tijeras de Vendaje", 5.40));
            listaProductos.add(new ProductosMedicos("P010", "Apósito Adhesivo", 2.30));
            listaProductos.add(new ProductosMedicos("P011", "Colirio Lubricante", 10.00));
            listaProductos.add(new ProductosMedicos("P012", "Mascarilla Quirúrgica (paquete de 50)", 15.00));
            listaProductos.add(new ProductosMedicos("P013", "Pomada Antibiótica", 7.50));
            listaProductos.add(new ProductosMedicos("P014", "Tensiómetro Digital", 29.90));
            listaProductos.add(new ProductosMedicos("P015", "Férula para Dedo", 4.00));

            return listaProductos;
        }
    }
    
    
}

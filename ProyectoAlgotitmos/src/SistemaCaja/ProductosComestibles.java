package SistemaCaja;

import java.util.ArrayList;

public class ProductosComestibles {

    private String id;
    private String nombre;
    private double precio;

    public ProductosComestibles(String id, String nombre, double precio) {
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

    public class Comestibles {

        public static ArrayList<ProductosComestibles> obtenerComestibles() {

            ArrayList<ProductosComestibles> listaGolosinas = new ArrayList<>();

            listaGolosinas.add(new ProductosComestibles("P016", "Chocolate", 2.5));
            listaGolosinas.add(new ProductosComestibles("P017", "Alfajor", 1.8));
            listaGolosinas.add(new ProductosComestibles("P018", "Chocotejas", 3.0));
            listaGolosinas.add(new ProductosComestibles("P019", "Turron", 2.2));
            listaGolosinas.add(new ProductosComestibles("P020", "Cocadas", 1.5));
            listaGolosinas.add(new ProductosComestibles("P021", "Manjar Blanco", 2.8));
            listaGolosinas.add(new ProductosComestibles("P022", "Galletas de Maiz", 1.2));
            listaGolosinas.add(new ProductosComestibles("P023", "Bon o Bon", 2.0));
            listaGolosinas.add(new ProductosComestibles("P024", "Sublime", 1.7));
            listaGolosinas.add(new ProductosComestibles("P025", "Besos de Moza", 1.4));
            listaGolosinas.add(new ProductosComestibles("P026", "Galletas de Avena", 1.9));
            listaGolosinas.add(new ProductosComestibles("P027", "Turrón de Doña Pepa", 3.5));
            listaGolosinas.add(new ProductosComestibles("P028", "Chocolate Blanco", 2.3));
            listaGolosinas.add(new ProductosComestibles("P029", "Chifles", 1.0));
            listaGolosinas.add(new ProductosComestibles("P030", "Lentejitas", 2.1));

            return listaGolosinas;
        }
    }
}

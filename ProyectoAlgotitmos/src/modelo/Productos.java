package modelo;

/**
 *
 * @author Omar Tc, yosse
 */
public class Productos {
    
    private String nombre_producto;
    private int codigo;
    private Long RucProveedor;
    private String tipo;
    private double precio;
    private int stock;
    private double result;

    public Productos(String nombre_producto, int codigo, Long RucProveedor, String tipo, double precio, int stock, double result) {
        this.nombre_producto = nombre_producto;
        this.codigo = codigo;
        this.RucProveedor = RucProveedor;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
        this.result = result;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Long getRucProveedor() {
        return RucProveedor;
    }

    public void setRucProveedor(Long RucProveedor) {
        this.RucProveedor = RucProveedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public String detalleProducto(){
        return "...";
    }
}

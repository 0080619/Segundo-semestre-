package POO.semana5;
// atributo 
public class Ventas {
    private String producto;
    private String nombre;
    private String codigo;
    private double precio;
    private int stock;

// constructor
    public Ventas(String producto, String nombre, String codigo, double precio, int stock) {
        this.producto = producto;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }
// setter y getter    
public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
 // metodo vender
 public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada. Stock restante: " + stock);
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }
 // metodo reabastecer
 public void reabastecer(int cantidad) {
    stock+= cantidad;    
    System.out.println("Reabastecimiento realizado. Stock actual: " + stock);
    }
 // metodo calacular valor inventario 
 public double calacularInventario() {
    return precio * stock;
 }    
 public String toString() { 
        return "Ventas [producto=" + producto + ", nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", stock=" + stock + "]";   
    }
 
}   


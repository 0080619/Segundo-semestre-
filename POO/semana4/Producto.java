public class Producto {
    // atributos
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;
 
    // constructor
    public Producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
 
    public String toString() {
        return "Producto [ codigo: " + codigo + " nombre: " + nombre +
                " precio: " + precio + " cantidad: " + cantidad + "]";
    }
 
    // creacion de metodos
    public void agregarStock(int unidades) {
        if (unidades > 0) {
            cantidad += unidades;
            System.out.println("Se agregaron " + unidades + " unidades de " + nombre);
        }
    }
    public void retirarStock(int unidades) {
        if (unidades > 0 && unidades <= cantidad) {
            cantidad -= unidades;
            System.out.println("Se retiraron " + unidades + " unidades de " + nombre);
        } else {
            System.out.println("No se puede retirar esa cantidad de " + nombre);
        }
    }
    public double calcularValorTotal() {
        return precio * cantidad;
    }
}
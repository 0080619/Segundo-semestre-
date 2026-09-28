public class Vehiculo {
    // atributos
    private String marca;
    private String modelo;
    private int anio;
    private double precio;
    private boolean disponible;

    // constructor
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.disponible = true;
    }

    public String toString() {
        return "Vehiculo [ marca:" + marca + " modelo: " + modelo + " anio: " + anio +
                " precio: " + precio + " disponible: " + disponible + "]";
    }

    // creacion de metodos
    // vender: si esta disponible se confirma, si no se deniega
    public void vender() {
        if (disponible) {
            disponible = false;
            System.out.println("Venta confirmada: " + marca + " " + modelo + " por " + precio);
        } else {
            System.out.println("Venta denegada: " + marca + " " + modelo + " no esta disponible");
        }
    }

}
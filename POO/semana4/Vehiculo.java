public class Vehiculo {
        // atributos
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    // constructor
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String toString() {
        return "Vehiculo [ marca:" + marca + " modelo: " + modelo + " anio: " + anio +
                " precio: " + precio + "]";
    }

    // creacion de metodos
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: " + precio);
    }

}

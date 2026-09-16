public class Vehiculo {
    String modelo;
    String marca;
    int año;
    String categoria;
    String color;
    double peso;

    public void mostrarInformacion() {
        System.out.println("Modelo:" + modelo);
        System.out.println("Marca:" + marca);
        System.out.println("Año:" + año);
        System.out.println("Categoria:" + categoria);
        System.out.println("Color:" + color);
        System.out.println("Peso:" + peso);
    }
}

public class Pelicula {
    String titulo;
    String genero;
    double duracion;
    String fechaEstreno;

    public void mostrarInformacion() {
        System.out.println("Titulo:" + titulo);
        System.out.println("Genero:" + genero);
        System.out.println("Duracion:" + duracion);
        System.out.println("Fecha de Estreno:" + fechaEstreno);
    }
}
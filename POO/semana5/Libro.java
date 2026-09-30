package POO.semana5;

public class Libro {
    // atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponibilidad;
    // constructor
    public Libro(String isbn, String titulo, String autor, int anioPublicacion, boolean disponibilidad) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponibilidad = disponibilidad;
    }
    //getter y setter
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    // metodo prestar
    public void prestar() { 
        disponibilidad = false;   
    }
    public void devolver() { 
        disponibilidad = true;   
        
    }
    public boolean estaDisponible() { 
        return disponibilidad;   
    }
    public String toString() { 
        return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", anioPublicacion="
                + anioPublicacion + ", disponibilidad=" + disponibilidad + "]";   
    }

}   

package POO.semana5;

public class MainLibro {
    public static void main(String[] args) {
        // creacion de los 5 libros
        Libro libro1 = new Libro("978-0-123456-47-2", "El principito", "Antoine de Saint-Exupéry", 1943, true);
        Libro libro2 = new Libro("978-0-123456-48-9", "Don Quijote de la Mancha", "Miguel de Cervantes", 1605, true);
        Libro libro3 = new Libro("978-0-123456-49-6", "Cien años de soledad", "Gabriel García Márquez", 1967, true);
        Libro libro4 = new Libro("978-0-123456-50-2", "Rayuela", "Julio Cortázar", 1963, true);
        Libro libro5 = new Libro("978-0-123456-51-9", "La sombra del viento", "Carlos Ruiz Zafón", 2001, true);
      
        // mostrar los libros
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());
        System.out.println(libro5.toString());
        
        // mostrar solo nombre de libro2
        System.out.println("Nombre del libro 2: " + libro2.getTitulo());
        // cambiar el isbn del libro 5
        libro5.setIsbn("000-000");
        System.out.println("Nuevo ISBN del libro 5: " + libro5.getIsbn());
        // verificar si el libro 3 esta disponible
        System.out.println("El libro 3 esta disponible: " + libro3.estaDisponible()); // true

        // prestar el libro 3
        libro3.prestar();
        System.out.println("El libro 3 esta disponible: " + libro3.estaDisponible()); // false
        // devolver libro3
        libro3.devolver();
        System.out.println("El libro 3 esta disponible: " + libro3.estaDisponible());
    }
}
// proxima clase revisar el tema de los arreglo y concepto de herencia 
package POO.semana5;

public class MainMatriculaCurso {
    public static void main(String[] args) {
    // creacion de 5 matriculas (estudiantes)
        Matricula mat1 = new Matricula("Maria Puentes", "1005123456", 19, "maria@campusucc.edu.co", "Ingenieria de Sistemas", 2);
        Matricula mat2 = new Matricula("Juan Perez", "1002345678", 17, "juan@campusucc.edu.co", "Derecho", 1);
        Matricula mat3 = new Matricula("Laura Gomez", "1098765432", 22, "laura@campusucc.edu.co", "Medicina", 5);
        Matricula mat4 = new Matricula("Carlos Ruiz", "1012345098", 20, "carlos@campusucc.edu.co", "Arquitectura", 12);
        Matricula mat5 = new Matricula("Ana Torres", "1087654321", 18, "ana@campusucc.edu.co", "Psicologia", 3);
 
        // creacion de 3 cursos
        Curso curso1 = new Curso("POO101", "Programacion Orientada a Objetos", 3, "Prof. Martinez", 30);
        Curso curso2 = new Curso("BD201", "Bases de Datos", 4, "Prof. Lopez", 25);
        Curso curso3 = new Curso("MAT101", "Calculo Diferencial", 4, "Prof. Rojas", 20);
 
        // mostrar la informacion de todos los objetos
        System.out.println("===== MATRICULAS =====");
        System.out.println(mat1.toString());
        System.out.println(mat2.toString());
        System.out.println(mat3.toString());
        System.out.println(mat4.toString());
        System.out.println(mat5.toString());
 
        System.out.println("\n===== CURSOS =====");
        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(curso3.toString());
        
        System.out.println("\n===== MOSTRAR INFORMACION DE UN CURSO =====");
        curso1.mostrarInformacion();
 
        // probar los metodos de comportamiento (casos validos)
        System.out.println(mat1.getNombre() + " es mayor de edad: " + mat1.esMayorDeEdad(false)); 
        System.out.println(mat2.getNombre() + " es mayor de edad: " + mat2.esMayorDeEdad(false)); 
        mat1.avanzarSemestre();
        System.out.println("Hay cupo en " + curso1.getNombre() + " con 10 matriculados: " + curso1.tieneCupo(10)); 
        System.out.println("Hay cupo en " + curso1.getNombre() + " con 30 matriculados: " + curso1.tieneCupo(30)); 
        
        // modificar informacion con setters (casos validos)
        
        mat5.setPrograma("Administracion de Empresas");
        mat5.setEdad(19);
        mat5.setSemestre(4);
        System.out.println(mat5.toString());
        curso2.setDocente("Prof. Herrera");
        curso2.setCupoMaximo(35);
        curso2.setCreditos(3);
        System.out.println(curso2.toString());  
        
    }
}
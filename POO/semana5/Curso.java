package POO.semana5;

public class Curso {
    // atributos
    private String codigo;
    private String nombre;
    private int creditos;
    private String docente;
    private int cupoMaximo;
 
    // constructor
    public Curso(String codigo, String nombre, int creditos, String docente, int cupoMaximo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.docente = docente;
        this.cupoMaximo = cupoMaximo;
    }
 
    // getters y setters (los setters validan con if / else)
    public String getCodigo() {
        return codigo;
    }
 
    public void setCodigo(String codigo) {
        if (codigo==("")) {
            System.out.println("El codigo no puede estar vacio.");
        } else {
            this.codigo = codigo;
        }
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        if (nombre==("")) {
            System.out.println("El nombre del curso no puede estar vacio.");
        } else {
            this.nombre = nombre;
        }
    }
 
    public int getCreditos() {
        return creditos;
    }
 
    public void setCreditos(int creditos) {
        if (creditos >= 1 && creditos <= 6) {
            this.creditos = creditos;
        } else {
            System.out.println("Los creditos deben estar entre 1 y 6.");
        }
    }
 
    public String getDocente() {
        return docente;
    }
 
    public void setDocente(String docente) {
        if (docente==("")) {
            System.out.println("El docente no puede estar vacio.");
        } else {
            this.docente = docente;
        }
    }
 
    public int getCupoMaximo() {
        return cupoMaximo;
    }
 
    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo > 0 && cupoMaximo <= 50) {
            this.cupoMaximo = cupoMaximo;
        } else {
            System.out.println("El cupo maximo debe ser un valor entre 1 y 50.");
        }
    }
    //metodos 
    public void mostrarInformacion() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Creditos: " + creditos);
        System.out.println("Docente: " + docente);
        System.out.println("Cupo Maximo: " + cupoMaximo);
    }
    public boolean tieneCupo(int estudiantesMatriculados) {
        return estudiantesMatriculados < cupoMaximo;

    }
    public String toString() {
        return "Curso [codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", docente=" + docente
                + ", cupoMaximo=" + cupoMaximo + "]";
    }
}

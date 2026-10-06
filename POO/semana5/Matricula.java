package POO.semana5;

public class Matricula {
     // atributos
    private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private String programa;
    private int semestre;
 
    // constructor
    public Matricula(String nombre, String documento, int edad, String correo, String programa, int semestre) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.programa = programa;
        this.semestre = semestre;
    }

    // getter y setter(los setters validan con if / else)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacio.");
        } else {
            this.nombre = nombre;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento == null || documento.trim().isEmpty()) {
            System.out.println("El documento no puede estar vacio.");
        } else {
            this.documento = documento;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 15 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe estar entre 15 y 100.");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || correo.trim().isEmpty()) {
            System.out.println("El correo no puede estar vacio.");
        } else {
            this.correo = correo;
        }
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        if (programa == null || programa.trim().isEmpty()) {
            System.out.println("El programa no puede estar vacio.");
        } else {
            this.programa = programa;
        }
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        if (semestre >= 1 && semestre <= 12) {
            this.semestre = semestre;
        } else {
            System.out.println("El semestre debe estar entre 1 y 12.");
        }
    }

    // metodos de comportamiento
    public void avanzarSemestre() {
        if (semestre < 12) {
            semestre++;
            System.out.println("El estudiante ha avanzado al semestre " + semestre);
        } else {
            System.out.println("El estudiante ya está en el último semestre.");
        }
    }

    public boolean esMayorDeEdad(boolean mayorDeEdad) {
        return mayorDeEdad = edad >= 18;
    }
    public String toString() {
        return "Matricula [nombre=" + nombre + ", documento=" + documento + ", edad=" + edad + ", correo=" + correo
                + ", programa=" + programa + ", semestre=" + semestre + "]";
    }
}

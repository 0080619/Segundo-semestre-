package POO.semana5;

public class Cliente {
    // atributos
    private String nombre;
    private String documento;
    private int edad;
    private String correo;
    private int puntos; // puntos de fidelizacion

    // constructor
    public Cliente(String nombre, String documento, int edad, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.correo = correo;
        this.puntos = 0; // todo cliente nuevo empieza sin puntos
    }

    // getters y setters (los setters validan con if / else)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre==("")) {
            System.out.println("El nombre no puede estar vacio.");
        } else {
            this.nombre = nombre;
        }
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if (documento==("")) {
            System.out.println("El documento no puede estar vacio.");
        } else {
            this.documento = documento;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 1 && edad <= 110) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe estar entre 1 y 110.");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo ==("")) {
            System.out.println("El correo no puede estar vacio.");
        } else {
            this.correo = correo;
        }
    }

    // los puntos solo tienen getter: cambian unicamente con sumarPuntos y usarPuntos
    public int getPuntos() {
        return puntos;
    }

    // metodos de comportamiento
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void sumarPuntos(int cantidad) {
        if (cantidad > 0) {
            puntos += cantidad;
            System.out.println(nombre + " suma " + cantidad + " puntos. Total: " + puntos);
        } else {
            System.out.println("La cantidad de puntos debe ser mayor que cero.");
        }
    }

    public void usarPuntos(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad de puntos debe ser mayor que cero.");
        } else if (cantidad > puntos) {
            System.out.println(nombre + " no tiene puntos suficientes (tiene " + puntos + ").");
        } else {
            puntos -= cantidad;
            System.out.println(nombre + " uso " + cantidad + " puntos. Le quedan: " + puntos);
        }
    }

    // cliente frecuente: 100 puntos o mas
    public boolean esClienteFrecuente() {
        return puntos >= 100;
    }

    public String toString() {
        return "Cliente [nombre=" + nombre + ", documento=" + documento + ", edad=" + edad
                + ", correo=" + correo + ", puntos=" + puntos + "]";
    }
}
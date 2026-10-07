package POO.semana5;

public class Habitacion {
      // atributos
    private int numero;
    private String tipo;
    private double precioNoche;
    private int capacidad;
    private boolean disponible;
 
    // constructor
    public Habitacion(int numero, String tipo, double precioNoche, int capacidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioNoche = precioNoche;
        this.capacidad = capacidad;
        this.disponible = true; // toda habitacion nueva esta disponible
    }
 
    // getters y setters (los setters validan con if / else)
    public int getNumero() {
        return numero;
    }
 
    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("El numero de habitacion debe ser mayor que cero.");
        }
    }
 
    public String getTipo() {
        return tipo;
    }
 
    public void setTipo(String tipo) {
        if (tipo == "") {
            System.out.println("El tipo no puede estar vacio.");
        } else {
            this.tipo = tipo;
        }
    }
 
    public double getPrecioNoche() {
        return precioNoche;
    }
 
    public void setPrecioNoche(double precioNoche) {
        if (precioNoche > 0) {
            this.precioNoche = precioNoche;
        } else {
            System.out.println("El precio por noche debe ser mayor que cero.");
        }
    }
 
    public int getCapacidad() {
        return capacidad;
    }
 
    public void setCapacidad(int capacidad) {
        if (capacidad >= 1 && capacidad <= 6) {
            this.capacidad = capacidad;
        } else {
            System.out.println("La capacidad debe estar entre 1 y 6 personas.");
        }
    }
 
    // la disponibilidad solo tiene getter: cambia con ocupar() y liberar()
    public boolean isDisponible() {
        return disponible;
    }
 
    // metodos de comportamiento
    public boolean estaDisponible() {
        return disponible;
    }
 
    public void ocupar() {
        if (disponible) {
            disponible = false;
            System.out.println("La habitacion " + numero + " fue ocupada.");
        } else {
            System.out.println("La habitacion " + numero + " ya esta ocupada.");
        }
    }
 
    public void liberar() {
        if (disponible) {
            System.out.println("La habitacion " + numero + " ya estaba libre.");
        } else {
            disponible = true;
            System.out.println("La habitacion " + numero + " fue liberada.");
        }
    }
 
    public double calcularCosto(int noches) {
        if (noches > 0) {
            return precioNoche * noches;
        } else {
            System.out.println("Las noches deben ser mayor que cero.");
            return 0;
        }
    }
 
    public String toString() {
        return "Habitacion [numero=" + numero + ", tipo=" + tipo + ", precioNoche=" + precioNoche
                + ", capacidad=" + capacidad + ", disponible=" + disponible + "]";
    }
}
 
    


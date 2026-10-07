package POO.semana5;

public class Reserva {

    // atributos (cliente y habitacion son objetos de las otras clases)
    private String codigo;
    private Cliente cliente;
    private Habitacion habitacion;
    private int noches;
    private int personas;
    private double total;
    private boolean activa;

    // constructor
    public Reserva(String codigo, Cliente cliente, Habitacion habitacion, int noches, int personas) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.noches = noches;
        this.personas = personas;
        this.total = 0;      // se calcula al confirmar
        this.activa = false; // empieza sin confirmar
    }

    // getters
    public String getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public int getNoches() {
        return noches;
    }

    public int getPersonas() {
        return personas;
    }

    public double getTotal() {
        return total;
    }

    public boolean isActiva() {
        return activa;
    }

    // setters con validacion
    public void setNoches(int noches) {
        if (noches >= 1 && noches <= 30) {
            this.noches = noches;
        } else {
            System.out.println("Las noches deben estar entre 1 y 30.");
        }
    }

    public void setPersonas(int personas) {
        if (personas >= 1) {
            this.personas = personas;
        } else {
            System.out.println("Debe haber al menos 1 persona.");
        }
    }

    // metodos de comportamiento
    public void confirmar() {
        if (!cliente.esMayorDeEdad()) {
            System.out.println("Reserva " + codigo + " rechazada: el cliente es menor de edad.");
        } else if (!habitacion.estaDisponible()) {
            System.out.println("Reserva " + codigo + " rechazada: la habitacion no esta disponible.");
        } else if (personas > habitacion.getCapacidad()) {
            System.out.println("Reserva " + codigo + " rechazada: supera la capacidad de la habitacion.");
        } else {
            total = habitacion.calcularCosto(noches);
            if (cliente.esClienteFrecuente()) {
                double descuento = total / 10; // 10% del total
                total = total - descuento;
            }
            habitacion.ocupar();
            cliente.sumarPuntos(noches * 10); // 10 puntos por noche
            activa = true;
            System.out.println("Reserva " + codigo + " confirmada. Total: " + total);
        }
    }

    public void cancelar() {
        if (activa) {
            habitacion.liberar();
            activa = false;
            total = 0;
            System.out.println("Reserva " + codigo + " cancelada.");
        } else {
            System.out.println("La reserva " + codigo + " no esta activa.");
        }
    }

    public void mostrarResumen() {
        System.out.println("Reserva " + codigo + " de " + cliente.getNombre());
        System.out.println("Habitacion " + habitacion.getNumero() + " - " + noches + " noches - " + personas + " personas");
        System.out.println("Total: " + total + " - Confirmada: " + activa);
    }

    @Override
    public String toString() {
        return "Reserva [codigo=" + codigo + ", cliente=" + cliente.getNombre() + ", habitacion=" + habitacion.getNumero()
                + ", noches=" + noches + ", personas=" + personas + ", total=" + total + ", activa=" + activa + "]";
    }
}
 


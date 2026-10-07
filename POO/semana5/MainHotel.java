package POO.semana5;

public class MainHotel {
        public static void main(String[] args) {
        // creacion de objetos
        Cliente cli1 = new Cliente("Maria Puentes", "1005123456", 19, "maria@correo.com");
        Cliente cli2 = new Cliente("Juan Perez", "1002345678", 17, "juan@correo.com");
        Cliente cli3 = new Cliente("Laura Gomez", "1098765432", 25, "laura@correo.com");
 
        Habitacion hab1 = new Habitacion(101, "Doble", 180000, 2);
        Habitacion hab2 = new Habitacion(102, "Sencilla", 120000, 1);
        Habitacion hab3 = new Habitacion(201, "Familiar", 300000, 4);
 
        Reserva res1 = new Reserva("R001", cli1, hab1, 3, 2);
        Reserva res2 = new Reserva("R002", cli2, hab2, 1, 1);
        Reserva res3 = new Reserva("R003", cli3, hab1, 2, 2);
        Reserva res4 = new Reserva("R004", cli3, hab3, 2, 6);
 
        res1.confirmar();
 
        res2.confirmar();
 
        res3.confirmar();
        res1.cancelar();
        res3.confirmar();
 
        res4.confirmar();
        res4.setPersonas(4);
        res4.confirmar();
 
        cli3.sumarPuntos(100);
        Reserva res5 = new Reserva("R005", cli3, hab2, 2, 1);
        res5.confirmar();
 
        
        cli1.setEdad(-5);
        hab2.setCapacidad(0);
        res4.setNoches(0);
        cli1.usarPuntos(500);
 
        System.out.println("\n--- Resumen final ---");
        res5.mostrarResumen();
        System.out.println(cli3.toString());
        System.out.println(hab1.toString());
    }
}
    


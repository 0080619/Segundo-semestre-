public class MainVehiculo {
    public static void main(String[] args) {
        // creacion de objeto
        Vehiculo objVehiculo1 = new Vehiculo("Toyota", "Corolla", 2020, 20000.0);
        
        System.out.println(objVehiculo1.toString());
        
        objVehiculo1.mostrarInformacion();
    }
}

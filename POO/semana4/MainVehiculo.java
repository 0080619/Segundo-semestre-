public class MainVehiculo {
    public static void main(String[] args) {
        // creacion de objeto
        Vehiculo objVehiculo1 = new Vehiculo("Mazda", "x30", 2020, 80000000.0);
        Vehiculo objVehiculo2 = new Vehiculo("Honda", "Civic", 2019, 18000000.0);
        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo2.toString());

        objVehiculo1.mostrarInformacion();
        objVehiculo2.mostrarInformacion();
    }
}

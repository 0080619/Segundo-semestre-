public class MainCuentaBancaria {
    public static void main(String[] args) {

        // Creación de los objetos de la clase CuentaBancaria
        CuentaBancaria objCuenta1 = new CuentaBancaria();
        CuentaBancaria objCuenta2 = new CuentaBancaria();

        objCuenta1.saldo = 1500000.0;
        objCuenta1.titular = "Jorge";
        objCuenta1.numeroCuenta = 10023456;
        objCuenta1.tipoCuenta = "Ahorros";
        objCuenta1.clave = 1234;

        objCuenta2.saldo = 3200000.0;
        objCuenta2.titular = "Fernanda";
        objCuenta2.numeroCuenta = 10098765;
        objCuenta2.tipoCuenta = "Corriente";
        objCuenta2.clave = 5678;

        objCuenta1.mostrarInformacion();
        objCuenta2.mostrarInformacion();
    }
}

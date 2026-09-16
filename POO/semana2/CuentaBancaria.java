public class CuentaBancaria {
    double saldo;
    String titular;
    int numeroCuenta;
    String tipoCuenta;
    int clave;

    public void mostrarInformacion() {
        System.out.println("Saldo:" + saldo);
        System.out.println("Titular:" + titular);
        System.out.println("Numero de Cuenta:" + numeroCuenta);
        System.out.println("Tipo de Cuenta:" + tipoCuenta);
        System.out.println("Clave:" + clave);
    }
}
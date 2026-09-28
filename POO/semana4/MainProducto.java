public class MainProducto {
    public static void main(String[] args) {
        // creacion de objeto
        Producto objProducto1 = new Producto("P001", "Mouse", 25000.0, 10);
        Producto objProducto2 = new Producto("P002", "Teclado", 60000.0, 5);

        System.out.println(objProducto1.toString());
        System.out.println(objProducto2.toString());

        // inventario
        objProducto1.agregarStock(5);  
        objProducto1.retirarStock(3);  
        objProducto2.retirarStock(8);   

        System.out.println(objProducto1.toString());
        System.out.println(objProducto2.toString());

        System.out.println("Valor total Mouse: " + objProducto1.calcularValorTotal());
        System.out.println("Valor total Teclado: " + objProducto2.calcularValorTotal());
    }
}
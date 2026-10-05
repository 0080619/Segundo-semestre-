package POO.semana5;

public class MainVentas {
    public static void main(String[] args) {
        Ventas venta1 = new Ventas("Laptop", "Dell XPS 13", "LAP123", 1200.00, 10);
        Ventas venta2 = new Ventas("Tablet", "iPad Pro", "TAB456", 799.99, 15);
        Ventas venta3 = new Ventas("Smartphone", "Samsung Galaxy S21", "PHN789", 999.99, 20);
        Ventas venta4 = new Ventas("Smartwatch", "Apple Watch Series 6", "WAT012", 399.99, 5);
        Ventas venta5 = new Ventas("Headphones", "Sony WH-1000XM4", "HDP345", 349.99, 8);

        // mostrar los productos
        System.out.println(venta1.toString());
        System.out.println(venta2.toString());
        System.out.println(venta3.toString());
        System.out.println(venta4.toString());
        System.out.println(venta5.toString());

        // mostrar solo nombre de producto de venta2
        System.out.println(venta2.getNombre());

        // cambiar el codigo del producto de venta5
        venta5.setCodigo("WER456");
        System.out.println("Nuevo codigo del producto de venta5: " + venta5.getCodigo());

        // verificar stock de venta3
        System.out.println(venta3.getStock());

        // vender 3 unidades de venta3
        venta3.vender(3);
        System.out.println("Stock restante de venta3: " + venta3.getStock());

        // reabastecer 5 unidades de venta3
        venta3.setStock(venta3.getStock() + 5);
        System.out.println("Stock actual de venta3: " + venta3.getStock());

        // calcular valor inventario de venta1
        double v = venta1.calacularInventario();
        System.out.println("Valor inventario de venta1: " + v);
    }
}


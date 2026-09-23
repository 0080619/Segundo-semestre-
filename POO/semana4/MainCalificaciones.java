public class MainCalificaciones {
    public static void main(String[] args) {
        
        // creacion de objeto
        Calificaciones objCalificaciones1 = new Calificaciones ("maria","022014","2do semestre",4.0,4.2,3.0);
        
        System.out.println(objCalificaciones1.toString());
        
        double p = objCalificaciones1.promedio();
        
        System.out.println(objCalificaciones1.toString());
        
        objCalificaciones1.calcularPromedio(p);
        
        System.out.println("El promedio es: " + objCalificaciones1.promedio());
    
       

    }
    
}

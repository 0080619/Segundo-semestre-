package POO.semana6;
public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso("7308", "POO", 4);
        Curso curso2 = new Curso("7765", "Cálculo Diferencial", 4);
        
        Estudiante est1 = new Estudiante("Julian", "1110363", 21, "jf@ucc", curso1);
        Estudiante est2 = new Estudiante("Jose", "100643", 19, "jdiaz@ucc", curso1);
        Estudiante est3 = new Estudiante("Juan", "112309", 20, "jp@ucc", curso2);
        
        
        System.out.println(est1);
        System.out.println(est2);
        System.out.println(est3);
        
    }
}

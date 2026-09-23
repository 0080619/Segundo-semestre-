public class Calificaciones {
    // atributos
    private String nombre;
    private String codigo;
    private String curso;
    private double nota1;
    private double nota2;
    private double nota3;
    
    // constructor 
    public Calificaciones(String nombre,String codigo,String curso, double nota1 ,double nota2, double nota3){
    this.nombre = nombre;
    this.codigo = codigo;
    this.curso = curso;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
    }
    
    public String toString(){
        return "Calificaciones[Nombre:" + nombre + "Codigo:"+ codigo + "Curso:"+ curso+"Nota1 :"+ nota1+" Nota2"+ nota2+"Nota3"+nota3+ "] ";
    }
    
    // creacion de metodos 
    public double promedio(){
        return (nota1+nota2+nota3) / 3; 
    }
   
    public void calcularPromedio ( double promedio){
        if (promedio >= 3.0 )
            System.out.println("APROBO");
        else
            System.out.println("NO APROBO");  
    }

}

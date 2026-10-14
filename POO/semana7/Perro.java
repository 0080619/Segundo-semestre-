public class Perro extends Animal {
    
    private double peso;
    
    public Perro(String nombre, String familia, double peso){
        super(nombre, familia);
        this.peso = peso;
    }
    
    public void comer(){
        System.out.println("Perro comiendo....");
    }
    
    public void ladrar(){
        System.out.println("Guau guau..");
    }

    @Override
    public String toString() {
        return "Perro [peso=" + peso + "]";
    }
    
}
//https://github.com/johnhcano/poo taller proxima clasee
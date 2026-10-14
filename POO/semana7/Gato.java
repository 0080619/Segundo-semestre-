public class Gato extends Animal {
    
    private boolean flexible;
    
    public Gato(String nombre, String familia, boolean flexible){
        super(nombre, familia);
        this.flexible = flexible;
    }
    
    public void comer(){
        System.out.println("Gato comiendo....");
    }
    
    public void maullar(){
        System.out.println("Miau Miau....");
    }

    @Override
    public String toString() {
        return "Gato [flexible=" + flexible + "]";
    }

    
}
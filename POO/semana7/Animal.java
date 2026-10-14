public class Animal {
    
    private String nombre;
    private String familia;
    
    public Animal(String nombre, String familia){
        this.nombre = nombre;
        this.familia = familia;
    }
    
    public void comer(){ }
    public void ladrar(){ } 
    public void maullar(){ }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", familia=" + familia + "]";
    }
}
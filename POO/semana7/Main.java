public class Main {
    public static void main(String[] args) throws Exception {
        
        Perro objPerrito1 = new Perro("Brandy", "Canino", 9.0);
        Gato objGatito1 = new Gato("Tomas", "Felino", true);
        
        objPerrito1.ladrar(); //Perro ladrando....Guau guau..
        objGatito1.maullar(); //Gato maullando....Miau Miau....
        
        objPerrito1.comer(); //Perro comiendo....
        objGatito1.comer(); //Gato comiendo....
        
    }
}

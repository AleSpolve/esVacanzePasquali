public class ProdConsSem {
    
    protected static int buffer;
    public static void main(String[] args) {
        
        Semaforo pieno=new Semaforo(0);
        Semaforo vuoto=new Semaforo(1);

        ProduciDato prod=new ProduciDato(pieno, vuoto);
        ConsumaDato cons=new ConsumaDato(pieno, vuoto);
        prod.start();
        cons.start();
        System.out.println("Main : termine avvio thread.");
    }

}

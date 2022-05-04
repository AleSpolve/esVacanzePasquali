public class ProdConsSem {
    
    protected static int buffer;
    public static void main(String[] args) {
        
        Contatore conta=new Contatore(0, 1);
        Semaforo pieno=new Semaforo(0);
        Semaforo vuoto=new Semaforo(1);

        ProduciDato prod=new ProduciDato(pieno, vuoto,conta);
        ConsumaDato cons=new ConsumaDato(pieno, vuoto,conta);
        prod.start();
        cons.start();
        System.out.println("Main : termine avvio thread.");
    }

}

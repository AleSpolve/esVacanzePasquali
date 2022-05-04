public class ProduciDato extends Thread{
    
    Semaforo pieno;
    Semaforo vuoto;
    int tanti =5;

    Contatore conta;
    final int attesa=500;

    public ProduciDato(Semaforo s1,Semaforo s2,Contatore conta){
        
        pieno=s1;
        vuoto=s2;
        this.conta=conta;
    }

    public void run(){

        for(int i=0;i<tanti;i++){

            vuoto.P();
            conta.incrementa();
            System.out.println("Scrittore: dato scritto :" + 1);
            pieno.V();
        }
        try {
            Thread.sleep(attesa);
        } catch (Exception e) {

        }

        System.out.println("Scrittore: termine scrittura dati.");
    }
}


public class ConsumaDato extends Thread{
    
    Semaforo pieno;
    Semaforo vuoto;
    int dato;
    
    Contatore conta;

    ProduciDato p=new ProduciDato(pieno, vuoto, conta);

    public ConsumaDato(Semaforo s1,Semaforo s2,Contatore conta){
        pieno=s1;
        vuoto=s2;
        this.conta=conta;
    }

    public void run(){
        
        for(int i=0;i<p.tanti;i++){

            pieno.P();
            conta.decrementa();
            System.out.println("Lettore:dato scitto"+i);
            vuoto.V();
        }
    }
}

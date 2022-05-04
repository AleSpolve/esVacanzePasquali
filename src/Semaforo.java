public class Semaforo {

    int valore;

    public Semaforo(int v){

        valore=v;
    }
    
    public synchronized void P(){

        while(valore==0){
            try{

                wait();
            }catch(InterruptedException e){

            }
        }
        valore--;
    }

    public synchronized void V(){

        valore++;
        notify();
    }
    
    
}

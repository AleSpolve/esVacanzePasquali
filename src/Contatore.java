public class Contatore {

    int valore;
    int passo;

    public Contatore(int valore,int passo){

        this.valore=valore;
        this.passo=passo;
        System.out.println("\nIl contatore e' nato e vale "+this.getValore());
    }
    
    public void incrementa(){
        valore+=passo;
    }

    public void decrementa(){

        valore-=passo;
    }

    public int getValore(){

        return valore;
    }

}

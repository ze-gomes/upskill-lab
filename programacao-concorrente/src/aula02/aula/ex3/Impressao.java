package aula02.aula.ex3;

public class Impressao {
    boolean emImpressao = false;


    public synchronized void ImprimirLetras(String c){
        while (emImpressao){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(c);
        notifyAll();
    }


    public synchronized void ImprimirNums(int n){
        while (emImpressao){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(n);
        System.out.println(n+1);
        notifyAll();
    }
}

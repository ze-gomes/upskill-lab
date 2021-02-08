package aula03.aula.ex2_3;

import java.util.LinkedList;

public class Banquete {
    LinkedList<Javali> banquete = new LinkedList<>();
    int numJavalisCozinhados = 0;
    int maxSize;

    public Banquete(int maxSize){
        this.maxSize = maxSize;
    }

    public synchronized void colocaJavali(Javali j) throws InterruptedException {
        while (banquete.size() >= maxSize) {
            System.out.println("A mesa esta cheia");
            wait();
        }
        banquete.addLast(j);
        notifyAll();
    }

    public synchronized Javali retiraJavali() throws InterruptedException {
        while (banquete.size() == 0) {
            wait();
        }
        Javali j = banquete.removeLast();
        notifyAll();
        return j;
    }

}

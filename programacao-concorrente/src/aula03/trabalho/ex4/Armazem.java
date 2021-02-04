package aula03.trabalho.ex4;


import java.util.ArrayList;
import java.util.LinkedList;

public class Armazem {
    private static final int NUM_ENCOMENDAS_MAX = 5;
    private int encomendas = 0;

    public synchronized void addEncomenda() throws InterruptedException {
        while (encomendas >= NUM_ENCOMENDAS_MAX){
            wait();
        }
        encomendas++;
        System.out.println(Thread.currentThread().getName() + " add encomendas " + encomendas);
        notifyAll();
    }

    public synchronized void removeEncomenda() throws InterruptedException {
        while (encomendas == NUM_ENCOMENDAS_MAX){
            wait();
        }
        encomendas--;
        System.out.println(Thread.currentThread().getName() + " remove encomendas " + encomendas);
        Thread.sleep(1000);
        notifyAll();
    }

}

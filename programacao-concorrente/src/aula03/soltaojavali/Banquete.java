package aula03.soltaojavali;

import java.util.ArrayList;
import java.util.LinkedList;

public class Banquete {
    LinkedList<Javali> banquete = new LinkedList<>();
    private boolean available = false;

    public synchronized void colocaJavali(Cozinheiro c, int n) throws InterruptedException {
        while (banquete.size()>=10){
                wait();
        }
        banquete.addLast(new Javali(c, n));
        System.out.println("O Javali " + n + " Cozinhado pelo cozinheiro " + c.id + " foi posto na mesa");
        available = true;
        notifyAll();
    }

    public synchronized Javali retiraJavali() throws InterruptedException {
        while (banquete.size() == 0){
                wait();
        }
        Javali j = banquete.removeLast();
        System.out.println("O Javali " + j.num + " Cozinhado pelo cozinheiro " + j.cozinheiro.id + " foi comido");
        notifyAll();
        return j;
    }

}

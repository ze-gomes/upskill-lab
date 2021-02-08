package aula03.aula.ex2_3;

import java.util.concurrent.ArrayBlockingQueue;

public class BanqueteBlockingQueue extends Banquete {
    ArrayBlockingQueue<Javali> banquete;

    public BanqueteBlockingQueue(int maxSize){
        super(maxSize);
        this.banquete = new ArrayBlockingQueue<>(maxSize);
    }

    @Override
    public void colocaJavali(Javali j) throws InterruptedException {
        banquete.put(j);
    }

    @Override
    public Javali retiraJavali() throws InterruptedException {
        return banquete.take();
    }

}

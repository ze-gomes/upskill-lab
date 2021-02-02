package aula03.soltaojavali_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class Banquete {
    private boolean available = false;
    private BlockingQueue<Javali> javalis = new ArrayBlockingQueue<>(10);

    public synchronized void colocaJavali(Cozinheiro c, int n) throws InterruptedException {
        javalis.put(new Javali(c, n));
    }

    public synchronized Javali retiraJavali() throws InterruptedException {
        return javalis.take();
    }

}

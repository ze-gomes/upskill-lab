package testemodelo.ex1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final int VALOR_MAX = 100;


    public static void main(String[] args) {
        List<PrimeNumberTask> tasks = new LinkedList<PrimeNumberTask>();
        List<Integer> primos = new LinkedList<>();

        ExecutorService pool = Executors.newFixedThreadPool(4);
        int inc = VALOR_MAX/4;
        for (int i = 0; i <  VALOR_MAX; i = i+inc) {
            PrimeNumberTask task = new PrimeNumberTask(i, i+inc);
            tasks.add(task);
            pool.submit(task);
        }

        pool.shutdown();
        try {
            pool.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (PrimeNumberTask task: tasks) {
            primos.addAll(task.getPrimeList());
        }
        Collections.sort(primos);
        System.out.println(primos);

    }
}

package aula01.aula.ex5;


public class ThreadEven extends Thread{
    // Ex 5 aula 1
    // Imprime os pares ate 1000 com sleep de 1 seg
    public void run() {
        System.out.println("Thread started:"+Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

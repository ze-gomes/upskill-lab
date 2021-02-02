package aula01.aula.ex5;


public class ThreadOdd extends Thread{
    // Ex 5 aula 1
    // Imprime os pares ate 150 com sleep de 2 seg
    public void run() {
        System.out.println("Thread started:"+Thread.currentThread().getName());
        for (int i = 0; i < 150; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

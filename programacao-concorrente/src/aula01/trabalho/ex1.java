package aula01.trabalho;

public class ex1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ex1();
        Thread t2 = new ex1();
        Thread t3 = new ex1();
        Thread t4 = new ex1();
        Thread t5 = new ex1();
        t1.start();
        t1.join(2000);  // Ainda esta runnable aqui, portanto retorna imediatamente
        t2.start();
        t1.join();  //  T1 acaba aqui - espera em wait
        t3.start();
        t2.join(1000);  // T2 acaba aqui - espera em wait
        t4.start();
        t3.join(4000); // Ainda esta runnable aqui, portanto retorna imediatamente
        t5.start();
        t1.join();   // Ja tinha terminado
        t2.join();  // Ja tinha terminado
        t3.join();  // Ja tinha terminado
        t4.join();  // Termina aqui
        t5.join();  // Termina aqui
        System.out.println("All threads are dead, exiting main thread");
    }

    public void run() {
        System.out.println("Thread started:::" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::" + Thread.currentThread().getName());
    }
}

package aula01.trabalho;

public class ex2 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new ex2();
        Thread t2 = new ex2();
        Thread t3 = new ex2();
        Thread t4 = new ex2();
        Thread t5 = new ex2();
        Thread t6 = new ex2();
        Thread t7 = new ex2();
        Thread t8 = new ex2();
        t1.start();
        t1.join(1000);   // Ainda esta runnable aqui, continua
        t2.start();
        t1.join(3000);  // T1 acaba aqui
        t3.start();
        t2.join(1000);  //  ainda esta runnable aqui, continua
        t4.start();
        t3.join(4000);      // T3 Termina aqui
        t5.start();
        t1.join(1000);  // Ja tinha terminado
        t6.start();
        t4.join(4000);
        t7.start();  // So termina depois do print final
        t8.start();  // So termina depois do print final
        t2.join();      // Ja tinha terminado
        t3.join();    // Ja tinha terminado
        t4.join();  // termina aqui
        t5.join();  // termina aqui
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

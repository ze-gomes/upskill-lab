package aula03.soltaojavali_queue;

public class Cozinheiro extends Thread {
    int id;
    Banquete banquete;

    public Cozinheiro(Banquete b, int id){
        this.banquete = b;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                sleep(100); //  come
                banquete.colocaJavali(this, i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

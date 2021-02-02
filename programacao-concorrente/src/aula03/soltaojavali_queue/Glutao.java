package aula03.soltaojavali_queue;

public class Glutao extends Thread{
    int id;
    Banquete banquete;

    public Glutao(Banquete b, int id){
        this.banquete = b;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Javali j = banquete.retiraJavali();
                System.out.println("esta a comer Java");
                sleep(100); //  come
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

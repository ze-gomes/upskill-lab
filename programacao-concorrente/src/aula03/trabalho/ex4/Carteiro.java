package aula03.trabalho.ex4;

import aula03.soltaojavali_queue.Banquete;
import aula03.soltaojavali_queue.Javali;package aula03.soltaojavali_queue;

public class Carteiro extends Thread{
    private Armazem edificio;

    public Carteiro(Armazem a){
        this.edificio = a;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                J avali j = banquete.retiraJavali();
                System.out.println("esta a comer Java");
                sleep(100); //  come
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

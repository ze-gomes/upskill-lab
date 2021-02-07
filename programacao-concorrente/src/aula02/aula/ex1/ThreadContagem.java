package aula02.aula.ex1;

public class ThreadContagem extends Thread {
    Contador c;

    public ThreadContagem(Contador c){
        this.c = c;
    }

    public void run(){
        for (int i = 0; i < 20; i++) {
            c.incrementar();
            try {
                sleep(1000); // Adormece 1seg entre cada contagem
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(currentThread().getName() + " Contador: " + c.consulta());
        }
    }

}

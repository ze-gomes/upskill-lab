package aula02.aula.ex2;

public class Chefe extends Thread {
    Cozinha cozinha;

    public Chefe(Cozinha c) {
        this.cozinha = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000); //  prepara refeiçao a cada 1 seg
                cozinha.prepararRefeicao();
                System.out.println("O chefe finalizou uma refeiçao");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

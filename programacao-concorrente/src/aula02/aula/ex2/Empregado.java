package aula02.aula.ex2;

public class Empregado extends Thread {
    Cozinha cozinha;

    public Empregado(Cozinha c) {
        this.cozinha = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(2000); //  serve refeiçao
                cozinha.servirRefeicao();
                System.out.println("O empregado serviu uma refeiçao");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

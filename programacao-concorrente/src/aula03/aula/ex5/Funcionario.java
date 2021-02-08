package aula03.aula.ex5;

import java.util.Random;

public class Funcionario extends Thread {
    int id;
    ServerRoom s;

    public Funcionario(int id, ServerRoom s) {
        this.id = id;
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            Random r = new Random();
            int randomTime = (r.nextInt(8 - 5 + 1) + 5) * 1000;
            try {
                s.registarEntrada();
                System.out.println("O funcionario " + id + " entrou.");
                sleep(randomTime);
                System.out.println("O funcionario " + id + " saiu.");
                s.registarSaida();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package aula04.exercicio3;

import java.util.Random;

public class Produtor extends Thread {
    private RecursoPartilhado r;
    private int id;


    public Produtor(RecursoPartilhado r, int id){
        this.r = r;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int number = (new Random().nextInt(30)) +1;
            r.insertNumber(number);
            System.out.println("Produtor #" + id + " inseriu o num: "  + number);
        }
    }


}

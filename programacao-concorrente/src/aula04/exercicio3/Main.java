package aula04.exercicio3;

public class Main {

    public static void main(String[] args) {
        RecursoPartilhado r = new RecursoPartilhado();

        Produtor[] pr = new Produtor[5];
        Consumidor[] cr = new Consumidor[5];

        for (int i = 0; i < 5; i++) {
            pr[i] = new Produtor(r, i);
            cr[i] = new Consumidor(r, i);
        }
        for (int i = 0; i < 5; i++) {
            pr[i].start();

        }
        for (int i = 0; i < 5; i++) {
            cr[i].start();
        }
    }
}

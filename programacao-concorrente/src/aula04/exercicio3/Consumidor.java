package aula04.exercicio3;

public class Consumidor extends Thread {
    private RecursoPartilhado r;
    private int id;


    public Consumidor(RecursoPartilhado r, int id){
        this.r = r;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int result = r.getNumber();
            System.out.println("Consumidor #" + id + " obteve a soma "  + result);
        }
    }


}

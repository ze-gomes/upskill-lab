package aula04.exercicio4;

public class Eletricista extends Thread {
    private Reservatorio r;
    private int id;


    public Eletricista(Reservatorio r, int id) {
        this.r = r;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            Tarefa t = r.removeTarefa();
            System.out.println("O eletricista #" + id + " removeu a tarefa " + t.getNome());
        }
    }


}

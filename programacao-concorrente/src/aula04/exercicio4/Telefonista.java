package aula04.exercicio4;

public class Telefonista extends Thread {
    private Reservatorio r;

    public Telefonista(Reservatorio r) {
        this.r = r;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Tarefa t = new Tarefa("Tarefa #" + i);
            r.insertTarefa(t);
            System.out.println("Telefonista inseriu a tarefa: " + t.getNome());
        }
    }
}
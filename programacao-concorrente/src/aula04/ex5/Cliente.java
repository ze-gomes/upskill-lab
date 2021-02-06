package aula04.ex5;

public class Cliente extends Thread {
    private SalaDeEspera sala;
    private int id;


    public Cliente(SalaDeEspera sala, int id) {
        this.sala = sala;
        this.id = id;
    }

    @Override
    public void run() {
         sala.entraBarbearia(this);
    }

    public int obterId() {
        return id;
    }
}

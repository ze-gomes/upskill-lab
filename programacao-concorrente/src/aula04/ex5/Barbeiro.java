package aula04.ex5;

public class Barbeiro extends Thread {
    private SalaDeEspera sala;
    private int id;


    public Barbeiro(SalaDeEspera sala, int id) {
        this.sala = sala;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(2000); // Corte de cabelo
                Cliente c = sala.CortaCabelo();
                System.out.println("Barbeiro #" + id + " cortou o cabelo ao cliente  " + c.obterId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

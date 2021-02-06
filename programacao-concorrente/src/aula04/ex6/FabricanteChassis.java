package aula04.ex6;

public class FabricanteChassis extends Thread {
    Fabrica f;
    int id;

    public FabricanteChassis(Fabrica f, int id) {
        this.f = f;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                f.MontarChassis(new Carro("Seat Ibiza"));
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int obterId() {
        return id;
    }
}

package aula04.ex6;

public class FabricanteMotor extends Thread {
    Fabrica f;
    int id;

    public FabricanteMotor(Fabrica f, int id){
        this.f = f;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            while(true) {
                f.MontarMotor();
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
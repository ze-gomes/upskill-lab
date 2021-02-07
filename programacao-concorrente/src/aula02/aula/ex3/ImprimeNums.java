package aula02.aula.ex3;

public class ImprimeNums extends Thread {
    Impressao i;

    public ImprimeNums(Impressao i) {
        this.i = i;
    }

    @Override
    public void run() {
        for (int j = 1; j < 52; j = j + 2) {
            try {
                sleep(500);
                i.ImprimirNums(j);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

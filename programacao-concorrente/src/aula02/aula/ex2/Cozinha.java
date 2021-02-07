package aula02.aula.ex2;

public class Cozinha {
    public boolean RefeicaoPreparada = false;



    public synchronized void prepararRefeicao() throws InterruptedException {
        while (RefeicaoPreparada) { //  se ja ha refeicao preparada, espera que o empregado leve
            wait();
        }
        RefeicaoPreparada = true;
        notifyAll();
    }

    public synchronized void servirRefeicao() throws InterruptedException {
        while (!RefeicaoPreparada) { //  se nao ha refeicao preparada, espera
            wait();
        }
        RefeicaoPreparada = false;
        notifyAll();
    }
}

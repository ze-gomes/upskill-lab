package aula02.aula.ex3;

public class ImprimeLetras extends Thread {
    Impressao i;

    public ImprimeLetras(Impressao i) {
        this.i = i;
    }

    @Override
    public void run() {
        char c;
        // Este for imprime todas as letras de A a Z usando o tipo "char"
        for (c = 'A'; c <= 'Z'; ++c) {
            try {
                sleep(500);
                i.ImprimirLetras(c + " ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

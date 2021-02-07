package aula02.trabalho.ex4;

public class Carrinha extends Thread {
    Armazem armazem;
    int carga;
    int id;

    public Carrinha(Armazem armazem, int id) {
        this.armazem = armazem;
        this.carga = 0;
        this.id = id;
    }

    public void run() {
        // Enquanto ainda houver encomendas por carregar, a carrinha vai voltar ao armazem
        while (!armazem.ArmazemVazio()) {
            try {
                armazem.carregarEncomendas(this);
                sleep(5000); // Tempo de "viagem"
                this.setCarga(0); // Reset à carga
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getIdentificacao() {
        return id;
    }
}

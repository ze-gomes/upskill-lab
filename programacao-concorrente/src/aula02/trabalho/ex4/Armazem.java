package aula02.trabalho.ex4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Armazem {
    boolean aCarregar = false;
    LinkedList<Encomenda> listaEncomendas = new LinkedList<>();
    public static int CARGA_MAXIMA = 5;

    public Armazem() {
        // enche o armazem com as 50 encomendas
        for (int i = 1; i <= 50; i++) {
            Encomenda e = new Encomenda(i);
            listaEncomendas.add(e);
        }
    }


    public synchronized void carregarEncomendas(Carrinha c) throws InterruptedException {
        // Carrinha espera se estiver outra ja em carga
        while (aCarregar) {
            wait();
        }
        // Se ainda tiver espaço, vai carregando as encomendas por ordem
        while (c.getCarga()<CARGA_MAXIMA && !ArmazemVazio()){
                Encomenda e = listaEncomendas.removeFirst();
                System.out.println("A carrinha " + c.getIdentificacao() + " carregou a encomenda #"+ e.getNum());
                c.sleep(1000);
                c.setCarga(c.getCarga()+1);
        }
        System.out.println("A carrinha " + c.getIdentificacao() + " carregou todas as encomendas e vai sair agora");
        aCarregar = false;
        notifyAll();
    }

    public boolean ArmazemVazio(){
        if (listaEncomendas.size()==0){
            System.out.println("O armazem esta vazio, ja nao ha mais encomendas para carregar");
            return true;
        }
        return false;
    }
}

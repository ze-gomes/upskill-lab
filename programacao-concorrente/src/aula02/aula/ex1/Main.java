package aula02.aula.ex1;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        Contador c = new Contador();
        ArrayList<ThreadContagem> listaThreads = new ArrayList<>();
        // Apenas criei 10 threads para facilitar
        for (int i = 0; i < 10; i++) {
            listaThreads.add(new ThreadContagem(c));
        }
        for (ThreadContagem t: listaThreads) {
            t.start();
        }
    }
}

package aula02.trabalho.ex4;

import java.util.ArrayList;
import java.util.LinkedList;

public class GestorEncomendas {

    public static void main(String[] args) {
        Armazem a = new Armazem();
        for (int i = 0; i < 5; i++) {
            Carrinha c = new Carrinha(a, i);
            c.start();
        }

    }
}

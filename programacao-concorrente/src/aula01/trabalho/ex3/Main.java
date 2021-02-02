package aula01.trabalho.ex3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayString = new ArrayList<>();
        arrayString.add("4 3 7 3 58 7 3 45 7 4 6 3 1 2 1 2 4 5 35 87 4 32 6 7 8");
        arrayString.add("4 63 645 3 7 4 57345 2 1 3 4 2 4");
        arrayString.add("5 7 89 42 5 7 4 6 4 3 3 6 5 3 67 5");
        // Cria uma thread para cada string da lista
        for ( String s: arrayString) {
            Thread t = new ContaDigitos(s);
            t.start();
        }

    }
}

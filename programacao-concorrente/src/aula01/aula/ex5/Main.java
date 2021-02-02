package aula01.aula.ex5;

public class Main {

    // Verifica se o num escolhido é par, numa thread
    public static void main(String[] args) {
        Thread t1 = new ThreadOdd();
        Thread t2 = new ThreadEven();
        t1.start();
        t2.start();
    }
}

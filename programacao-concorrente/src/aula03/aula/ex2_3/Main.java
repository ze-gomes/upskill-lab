package aula03.aula.ex2_3;

public class Main {

    public static void main(String[] args) {
        // Banquete b = new Banquete();
        Banquete b = new BanqueteBlockingQueue(5);
        Cozinheiro c1 = new Cozinheiro(b, 1);
        Glutao g1 = new Glutao(b, 1);
        Cozinheiro c2 = new Cozinheiro(b, 2);
        Cozinheiro c3 = new Cozinheiro(b, 3);
        Glutao g2 = new Glutao(b, 2);
        Glutao g3 = new Glutao(b, 3);
        c1.start();
        c2.start();
        c3.start();
        g1.start();
    }
}

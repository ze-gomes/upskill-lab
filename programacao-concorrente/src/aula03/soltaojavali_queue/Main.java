package aula03.soltaojavali_queue;

public class Main {

    public static void main(String[] args) {
        Banquete b = new Banquete();
        Cozinheiro c1 = new Cozinheiro(b, 1);
        Glutao g1 = new Glutao(b, 1);
        Cozinheiro c2 = new Cozinheiro(b, 2);
        Glutao g2 = new Glutao(b, 2);
        Cozinheiro c3 = new Cozinheiro(b, 3);
        Glutao g3 = new Glutao(b, 3);
        g1.run();
        c1.run();
        g2.run();
        c2.run();
        g3.run();
        c3.run();



    }
}

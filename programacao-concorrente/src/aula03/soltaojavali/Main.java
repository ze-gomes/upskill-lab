package aula03.soltaojavali;

public class Main {

    public static void main(String[] args) {
        Banquete b = new Banquete();
        Cozinheiro c1 = new Cozinheiro(b, 1);
        Glutao g1 = new Glutao(b, 1);
        g1.run();
        c1.run();
        Cozinheiro c2 = new Cozinheiro(b, 2);
        Glutao g2 = new Glutao(b, 2);
        g2.run();
        c2.run();
        Cozinheiro c3 = new Cozinheiro(b, 3);
        Glutao g3 = new Glutao(b, 3);
        g3.run();
        c3.run();

    }
}

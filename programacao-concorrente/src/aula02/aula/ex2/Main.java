package aula02.aula.ex2;

public class Main {

    public static void main(String[] args) {
        Cozinha c = new Cozinha();
        Empregado e = new Empregado(c);
        Chefe chefe = new Chefe(c);
        chefe.start();
        e.start();

    }
}

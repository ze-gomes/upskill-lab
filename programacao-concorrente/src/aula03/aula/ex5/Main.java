package aula03.aula.ex5;

public class Main {

    public static void main(String[] args) {
        ServerRoom s = new ServerRoom(2);
        for (int i = 0; i < 3; i++) {
            Funcionario f = new Funcionario(i, s);
            f.start();
        }
    }
}

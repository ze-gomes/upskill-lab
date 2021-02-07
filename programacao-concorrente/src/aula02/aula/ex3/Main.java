package aula02.aula.ex3;

public class Main {

    public static void main(String[] args) {
        Impressao i = new Impressao();
        ImprimeLetras t1 = new ImprimeLetras(i);
        ImprimeNums t2 = new ImprimeNums(i);
        t1.start();
        t2.start();
    }
}

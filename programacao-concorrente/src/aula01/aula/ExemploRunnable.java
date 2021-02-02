package aula01.aula;

import java.util.Scanner;

public class ExemploRunnable implements Runnable {
    // Ex 2 aula
    public void run(){
        System.out.println("Introduza um numero:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();  // Read user input
        if (num%2 == 0){
            System.out.println("O numero recebido é par");
        } else {
            System.out.println("O numero recebido é impar");
        }

    }

    // Verifica se o num escolhido é par, numa thread atraves de runnable
    public static void main(String[] args) {
        Runnable r = new ExemploRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}

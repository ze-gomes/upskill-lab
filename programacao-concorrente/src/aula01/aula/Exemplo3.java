package aula01.aula;

import java.util.Scanner;

public class Exemplo3 extends Thread {
    // Verifica se o num escolhido é par, numa thread
    public static void main(String[] args) {
        Thread t = new Exemplo3();
        t.start();
    }

    // Ex 3 aula
    public void run() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduza um numero:");
            int num = s.nextInt();  // Read user input
            if (num % 2 == 0) {
                System.out.println("O numero recebido é par");
            } else {
                System.out.println("O numero recebido é impar");
            }
            // ADormece a thread 1 seg
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("A thread foi abortada");
            }
        }

    }
}

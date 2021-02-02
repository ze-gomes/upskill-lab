package aula01.aula;

import java.util.Scanner;

public class ExemploThread extends Thread {
    // Ex 1 aula
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

   // Verifica se o num escolhido é par, numa thread
    public static void main(String[] args) {
        Thread t = new ExemploThread();
        t.start();
    }
}

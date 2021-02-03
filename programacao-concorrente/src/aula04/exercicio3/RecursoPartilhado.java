package aula04.exercicio3;

import java.util.ArrayList;
import java.util.LinkedList;

public class RecursoPartilhado {
    public static final int MAX_NUM = 2;
    LinkedList<Integer> listaNum = new LinkedList<Integer>();
    public synchronized void insertNumber(int number) {
        while (listaNum.size() >= MAX_NUM) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        listaNum.add(number);
        notifyAll();
    }


    public synchronized int getNumber() {
        while (listaNum.size() < MAX_NUM) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int  p = listaNum.removeFirst();
        int  u = listaNum.removeFirst();
        notifyAll();
        return u+p;
    }


}

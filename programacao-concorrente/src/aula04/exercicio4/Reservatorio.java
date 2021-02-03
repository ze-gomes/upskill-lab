package aula04.exercicio4;

import java.util.LinkedList;

public class Reservatorio {
    public static final int MAX_TAREFAS = 5;
    LinkedList<Tarefa> listaTarefas = new LinkedList<Tarefa>();


    public synchronized void insertTarefa(Tarefa t) {
        while (listaTarefas.size() >= MAX_TAREFAS) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        listaTarefas.add(t);
        notifyAll();
    }


    public synchronized Tarefa removeTarefa() {
        while (listaTarefas.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Tarefa t = listaTarefas.removeFirst();
        notifyAll();
        return t;
    }


}

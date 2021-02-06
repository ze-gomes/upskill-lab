package aula04.ex5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class SalaDeEspera {
    public static final int MAX_LUGARES = 3;
    LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();


    public synchronized void entraBarbearia(Cliente cliente) {
        Random rand = new Random();
        int randomNum = rand.nextInt((10 - 3) + 1) + 3;
        while (listaClientes.size() >= MAX_LUGARES) {
            try {
                System.out.println("Cliente #" + cliente.obterId() + " saiu porque a barbearia estava cheia ");
                wait(randomNum*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Cliente #" + cliente.obterId() + " entrou na barbearia ");
        listaClientes.add(cliente);
        notifyAll();
    }


    public synchronized Cliente CortaCabelo() {
        while (listaClientes.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Cliente c = listaClientes.removeFirst();
        notifyAll();
        return c;
    }


}

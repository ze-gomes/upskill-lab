package aula03.jantardefilosofos;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Filosofo extends Thread{
    Mesa mesa;
    int filosofo;

    public Filosofo (String nome, Mesa mesa, int fil)
    {
        super(nome);
        mesa = mesa;
        filosofo = fil;
    }


    @Override
    public void run() {
        while (true)
        {
            int tempo = 1000;
            pensar(tempo);
            getGarfos();
            comer(tempo);
            returnGarfos();
        }
    }

    public void pensar(int tempo){
        try {
            sleep(tempo);
        } catch (InterruptedException e) {
            System.out.println("O Filófoso demorou muito a pensar");
        }
    }

    public void comer(int tempo){
        try {
            sleep(tempo);
        } catch (InterruptedException e) {
            System.out.println("O Filófoso demorou muito a comer");
        }
    }

    public void getGarfos()
    {
        mesa.pegaGarfos(filosofo);
    }

    public void returnGarfos()
    {
        mesa.devolveGarfos(filosofo);
    }

}

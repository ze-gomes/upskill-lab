package aula03.jantardefilosofos;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class Mesa{
    int maxcomer = 1;



    @Override
    public void run() {
        while(true){
        }
    }

    public static void main (String[] args)
    {
        Mesa mesa = new Mesa ();
        for (int filosofo = 0; filosofo < 5; filosofo++)
        {
            new Filosofo("Filosofo_" + filosofo, mesa, filosofo).start();
        }
    }
}

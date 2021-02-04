package aula02.aula.ex1;

public class Contador {
    int num;

    public Contador(){
       this.num = 0;
    }


    public synchronized void incrementar(){
        num++;
    }

    public synchronized void decrementar(){
        num--;
    }

    public int consulta(){
        return num;
    }
}

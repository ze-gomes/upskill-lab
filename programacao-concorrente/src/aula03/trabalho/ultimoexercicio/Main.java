package aula03.trabalho.ultimoexercicio;

public class Main {

    public static void main(String[] args) {
        Cliente [] clientes = new Cliente[10];
        for(int i = 0; i<clientes.length; i++){
            clientes[i] = new Cliente(conta,i);
            clientes[i].start();
        }

        try {
            Thread.sleep(10000)

        } catch (InterruptedException e){
            e.printStackTrace();
        }

        for (int i = 0; i<clientes.length; i++){
            clientes[i] = new Cliente(conta,i);
            clientes[i].start();
        }


    }



}

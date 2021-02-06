package aula04.ex5;

import java.util.ArrayList;

public class Barbearia {

    public static void main(String[] args) {
        SalaDeEspera sala = new SalaDeEspera();
        ArrayList<Cliente> listaC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listaC.add(new Cliente(sala, i));
        }
        Barbeiro b = new Barbeiro(sala, 1);
        for (int i = 0; i < listaC.size(); i++) {
            listaC.get(i).start();
        }
        b.start();

    }
}

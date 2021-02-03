package aula04.exercicio4;

import aula04.exercicio3.Consumidor;
import aula04.exercicio3.Produtor;

public class Main {
    Reservatorio r = new Reservatorio();

    Eletricista[] cr = new Eletricista[5];

        for (int i = 0; i < 5; i++) {
        pr[i] = new Produtor(r, i);
        cr[i] = new Consumidor(r, i);
    }
        for (int i = 0; i < 5; i++) {
        pr[i].start();

    }
        for (int i = 0; i < 5; i++) {
        cr[i].start();
    }
}
}

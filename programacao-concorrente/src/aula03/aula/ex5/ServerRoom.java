package aula03.aula.ex5;

import java.util.concurrent.Semaphore;

public class ServerRoom {
    Semaphore semaphore;

    public ServerRoom(int limit){
        this.semaphore = new Semaphore(limit);
    }

    public void registarEntrada() throws InterruptedException {
        semaphore.acquire();
    }

    public void registarSaida(){
        semaphore.release();
    }
}

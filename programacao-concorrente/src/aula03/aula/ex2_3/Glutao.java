package aula03.aula.ex2_3;

public class Glutao extends Thread{
    int id;
    Banquete banquete;

    public Glutao(Banquete b, int id){
        this.banquete = b;
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                Javali j = banquete.retiraJavali();
                System.out.println("O Javali " + j.num + " Cozinhado pelo cozinheiro " + j.cozinheiro.id + " foi comido");
                sleep(500); //  come
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

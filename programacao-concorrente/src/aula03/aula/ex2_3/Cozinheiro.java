package aula03.aula.ex2_3;

public class Cozinheiro extends Thread {
    int id;
    Banquete banquete;

    public Cozinheiro(Banquete b, int id){
        this.banquete = b;
        this.id = id;
    }

    public int getIdentificacao() {
        return id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            try {
                sleep(2000); //  esta a preparar o javali
                Javali j = new Javali(this);
                banquete.colocaJavali(j);
                System.out.println("O Javali " + j.getNum() + " Cozinhado pelo cozinheiro " + getIdentificacao() + " foi posto na mesa");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

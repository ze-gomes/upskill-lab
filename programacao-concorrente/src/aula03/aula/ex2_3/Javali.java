package aula03.aula.ex2_3;

public class Javali {
    Cozinheiro cozinheiro;
    int num = 0;

    public Javali(Cozinheiro cozinheiro){
        this.cozinheiro = cozinheiro;
        this.num = incrementaNum();
    }

    public Cozinheiro getCozinheiro() {
        return cozinheiro;
    }

    public int incrementaNum() {
        num = num+1;
        return num;
    }

    public int getNum() {
        return num;
    }
}

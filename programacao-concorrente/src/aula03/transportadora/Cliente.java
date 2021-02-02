package aula03.transportadora;

public class Cliente extends Thread{
    private String nome;

    public Cliente(String nome){
        this.nome =  nome;
    }
}

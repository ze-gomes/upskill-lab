package aula04.ex6;

public class Carro {
    private String marca;
    private boolean chassis = false;
    private boolean rodas = false;
    private boolean motor = false;


    public Carro(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public boolean getChassis() {
        return chassis;
    }

    public boolean getRodas() {
        return rodas;
    }

    public boolean getMotor() {
        return motor;
    }
    public void setChassis(boolean chassis) {
        this.chassis = chassis;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    public void setRodas(boolean rodas) {
        this.rodas = rodas;
    }
}

package aula04.ex6;

public class Main {

    public static void main(String[] args) {
        Fabrica f = new Fabrica();
        for (int i = 0; i < 2; i++) {
            FabricanteChassis fc1 = new FabricanteChassis(f, i);
            fc1.start();
        }
        FabricanteChassis fc1 = new FabricanteChassis(f, i);
        fc1.start();
        FabricanteChassis fc2 = new FabricanteChassis(f, i);
        fc2.start();
        FabricanteMotor fm = new FabricanteMotor(f, i);
        fm.start();
        for (int i = 0; i < 4; i++) {
            FabricanteMotor fm = new FabricanteMotor(f, i);
            fm.start();
        }
        for (int i = 0; i < 2; i++) {
            FabricanteRodas fr = new FabricanteRodas(f, i);
            fr.start();
        }

        sleep(10000);
    }
}

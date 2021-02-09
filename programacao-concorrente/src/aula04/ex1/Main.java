package aula04.ex1;

import testemodelo.ex1.PrimeNumberTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final int VALOR_MAX = 200;


    public static void main(String[] args) {
        List<String> tasks = new LinkedList<String>();

        try {
            Path currentRelativePath = Paths.get("");
            File myObj = new File(currentRelativePath.toAbsolutePath().toString() + "\\programacao-concorrente\\src\\aula04\\ex1/text.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

//        ExecutorService pool = Executors.newFixedThreadPool(6);
//        for (int i = 0; i <  VALOR_MAX; i = i) {
//           ContaPalavras task = new ContaPalavras(i, i);
//            tasks.add(task);
//            pool.submit(task);
//        }
//
//        pool.shutdown();
//        try {
//            pool.awaitTermination(100, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//

    }
}

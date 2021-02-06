package testemodelo.ex1;

import java.util.LinkedList;

public class PrimeNumberTask implements Runnable {

    private int start;
    private int end;
    private LinkedList<Integer> primeList = new LinkedList<>();

    public PrimeNumberTask(int start, int end){
        this.start = start;
        this.end = end;
    }


    public void run(){
        for (int i = start; i <= end; i++) {
            if (isPrime(i)){
                primeList.add(i);
            }
        }
    }

    /*
     * Java method to check if an integer number is prime or not.
     * @return true if number is prime, else false
     */
    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }


    public LinkedList<Integer> getPrimeList() {
        return primeList;
    }
}

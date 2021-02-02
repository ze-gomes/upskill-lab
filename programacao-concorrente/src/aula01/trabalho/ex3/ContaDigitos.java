package aula01.trabalho.ex3;


import java.util.HashMap;

public class ContaDigitos extends Thread {
    String s;
    HashMap<Integer, Integer> contador = new HashMap<Integer, Integer>();

    public ContaDigitos(String s) {
        this.s = s;
    }

    // Converte a String
    public synchronized Integer[] converteString(String s){
        // Separa a string numa array
        String[] splited = s.replaceAll(" ","").split("");
        // Cria array de Integers
        Integer[] numbers = new Integer[splited.length];
        // Converte a array para ints
        for (int i = 0; i < splited.length; i++) {
            numbers[i] = Integer.parseInt(splited[i]);
        }
        return numbers;
    }

    public synchronized void contaNumero(Integer[] numbers, int i){
        // Se o numero ja tiver sido contado (contains Key) ,
        // adiciona mais 1 no contador desse num
        if 	(contador.containsKey(numbers[i])) {
            contador.put(numbers[i], contador.get(numbers[i])+1);
        } else { // Caso contrario inicia o contador a 1
            contador.put(numbers[i], 1);
        }
    }

    // Ex 5 aula 1
    // Imprime os pares ate 1000 com sleep de 1 seg
    public void run() {
        System.out.println("Thread started:" + Thread.currentThread().getName());
        Integer[] numbers = this.converteString(s);
        // Uso um hashmap para contador, com Key os numeros que vão sendo contados,
        // e como Value o contador do numero de vezes que esse numero foi conta
        // No final junta-se os resultados de todos os hashmaps para o contador total
        for (int i = 0; i < numbers.length ; i++) {
            this.contaNumero(numbers, i);
        }
        // Apresenta o total dos resultados para cada thread
        System.out.println(Thread.currentThread().getName() + " Conta Total: " + contador.toString());
    }
}

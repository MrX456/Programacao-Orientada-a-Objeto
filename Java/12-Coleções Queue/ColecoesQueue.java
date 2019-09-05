
//Outro tipo de coleção no java é Queue(fila)

import java.util.PriorityQueue;
import java.util.Queue;

class ColecoesQueue {
    public static void main(String[] args) {
        // Queue/PriorityQueue usa Comparable

        Queue<Integer> numeros = new PriorityQueue<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);

        // Não é preciso estrutura de controle para exibir coleção
        System.out.println(numeros);

        // Temos alguns métodos em Queue
        System.out.println("Remover primeiro elemento");
        System.out.println(numeros.poll()); // Vai remover primeiro elemento levando em conta a ocleção ordenada

        System.out.println(numeros);

        // Podemos adicionar outro elemento com offer()
        System.out.println("Offer");
        System.out.println(numeros.offer(6));
        System.out.println(numeros);

        // Podemos ver o primeiro elemento com peek()
        System.out.println("Peek");
        System.out.println(numeros.peek());

        // Podemos ver o tamanho com size
        System.out.println("Tamanho");
        System.out.println(numeros.size());
    }

}
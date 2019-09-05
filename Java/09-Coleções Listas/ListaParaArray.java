import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListaParaArray {
    public static void main(String[] args) {
        // Podemos transformar uma lista para um Array comum
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(1);
        numeros.add(7);
        numeros.add(4);
        numeros.add(3);
        // Podemos copiar esta lista para dentro de um Array comum
        // O Array deve ser do mesmo tipo da lista
        Integer[] array = new Integer[numeros.size()]; // Array deve ter tamanho da lista
        numeros.toArray(array); // array vai receber a lista numeros

        // Podemos usar método sort para ordenar array
        Arrays.sort(array);

        System.out.println("Array");
        // exibindo array
        for (Integer i : array)
            System.out.println(i);
    }
}
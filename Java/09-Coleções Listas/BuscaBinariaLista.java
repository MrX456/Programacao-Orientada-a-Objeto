import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BuscaBinariaLista {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(2);
        numeros.add(1);
        numeros.add(7);
        numeros.add(4);
        numeros.add(3);

        // Para fazer uma busca em uma lista temos o método binarySearch()
        // para este método ser utilizado, primeiro a lista deve ser ordenada
        Collections.sort(numeros);
        // Esta lista possui indices de 0 a 5
        int indice = Collections.binarySearch(numeros, 2); // Vamos procurar numero 2
        System.out.println("O numero 2 esta no indice " + indice);

        // Caso a busca não encontre veremos um número negativo
        int indice2 = Collections.binarySearch(numeros, 8);
        System.out.println("O numero 8 esta no indice " + indice2);
    }
}
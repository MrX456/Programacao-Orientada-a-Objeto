import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ArrayParaLista {
    public static void main(String[] args) {
        // Podemos tranformar um Array comum em uma lista
        Integer[] array = { 1, 4, 3, 2, 6 };

        // Vamos criar uma lista que vai receber este array
        List<Integer> lista = Arrays.asList(array);

        // Podemos ordenar com Collections.sort()
        Collections.sort(lista);

        System.out.println("Lista");
        for (Integer i : lista)
            System.out.println(i);

        // Obs: utilizando asList() tanto array como lista compartilham a mesma
        // referencia,
        // tudo que for feito em um será automaticamente alterado no outro.

        // Caso isto não seja desejado podemos utilizar uma outra maneira
        List<Integer> lista2 = new ArrayList<>();
        // Podemos adicionar todos elementos do array
        lista2.addAll(Arrays.asList(array));

        // Podemos remover um elemento da lista2(indice 2) sem alterar o array
        lista2.remove(2);

        System.out.println("Lista 2");
        for (Integer i : lista2)
            System.out.println(i);

        // Agora esta lista e o array não compartilham a mesma referencia
    }

}
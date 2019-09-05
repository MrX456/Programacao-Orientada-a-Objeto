import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

//As coleções do tipo Map também podem ser feitas utilizando NavigableMap/TreeMap

class ColecaoNavigableMap {
    public static void main(String[] args) {
        // Vamos usar Strings para compor coleção
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "aviao");
        map.put("O", "onibus");
        map.put("C", "carro");
        map.put("B", "barco");

        // Assim como em coleções set Navigable/TreeSet ja ordena coleção pois
        // implementa Comparable. A ordenação é feita tendo como base a chave
        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getKey() + "  " + entry.getValue());

        // Temos alguns métodos neste tipode coleção
        System.out.println("Metodo headMap");

        // Este método retorna as chaves que vem antes da chave passada como parâmetro
        System.out.println(map.headMap("C"));
        System.out.println(map.headMap("C", true)); // Se passarmos um boolean true esta chave "C" será incluida

        System.out.println("Map na ordem inversa");
        // Retorna o Map na ordem inversa
        System.out.println(map.descendingMap());

        System.out.println("Primeiro chave/valor");
        // Remove primeiro chave/valor deste Map
        System.out.println(map.pollFirstEntry());

        System.out.println("Ultimo chave/valor");
        // Remove ultimo chave/valor deste Map
        System.out.println(map.pollLastEntry());

        // Chaves/valores removidos
        System.out.println(map.descendingMap());
    }
}
import java.util.LinkedHashMap;
import java.util.Map;

//Utilizando o LinkedHashMap a ordem de inserção dos elementos é mantida

public class ColecaoLinkedHashMap {
    public static void main(String[] args) {
        // Em performance tanto HashMap como LinkedeHashMap são identicos
        Map<String, String> map = new LinkedHashMap<>();
        map.put("carro", "automovel");
        map.put("onibus", "transporte");
        map.put("aviao", "aviao");
        map.put("trem", "trem");

        // Para iterar um Map fazemos:
        // Podemos iterar pela chave
        System.out.println("Iterando chave");
        for (String chave : map.keySet())
            System.out.println(chave);

        System.out.println("++++++++++++++++");

        // Podemos iterar pelo valor
        System.out.println("Iterando valor");
        for (String valor : map.values())
            System.out.println(valor);

        System.out.println("++++++++++++++++");

        // Também podemos iterar por ambos
        System.out.println("Iterando por ambos");
        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getKey() + "  " + entry.getValue());

        // A ordem de inserção foi mantida pois foi utilizado LinkedHashMap
    }
}

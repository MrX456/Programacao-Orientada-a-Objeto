import java.util.HashMap;
import java.util.Map;

//Coleçoes do tipo Map se diferem por conter chave/valor
//HashMap é deste tipo de coleção

public class ColecaoHashMap {
    public static void main(String[] args) {
        // Coleções do tipo Map requerem chave/valor
        Map<String, String> map = new HashMap<>();
        // Para adiconar elementos na coleção
        // NÃO podem existir chaves duplicadas
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
    }
}
//Também temos métodos genéricos em Java

public class MetodoGenerico {
    public static void main(String[] args) {
        // Vamos criar 2 arrays de tipos diferentes
        Integer[] numeros = { 2, 5, 1, 6, 4 };
        Character[] letras = { 'c', 'v', 'r', 't' };

        // Agora podemos passar qualquer array de qualquer tipo ao método genérico
        // e ele vai funcionar
        imprimir(numeros);
        imprimir(letras);

        // Vamos testar com outros tipos de arrays
        Byte[] b = { 2, 5, 7, 4 };
        String[] nomes = { "Bruna", "Natalia", "Maria" };
        Double[] d = { 2.3, 3.2, 4.1, 5.2 };
        Boolean[] logico = { true, false, 3 < 1, 2 != 3, 1 <= 1 };

        imprimir(b);
        imprimir(nomes);
        imprimir(d);
        imprimir(logico);
    }

    // Vamos criar um método genérico e passar como paramêtro cada um dos arrays
    // que são de tipos diferentes. Para isto usamos <T>
    public static <T> void imprimir(T[] t) {
        // Este método imprime o array passado como parâmetro
        System.out.println("---------------------------");
        System.out.println(t.getClass()); // Mostrando tipo de dado

        for (T x : t) {
            System.out.printf("%s ", x);
        }

        System.out.println("\n---------------------------");
    }
    // Este método genérico aceita como parâmetro qualquer tipo de array
}
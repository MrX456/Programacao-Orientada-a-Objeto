//Os métodos genéricos também podem retornar dados
public class MetodoGenerico2 {
    public static void main(String[] args) {
        //Vamos passar diversos tipo de dados ao método genérico que retorna o maior valor
        System.out.println("Integer maximo");
        System.out.println(valorMaximo(11, 24, 6));
        
        System.out.println("-------------------");
        
        System.out.println("Double maximo");
        System.out.println(valorMaximo(2.5, 3.1, 4.6));
        
        System.out.println("-------------------");
        
        System.out.println("Char maximo");
        System.out.println(valorMaximo('v', 's', 'a'));
        
        System.out.println("-------------------");
        
        System.out.println("String maximo");
        System.out.println(valorMaximo("Ana", "Bruna", "Carol"));
                
    }
    
    //Agora criaremos um método genérico que retorna o maior valor
    //para isto precisaremos de objetos que herdam de Comparable(usamos extends)
    //o tipo de retorno será genérico porque qualquer tipo poderá ser usado neste método
    public static <T extends Comparable<T>> T valorMaximo(T a, T b, T c) {
        T maximo = a;
        
        if(b.compareTo(a) > 0)
            maximo = b;
        
        if(c.compareTo(maximo) > 0)
            maximo = c;
        
        return maximo;
    }
    
}
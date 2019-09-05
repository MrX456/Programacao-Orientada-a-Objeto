import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//Podemos iterar uma lista através da classe ListIterator
public class Iterator {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Paulo");
        nomes.add("Luis");
        nomes.add("Pedro");
        nomes.add("Alice");
        nomes.add("Joana");
        
        //Agora amos utilizar o ListIterator(deve ser mesmo tipo do ArrayList)
        ListIterator<String> itr = nomes.listIterator();
        //Lista nomes foi passada ao ListIterator
        
        //Este método verifica se a lista possui um valor seguinte hasNext()
        while(itr.hasNext())
            System.out.println(itr.next()); //Vai imprimir todos valores da lista enquanto hover um próximo elemento
        
        //Podemos iterar a lista de forma reversa com hasPrevious()
        System.out.println("Iteracao Reversa");
        
        while(itr.hasPrevious())
            System.out.println(itr.previous());
                
    }
}
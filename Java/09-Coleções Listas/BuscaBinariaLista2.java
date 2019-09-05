import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Vamos ordenar produto por nome implementando Interface Comparator em uma nova classe
class Produto implements Comparable<Produto> {
    private String serialNumber;
    private String nome;
    private double preco;

    // Construtor
    public Produto(String serialNumber, String nome, double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    // Vamos sobrepor hashCode() e equals() e toString()
    @Override
    public int hashCode() {
        return serialNumber != null ? serialNumber.hashCode() : -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Objetos iguais
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false; // Classes diferentes

        Produto produto = (Produto) obj; // Downcast do objeto

        return serialNumber != null ? serialNumber.equals(produto.serialNumber) : produto.serialNumber == null;
    }

    @Override
    public String toString() {
        return "Produto{" + "serial number = " + serialNumber + "\n" + "nome = " + nome + "\n" + "preco = " + preco
                + "}";
    }

    // Implementação obrigatória do método da interface Comparable
    @Override
    public int compareTo(Produto o) {
        // Aqui podemos ordenar por qualquer um dos atributos desta classe
        // Ordenaremos por serialNumber
        return this.serialNumber.compareTo(o.getSerialNumber());
        // Podemos oredenar por qualquer outro atributo mudando o código de retorno
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}

// Vamos ordenar produto por nome implementando Interface Comparator em uma nova
// classe
class ProdutoNome implements Comparator<Produto> {

    // É necesario implementar método da Interface
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
        // Agora podemos fazer a ordenação por nome
    }

}

class BuscaBinariaLista2 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("1234", "Notebook Lenovo", 2300.00));
        produtos.add(new Produto("4321", "Playstation 4 Slim", 1580.00));
        produtos.add(new Produto("2018", "Iphone XR", 7399.00));
        produtos.add(new Produto("3215", "GTX 1080 Ti", 3999.00));

        // Para ordenar vamos usar método sort de Colections e usar a classe ProdutoNome
        Collections.sort(produtos, new ProdutoNome());

        // Vamos instanciar um novo produto para buscar na lista
        Produto prod = new Produto("2130", "Xbox One S", 1200.00);
        // Vamos busca-lo na lista. Como foi utilizado Comparator, devemos passar
        // o construtor da classe que implementou como parâmetro
        int indice = Collections.binarySearch(produtos, prod, new ProdutoNome());
        System.out.println(indice);
        // este produto não está na lista

        Produto prod2 = new Produto("1234", "Notebook Lenovo", 2300.00);
        int indice2 = Collections.binarySearch(produtos, prod2, new ProdutoNome());
        System.out.println(indice2);
        // este produto possui indice 2 na lista ordenada por nome

        System.out.println("Lista ordenada por nome");
        for (Produto produto : produtos)
            System.out.println(produto + "\n");
    }
}
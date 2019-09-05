import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

//Coleções do tipo Map se diferem das outras por conter chave/valor
//HashMap é um tipo de coleção.

class Produto implements Comparable<Produto> {
    private String serialNumber;
    private String nome;
    private double preco;
    private int qtde;

    // Construtor
    public Produto(String serialNumber, String nome, double preco, int qtde) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
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
                + " " + getQtde() + "}";
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

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
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

class ColecaoNavigableSet {
    public static void main(String[] args) {
        // A coleção será criada utilizando NavigableSet e TreeSet
        NavigableSet<Produto> produtos = new TreeSet<>();
        produtos.add(new Produto("1234", "Notebook Lenovo", 2300.00, 0));
        produtos.add(new Produto("4321", "Playstation 4 Slim", 1580.00, 8));
        produtos.add(new Produto("2018", "Iphone XR", 7399.00, 0));
        produtos.add(new Produto("3215", "GTX 1080 Ti", 3999.00, 4));
        // Esta classe ja implementa Comparator e Comparable

        // Objetos a serem adicionados em NavigableSet/TreeSet devem implementar
        // Comparable ou Comparator
        // ou teremos uma exceção
        // Caso passasemos o Comparator no construtor também podemos adicionar objeto em
        // TreeSet

        System.out.println("Colecoes NavigableSet / TreeSet");

        // O NavigableSet/TreeSet já ordena os elementos automaticamente
        for (Produto p : produtos)
            System.out.println(p);
        // Conforme definido ordenação é feita por serialNumber

        System.out.println("Ordem Decrescente por serial number");
        // Temos um método que faz a exibição em ordem decrescente
        for (Produto p : produtos.descendingSet())
            System.out.println(p);
    }
}
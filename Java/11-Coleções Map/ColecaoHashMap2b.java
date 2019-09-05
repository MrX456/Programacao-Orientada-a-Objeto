import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Podemos usar o Hashmap em nossas próprias classes

//Vamos criar uma nova classe(Consumidor comprará produto)
class Consumidor {
    private String nome;
    private String cpf;

    public Consumidor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Vamos sobrepor hashCode() e equals() e toString()
    @Override
    public int hashCode() {
        return cpf != null ? cpf.hashCode() : -1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Objetos iguais
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false; // Classes diferentes

        Consumidor consumidor = (Consumidor) obj; // Downcast do objeto

        return cpf != null ? cpf.equals(consumidor.cpf) : consumidor.cpf == null;
    }

    @Override
    public String toString() {
        return "Consumidor{" + "nome = " + nome + "\n" + "cpf = " + cpf + "}";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}

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

class ColecaoHashMap2b {
    public static void main(String[] args) {
        // Vamos instanciar 2 consumidores
        Consumidor c1 = new Consumidor("Marcia Silva", "123.456.789-0");
        Consumidor c2 = new Consumidor("Andreia Souza", "132.456.789-0");

        // Vamos intanciar alguns produtos
        Produto p1 = new Produto("1234", "Notebook Lenovo", 2300.00, 2);
        Produto p2 = new Produto("4321", "Playstation 4 Slim", 1580.00, 8);
        Produto p3 = new Produto("2018", "Iphone XR", 7399.00, 0);
        Produto p4 = new Produto("3215", "GTX 1080 Ti", 3999.00, 4);

        // Agora um consumidor poderá comprar varios produtos, então colocaremos
        // os produtos comprados por um determinado consumidor em uma lista
        List<Produto> compraC1 = new ArrayList<>();
        compraC1.add(p1);
        compraC1.add(p2);

        // Esta outra lista contem os produtos comprados pelo consumidor 2
        List<Produto> compraC2 = new ArrayList<>();
        compraC2.add(p2);
        compraC2.add(p3);
        compraC2.add(p4);

        // Agora vamos montar o HashMap utilizando as listas como valor do respectivo
        // consumidor que fez a compra
        Map<Consumidor, List<Produto>> compras = new HashMap<>();
        compras.put(c1, compraC1); // Lista de compra do consumidor 1
        compras.put(c2, compraC2); // Lista de compra do consumidor 2

        // Exibindo as lista de compras(Vamos exibir apenas nome do consumidor
        // e nome e valor do produto que ele comprou)
        for (Map.Entry<Consumidor, List<Produto>> compra : compras.entrySet()) {
            System.out.println(compra.getKey().getNome()); // Nome do consumidor
            for (Produto produto : compra.getValue())
                System.out.println(produto.getNome() + " R$" + produto.getPreco());
            // Será exibido nome e preço do produto
        }

    }
}
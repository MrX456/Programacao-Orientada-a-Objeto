import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

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

class ColecaoNavigableMap2 {
    public static void main(String[] args) {
        // A chave de um NavigableMap/TreeMap deve implementar Comparable
        // então Produto deve ser a chave(senão teremos uma exceção)

        // Vamos instanciar 2 consumidores
        Consumidor c1 = new Consumidor("Marcia Silva", "123.456.789-0");
        Consumidor c2 = new Consumidor("Andreia Souza", "132.456.789-0");
        Consumidor c3 = new Consumidor("Pedro Santana", "147.456.789-0");
        Consumidor c4 = new Consumidor("Vanessa Santos", "140.456.789-0");

        // Vamos intanciar alguns produtos
        Produto p1 = new Produto("1234", "Notebook Lenovo", 2300.00, 2);
        Produto p2 = new Produto("4321", "Playstation 4 Slim", 1580.00, 8);
        Produto p3 = new Produto("2018", "Iphone XR", 7399.00, 0);
        Produto p4 = new Produto("3215", "GTX 1080 Ti", 3999.00, 4);

        // Construção do Map
        NavigableMap<Produto, Consumidor> comprador = new TreeMap<>();
        comprador.put(p2, c2);
        comprador.put(p4, c1);
        comprador.put(p3, c3);
        comprador.put(p1, c4);

        // Exibindo map(chave produto está ordenada por serial number[Comparable])
        for (Map.Entry<Produto, Consumidor> c : comprador.entrySet())
            System.out.println(c.getKey() + "  COMPRADO POR  " + c.getValue());
    }
}
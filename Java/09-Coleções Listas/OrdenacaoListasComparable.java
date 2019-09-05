import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Para ordenar uma lista de objetos podemos usar a interface Comparable
//para isso nossa classe deve implementá-la
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
        // Podemos ordenar por qualquer outro atributo mudando o código de retorno
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

public class OrdenacaoListasComparable {
    public static void main(String[] args) {
        // Vamos criar uma lista de produtos
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("1234", "Notebook Lenovo", 2300.00));
        produtos.add(new Produto("4321", "Playstation 4 Slim", 1580.00));
        produtos.add(new Produto("2018", "Iphone XR", 7399.00));
        produtos.add(new Produto("3215", "GTX 1080 Ti", 3999.00));

        System.out.println("Ordenacao por serial number");

        // Para ordenar vamos usar método sort de Colections
        Collections.sort(produtos);
        // Exibindo a lista
        for (Produto produto : produtos)
            System.out.println(produto + "\n");

        // Está por ordem de serial number(menor para maior)
    }
}
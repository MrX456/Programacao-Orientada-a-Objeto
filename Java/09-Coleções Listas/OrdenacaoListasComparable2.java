import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Para ordenar uma lista de objetos podemos usar a Interface Comparable
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
        // Agora ordenaremos por preço, porem tipos primitivos(como double) não
        // possuem métodos que possam ser usados no compareTo(), então faremos:
        Double p = preco;
        return p.compareTo(o.getPreco());
        // Apenas classes invólucro podem ser usadas no comapreTo()
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

class OrdenacaoListasComparable2 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("1234", "Notebook Lenovo", 2300.00));
        produtos.add(new Produto("4321", "Playstation 4 Slim", 1580.00));
        produtos.add(new Produto("2018", "Iphone XR", 7399.00));
        produtos.add(new Produto("3215", "GTX 1080 Ti", 3999.00));

        // Para ordenar vamos usar método sort de Colections
        Collections.sort(produtos);
        // Exibindo a lista
        for (Produto produto : produtos)
            System.out.println(produto + "\n");

        // Ordenação agora é por preço
    }
}
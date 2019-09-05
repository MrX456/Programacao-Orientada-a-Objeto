import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

//Podemos remover itens de uma lista através do Iterator, ja que não é possivel
//fazer isto em tempo de execução usando estruturas de repetição
class Produto implements Comparable<Produto> {
    private String serialNumber;
    private String nome;
    private double preco;
    private int qtde;
    
    //Construtor
    public Produto(String serialNumber, String nome, double preco, int qtde) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }
    
    
    //Vamos sobrepor hashCode() e equals() e toString()
    @Override
    public int hashCode() {
        return serialNumber != null ? serialNumber.hashCode() : -1;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) //Objetos iguais
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false; //Classes diferentes
        
        Produto produto = (Produto) obj; //Downcast do objeto
        
        return serialNumber != null ? serialNumber.equals(produto.serialNumber) : produto.serialNumber == null;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "serial number = " + serialNumber + "\n"
                + "nome = " + nome + "\n" + "preco = " + preco + " "
                + getQtde() + "}";
    }
    
     //Implementação obrigatória do método da interface Comparable
    @Override
    public int compareTo(Produto o) {
        //Aqui podemos ordenar por qualquer um dos atributos desta classe
        //Ordenaremos por serialNumber
        return this.serialNumber.compareTo(o.getSerialNumber());
        //Podemos oredenar por qualquer outro atributo mudando o código de retorno
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

//Vamos ordenar produto por nome implementando Interface Comparator em uma nova classe
class ProdutoNome implements Comparator<Produto> {

    //É necesario implementar método da Interface
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
        //Agora podemos fazer a ordenação por nome
    }
    
}
class RemocaoIterator {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("1234", "Notebook Lenovo", 2300.00, 0));
        produtos.add(new Produto("4321", "Playstation 4 Slim", 1580.00, 8));
        produtos.add(new Produto("2018", "Iphone XR", 7399.00, 0));
        produtos.add(new Produto("3215", "GTX 1080 Ti", 3999.00, 4));
        
        //Todos produtos em qtde = 0 serão removidos da lista
        //Para isto temos que usar o Iterator
        Iterator<Produto> itrProd = produtos.iterator();
        while(itrProd.hasNext()){
            if(itrProd.next().getQtde() == 0){
                itrProd.remove();
            }
        }
        
        //Agora podemos ver que todos produtos em qtde = 0 foram removidos da lista
        for(Produto p : produtos)
            System.out.println(p);
    }
}
//Em Java o método equals() é utilizado para fazer comparações entre objetos
//(objetos são mais complexos do que tipos primitivos para se usar operadores lógicos)

abstract class Veiculo {
    private String marca;
    String modelo;

    //Construtor
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
  
}

final class Carro extends Veiculo {
    private String cor;
    private int potencia;

    public Carro(String marca, String modelo, String cor, int potencia) {
        super(marca, modelo);
        this.cor = cor;
        this.potencia = potencia;
    }
    
    //Utilizando o equals de Object
    //Mesmo que objetos sejam identicos o que está sendo comparado é o endereço
    //na memória de cada um. Se usarmos dois construtores, temos 2 endereços
    //diferentes, portanto será retornado false
    
    //Se quisermos comparar um ou mais atributos dos objetos, teremos que sobrepor
    //o método equals da classe Object
    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(this == obj)
            return true;
        if(this.getClass() != obj.getClass()) //Objetos de classes diferentes
            return false;
        Carro carro = (Carro) obj; //Cast para converter obj em carro
        //Vamos verificar se modelo dos carros são iguais
        return modelo != null ? modelo.equals(carro.getModelo()) : false;
        //Se modelo não for nulo vai comparar os dois atributos modelo para
        //verificar se são iguais usando o equals original
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    
}
public class MetodoEquals {
    public static void main(String[] args) {
        //Vamos instanciar alguns objetos e compara-los usando metodo equals
        //no método da classe Object, o que está sendo comparado é o endereço de memória
        //dos objetos, não seu conteúdo
        
        //Nosso equals vai comparar apenas atributo modelo dos objetos
        
        Carro c1 = new Carro("Nissan", "Skyline", "Azul", 330);
        Carro c2 = new Carro("Nissan", "Skyline", "Azul", 330);
        
        //Atributos modelo são iguais portanto o equals sobreposto retornará true e não false como o original
        System.out.println(c1.equals(c2));
        
        //Ja para modelos diferentes nosso equals vai retornar false
        Carro c3 = new Carro("Toyota", "Supra", "Prata", 310);
        System.out.println(c1.equals(c3));
    }
}
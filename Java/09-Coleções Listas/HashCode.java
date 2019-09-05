//O método hashCode acompanha o equals, é como se agrupassemos objetos com uma
//determinada caracteristica em comum dentro de uma caixa com um código. Também
//podemos ter hashCodes unicos para cada objeto se quisermos.
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
    
    //Vamos sobrepor o método hashCode que pertence a classe Object
   @Override
   public int hashCode(){
       return modelo!= null ? modelo.hashCode() : -1;
   }
   //Será retornado um código da tabela hash tendo como base atributo modelo
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
    //Se atributo modelo for igual será retornado o mesmo hashcode dos objetos
   
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

public class HashCode {
    public static void main(String[] args) {
        //Vamos instanciar alugns objetos
        Carro c1 = new Carro("Nissan", "Skyline", "Azul", 330);
        Carro c2 = new Carro("Nissan", "Skyline", "Branco", 330);
        Carro c3 = new Carro("Toyota", "Supra", "Prata", 310);
        Carro c4 = new Carro("Audi", "R8", "Preto", 550);
        
        //Imprimindo o hashcode de cada objeto
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
        
        //Como podemos ver carros que possuem atributo modelo iguais terão o mesmo
        //hashcode(isto foi definido no equals sobreposto)
    }
}
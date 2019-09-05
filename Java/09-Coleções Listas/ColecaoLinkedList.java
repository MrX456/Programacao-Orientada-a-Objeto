import java.util.LinkedList;

//Outro tipo de coleção em forma de lista é o LinkedList
abstract class Veiculo {
    private String marca;
    String modelo;

    // Construtor
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

// Classe herda de Veiculo
final class Carro extends Veiculo {
    private String cor;
    private int potencia;

    public Carro(String marca, String modelo, String cor, int potencia) {
        super(marca, modelo);
        this.cor = cor;
        this.potencia = potencia;
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

// Classe herda de Veiculo
final class Moto extends Veiculo {
    private String cor;

    public Moto(String marca, String modelo, String cor) {
        super(marca, modelo);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}

public class ColecaoLinkedList {
    public static void main(String[] args) {
        // Agora vamos usar o tipo de coleção LinkedList
        LinkedList<Carro> carros = new LinkedList<>();
        carros.add(new Carro("Nissan", "Skyline", "Branco", 330));
        carros.add(new Carro("Volkswagen", "Golf GTi", "Verde", 230));
        carros.add(new Carro("Chevrolet", "Camaro SS", "Azul", 380));
        carros.add(new Carro("Lamborghini", "Aventador", "Azul", 700));
        carros.add(new Carro("Toyota", "Supra", "Preto", 310));
        carros.add(new Carro("Audi", "R8", "Branco", 550));

        System.out.println("Linked List Carro");

        // Exibindo a lista
        for (Carro car : carros) {
            System.out.println(car.getMarca() + " " + car.getModelo() + " " + car.getCor() + " " + car.getPotencia());
        }

        System.out.println("-----------------------");
        System.out.println("Linked List Moto");

        // Nova LinkedList com objetos de Moto
        LinkedList<Moto> motos = new LinkedList<>();
        motos.add(new Moto("Suzuki", "Hayabusa", "Branco"));
        motos.add(new Moto("Kawasaki", "Ninja ZX12R", "Verde"));
        motos.add(new Moto("Triumph", "Speeed Triple", "Laranja"));
        motos.add(new Moto("Ducati", "1098R", "Vermelho"));

        for (Moto moto : motos) {
            System.out.println(moto.getMarca() + " " + moto.getModelo() + " " + moto.getCor());
        }

        // Podemos ver quantos elementos temos em uma LinkedList com size()
        System.out.println("Tamanho de carros");
        System.out.println(carros.size());
        System.out.println("Tamanho de motos");
        System.out.println(motos.size());

        // A diferença entre ArrayList e LinkedList está na performance
        // LinkedList é mais rápido para adicionar ou remover elementos, ja para
        // uso de metodos get é mais lento em comparação a ArrayList
    }
}
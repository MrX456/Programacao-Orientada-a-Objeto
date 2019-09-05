import java.util.ArrayList;
import java.util.List;

//Coleções são agrupamentos de objetos
//Um tipo de coleção do Java é o ArrayList
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

class ColecaoArrayList {
    public static void main(String[] args) {
        // Vamos organizar os objetos em coleções usando ArrayList
        // Primeiro objetos da classe Carro
        List<Carro> carros = new ArrayList<>();
        // Para adicionar um objeto a lista usar método add()
        carros.add(new Carro("Nissan", "Skyline", "Azul", 330));
        carros.add(new Carro("Toyota", "Supra", "Branco", 310));
        carros.add(new Carro("Ferrari", "F458", "Vermelha", 580));
        carros.add(new Carro("Lamborghini", "Murcielago", "Amarelo", 640));
        carros.add(new Carro("Dodge", "Charger RT", "Preto", 425));

        System.out.println("Lista de Carros");
        // Para percorrer esta lista vamos usar o foreach e vamos exibir todos
        // atributos de cada objeto
        for (Carro car : carros) {
            System.out.println(car.getMarca() + " " + car.getModelo() + " " + car.getCor() + " " + car.getPotencia());
        }

        System.out.println("-------------------------");

        // Agora uma nova lista com objetos de Moto
        List<Moto> motos = new ArrayList<>();
        motos.add(new Moto("Yamaha", "R1", "Azul"));
        motos.add(new Moto("Kawasaki", "Ninja ZX12R", "Verde"));
        motos.add(new Moto("Suzuki", "GS600", "Branco"));

        System.out.println("Lista de Motos");
        // Percorrendo a lista
        for (Moto moto : motos) {
            System.out.println(moto.getMarca() + " " + moto.getModelo() + " " + moto.getCor());
        }

        // ArrayList só permite serem adicionados objetos de uma mesma classe. A classe
        // definida é passada dentro de <>.
    }
}

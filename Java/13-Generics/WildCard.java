
//Vamos criar uma classe abstrata que possui um método abstrato

import java.util.ArrayList;
import java.util.List;

abstract class Veiculo {

    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void abastecer();

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

// Agora 2 subclasses
class Carro extends Veiculo {

    private String cor;

    public Carro(String marca, String modelo, String cor) {
        super(marca, modelo);
        this.cor = cor;
    }

    @Override
    public void abastecer() {
        System.out.println("Gasolina");
    }

}

class Onibus extends Veiculo {

    public Onibus(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void abastecer() {
        System.out.println("Diesel");
    }

}

class WildCard {
    public static void main(String[] args) {
        // Vamos instanciar alguns carros
        Carro c1 = new Carro("Nissan", "Skyline", "Azul");
        Carro c2 = new Carro("Chevrolet", "Camaro", "Amarelo");
        Carro c3 = new Carro("Lamborghini", "Murcielago", "Prata");

        // Vamos coloca-los dentro de um array
        Carro[] carros = { c1, c2, c3 };

        // Faremos o mesmo com onibus
        Onibus o1 = new Onibus("CAIO", "Apache Vip");
        Onibus o2 = new Onibus("Comil", "Svelto");

        Onibus[] onibus = { o1, o2 };

        // vamos chamar o método abastecerVeiculo passando cada aray como parâmetro(um
        // de cada subclasse)
        System.out.println("Carro");
        abastecerVeiculo(carros);

        System.out.println("Onibus");
        abastecerVeiculo(onibus);

        System.out.println("=========================");
        System.out.println("Listas");

        // Agora vamos criar duas listas com os objetos criados
        List<Carro> carrosLista = new ArrayList<>();
        carrosLista.add(c1);
        carrosLista.add(c2);
        carrosLista.add(c3);

        List<Onibus> onibusLista = new ArrayList<>();
        onibusLista.add(o1);
        onibusLista.add(o2);

        // Agora vamos chamar o método que espera uma lista de Veiculo passnado as
        // listas
        // das subclasses como parâmetro
        abastecerVeiculoLista(carrosLista);
        abastecerVeiculoLista(onibusLista);

    }

    // Aqui vamos criar um método abastecerVeiculo para a classe Veiculo passando-se
    // um array como parâmetro
    public static void abastecerVeiculo(Veiculo[] veiculos) {
        for (Veiculo v : veiculos)
            v.abastecer();
    }

    // Este metodo possui a mesma funcionalidade mas ao invés de um array esta
    // utilizando uma lista
    // o Java espera uma lista de Veiculo porém se quisermos usar objetos de suas
    // subclasses devemos
    // usar o caracter ? seguido de extends para indicar que a lista será de objetos
    // de classes que extendem
    // Veiculo(já que não é possivel instanciar objetos de Veiculo)
    public static void abastecerVeiculoLista(List<? extends Veiculo> veiculos) {
        for (Veiculo v : veiculos)
            v.abastecer();
    }
    // OBS: Este método não deve adicionar nenhum novo elemento as listas passadas
    // como parâmetro

}
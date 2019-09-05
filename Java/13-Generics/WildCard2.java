
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
class Carro extends Veiculo implements Comparable {

    private String cor;

    public Carro(String marca, String modelo, String cor) {
        super(marca, modelo);
        this.cor = cor;
    }

    @Override
    public void abastecer() {
        System.out.println("Gasolina");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca = " + getMarca() + "\n" + "modelo = " + getModelo() + "\n" + "cor = " + cor + "}";
    }

}

class Onibus extends Veiculo {

    public Onibus(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public String toString() {
        return "Onibus{" + "marca = " + getMarca() + "\n" + "modelo = " + getModelo() + "}";

    }

    @Override
    public void abastecer() {
        System.out.println("Diesel");
    }

}

class WildCard2 {
    public static void main(String[] args) {
        // Vamos instanciar alguns carros e onibus
        Carro c1 = new Carro("Nissan", "Skyline", "Azul");
        Carro c2 = new Carro("Chevrolet", "Camaro", "Amarelo");
        Carro c3 = new Carro("Lamborghini", "Murcielago", "Prata");

        Onibus o1 = new Onibus("CAIO", "Apache Vip");
        Onibus o2 = new Onibus("Comil", "Svelto");

        // Vamos criar listas
        List<Carro> carrosLista = new ArrayList<>();
        carrosLista.add(c1);
        carrosLista.add(c2);
        carrosLista.add(c3);

        List<Onibus> onibusLista = new ArrayList<>();
        onibusLista.add(o1);
        onibusLista.add(o2);

        adicionarCarroLista(carrosLista);
    }

    // Também podemos utilizar uma Classe e sua Superclasse em uma lista, neste caso
    // podemos adicionar elementos à lista
    public static void adicionarCarroLista(List<? super Carro> carroLista) {
        carroLista.add(new Carro("Ford", "Mustang", "1969"));
        // Somente objetos Carro podem ser adicionados a lista
        for (Object obj : carroLista)
            System.out.println(obj.toString());
        // Aqui nosso objeto de referencia é da classe Object que é superclasse de todas
        // as classes do Java inclusive das que criarmos, como permitimos que as
        // superclasses
        // de Carro podessem ser utilizadas na lista este código será executado sem
        // problemas
    }

}
import java.util.HashSet;
import java.util.Set;

//Outro tipo de coleção em java é HashSet, a pricipal diferença em relação as listas
//é que NÃO são permitidos elementos duplicados em um HashSet e Set não possui indice
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
class Carro extends Veiculo {
    private String cor;
    private String placa;

    public Carro(String marca, String modelo, String cor, String placa) {
        super(marca, modelo);
        this.cor = cor;
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}

public class ColecaoHashSet {
    public static void main(String[] args) {
        // Como HashSet trabalha apenas com elementos unicos, temos agora o atributo
        // placa que será unico em cada objeto Carro não permitindo duplicação
        // Para iniciar um HashSet usamos:
        Set<Carro> carros = new HashSet<>();
        // Para adicionar elemento é igual as listas
        carros.add(new Carro("Nissan", "Skyline", "Branco", "ABC-123"));
        carros.add(new Carro("Nissan", "Skyline", "Branco", "CSV-123")); // Placa diferente
        carros.add(new Carro("Audi", "R8", "Verde", "GRS-125"));
        carros.add(new Carro("Ferrari", "F355", "Vermelho", "ATC-133"));

        System.out.println("HashSet de Carros");

        // Exibindo conteúdo do HashSet
        for (Carro car : carros)
            System.out.println(car.getMarca() + " " + car.getModelo() + " " + car.getCor() + " " + car.getPlaca());

        // Métodos remove(), clear(), entre outros também estão presentes em HashSet
    }
}
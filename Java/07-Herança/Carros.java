//Esta é uma super classe
class Veiculo {
    // A herança é outro pilar importante da orientação a objeto. Uma classe pode
    // herdar atributos e métodos de outra, além de ter seus próprios.
    private String marca;
    private String modelo;
    private int ano;
    protected String combustivel; // Este atributo pode ser acessado diretamente pela subclasse(Carro)

    public void ligarMotor() {
        System.out.println("Motor ligado!");
    }

    // gets e sets

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}

// Esta é uma subclasse de veiculo, isto é indicado pelo uso de extends. Todos
// atributos e métodos de veiculo foram herdados
class Carro extends Veiculo {
    private int tamanhoPortaMalas;

    // Método
    public void abastecer() {
        // Atributo protegido da superclasse pode ser acessado aqui
        combustivel = "gasolina";
        System.out.println("Abastecendo com " + combustivel);
    }

    // gets e sets
    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
}

class Carros {
    public static void main(String[] args) {
        // Vamos instanciar objetos de Carro que herda de Veiculo
        Carro carro1 = new Carro();
        // Atributos herdados de veiculo
        carro1.setMarca("Nissan");
        carro1.setModelo("350Z");
        carro1.setAno(2004);
        // Este pertence a própria classe
        carro1.setTamanhoPortaMalas(200);
        System.out.println(carro1.getMarca() + " " + carro1.getModelo() + " " + carro1.getAno() + " porta-malas : "
                + carro1.getTamanhoPortaMalas() + " litros");

        System.out.print(carro1.getModelo() + " ");
        // Método herdado de Veiculo
        carro1.ligarMotor();

        // Método da própria classe
        carro1.abastecer();

        Carro carro2 = new Carro();
        // Atributos herdados de veiculo
        carro2.setMarca("Chevrolet");
        carro2.setModelo("Camaro");
        carro2.setAno(2013);
        // Este pertence a própria classe
        carro2.setTamanhoPortaMalas(170);
        // Método herdado de Veiculo
        System.out.println(carro2.getMarca() + " " + carro2.getModelo() + " " + carro2.getAno() + " porta-malas : "
                + carro2.getTamanhoPortaMalas() + " litros");
    }
}
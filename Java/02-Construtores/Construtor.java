class Carro {

    // Um construtor pode executar tarefas assim que o objeto é instanciado
    String modelo;
    String cor;
    int ano;

    // Um construtor possui o mesmo nome da classe
    public Carro() {
        modelo = "Camaro";
        cor = "Amarelo";
    }

}

class Construtor {
    public static void main(String[] args) {
        // Assim que objeto é criado ele recebe automaticamente tudo que foi declarado
        // no construtor
        Carro carro1 = new Carro();

        System.out.println("Modelo: " + carro1.modelo + " Cor: " + carro1.cor);

        // Atributo ano não esta no construtor mas podemos colocar depois
        carro1.ano = 2012;

        // Tambem podemos alterar os outros atributos que vieram do Construtor
        carro1.cor = "azul";
        System.out.println("----------------------------------------------------");
        System.out.println("Modelo: " + carro1.modelo + " Cor: " + carro1.cor + " ano: " + carro1.ano);
    }
}
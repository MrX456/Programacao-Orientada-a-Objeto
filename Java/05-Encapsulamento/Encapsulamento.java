class Carro {
    // Em encapsulamento devemos proteger todos atributos da classe
    private String modelo;
    private String cor;
    private int ano;

    // Somente Métodos getters e setters poderão acessar os atributos

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    void ligarMotor() {
        System.out.println("Motor ligado");
    }
}

class Encapsulamento {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        // Atributos estão encapsulados na classe e só podem ser acessados com get e set
        // set para alterar
        carro1.setModelo("Skyline");
        carro1.setCor("azul");
        carro1.setAno(2001);

        // get para retornar valor dos atributos
        System.out.println(carro1.getModelo() + " " + carro1.getCor() + " " + carro1.getAno());
        carro1.ligarMotor();
    }
}
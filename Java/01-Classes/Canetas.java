class Caneta {
    // Atributos desta classe
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    // Métodos
    void destampar() {
        this.tampada = false;
        // Uso do this indica faz referência ao atributo desta classe
    }

    void tampar() {
        if (!this.tampada) { // tampada == false
            this.tampada = true;
        } else {
            System.out.println("Caneta já esta tampada!");
        }
    }

}

// Aqui é a classse prncipal onde sera executado o programa
class Canetas {
    public static void main(String[] args) {
        // Para instanciar um objeto de uma classe usamos
        // NomeClasse nomeObjeto = new NomeClasse()
        Caneta c1 = new Caneta();

        // Agora podemos colocar os atributos deste objeto(foram declarados na classe)
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampada = true;

        // Para exibir todos os atributos
        System.out.println("Objeto c1 atributos");
        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Cor: " + c1.cor);
        System.out.println("Ponta: " + c1.ponta);
        System.out.println("Carga: " + c1.carga);
        System.out.println("Tampada: " + c1.tampada);

        // Chamando Método
        c1.destampar();
        System.out.println("C1 Tampada: " + c1.tampada);
    }
}
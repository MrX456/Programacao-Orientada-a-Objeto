class Caneta {
    // Podemos alterar a visibilade dos atributos e métodos utlizando algumas
    // palavras antes da declaração

    // public: qualquer classe pode acessar estes atributos
    public String modelo;
    public String cor;
    // private: estes atributos só podem ser acessados dentro desta classe
    private float ponta;
    // protected: estes atributos só podem ser usados nesta classe e em suas
    // sub-classes(herança)
    protected int carga;
    protected boolean tampada;

    // O mesmo se aplica aos métodos
    public void escrever() {
        System.out.println("Escrevendo...");
    }

    private void rabiscar() {
        System.out.println("Rabiscando...");
    }
}

class Visibilidade {
    public static void main(String[] args) {
        // Instanciação
        Caneta c1 = new Caneta();
        // Modoficando atributos
        c1.modelo = "BIC";
        c1.cor = "Vermelha";
        // c1.ponta = 0.7f; Isto não é permitido pois este atributo é private e não pode
        // ser alterado por esta classe
        c1.carga = 100; // pode ser alterado pois esta dentro de uma classe que utiliza Caneta
        c1.tampada = true;

        System.out.println("Modelo: " + c1.modelo);
        System.out.println("Cor: " + c1.cor);
        System.out.println("Carga: " + c1.carga);
        System.out.println("Tampada: " + c1.tampada);

        c1.escrever();
        // c1.rabiscar(); Este método é privado e não pode ser invocado aqui
    }
}
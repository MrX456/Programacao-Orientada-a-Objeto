class Caneta {
    String modelo;
    String cor;
    float ponta;

    // Podemos usar construtores com parametros para inserir nos atributos
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    // Vamos fazer um método para mostrar os atributos dos objetos desta classe
    public void mostrar() {
        System.out.println(modelo + " " + cor + " " + ponta);
    }
}

class ConstrutorParametro {
    public static void main(String[] args) {
        // Agora devemos passar os atributos no construtor do objeto
        Caneta c1 = new Caneta("Bic", "azul", 0.5f);
        c1.mostrar();
        Caneta c2 = new Caneta("Faber Castell", "vermelha", 0.7f);
        c2.mostrar();
        Caneta c3 = new Caneta("Bic", "preta", 0.5f);
        c3.mostrar();
    }
}
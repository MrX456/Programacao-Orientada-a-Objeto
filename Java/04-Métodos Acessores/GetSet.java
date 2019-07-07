class Caneta {
    // Alguns atributos estão privados
    public String modelo;
    public String cor;
    private float ponta;

    // Aqui são os métodos acessores(get) e modificadores(set), eles permitem
    // acessar atributos privados
    // devem sempre ser publicos

    public float getPonta() { // Precisa tem retorno do mesmo tipo do atibuto
        return this.ponta; // Retornar atributo ponta desta classe
    }

    // Método set pode modificar atributo privado e não precisa retornar nada
    public void setPonta(float ponta) {// Necessita de um parametro para inserir no atributo DESTA classe
        this.ponta = ponta;
    }

}

class GetSet {
    public static void main(String[] args) {
        // Instanciação
        Caneta c1 = new Caneta();
        c1.modelo = "Faber Castell";
        c1.cor = "verde";
        // Para mexer no atributo privado usar método set
        c1.setPonta(0.5f);

        // Para exibir os atributos
        System.out.println(c1.modelo);
        System.out.println(c1.cor);
        // Para exibir atributo privado precisamos do get
        System.out.println(c1.getPonta());
    }
}
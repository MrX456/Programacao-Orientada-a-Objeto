//Para usar uma classe genérica devemos colocar <> depois do nome da classe
class Generica<X, Y> {
    private X valor1;
    private Y valor2;

    // Construtor
    public Generica(X valor1, Y valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public X getValor1() {
        return valor1;
    }

    public Y getValor2() {
        return valor2;
    }

}

class ClasseGenerica {
    public static void main(String[] args) {
        // A classe é generica, vamos instanciar um objeto dela
        Generica g1 = new Generica("Suzana", 10);
        // Temos uma String e um inteiro no construtor
        System.out.println(g1.getValor1() + " " + g1.getValor2());

        Generica g2 = new Generica(true, 1.3);
        // O construtor aceitará qualquer tipo de dado pois classe é genérica
        // agora temos um boolean e um double
        System.out.println(g2.getValor1() + " " + g2.getValor2());

        // Se quisermos utilizar 2 inteiros no construtor e soma-los
        // devemos usar a classe Integer(tipos primitivos não são aceitos)

        Generica<Integer, Integer> soma = new Generica<>(3, 5);
        System.out.println(soma.getValor1() + soma.getValor2());
        // Forçamos com que parâmetros fossem Integer e fizemos a soma deles
    }
}

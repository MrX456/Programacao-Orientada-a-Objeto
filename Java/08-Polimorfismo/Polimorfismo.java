// Em POO Polimorfismo é executar uma mesma tarefa de varias formas diferentes.
//Isto é aplicado a um método que pode ter diversos códigos diferentes

abstract class Animal { // Não pode instanciar objetos
    private double peso;
    private int idade;
    private int membros;

    // Os métodos serão abstratos portando não serão implementados aqui
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();

    // gets e sets

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

}

// Extensão de Animal
class Mamifero extends Animal {
    private String corPelo;

    // Métodos de Animal implementados
    // @override indica sobrescrita de método que é um tipo de polimorfismo. O mesmo
    // método
    // deve estar em classes diferentes mas deve ter mesmo tipo de retorno e qtde de
    // parametros(assinatura)

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

    // gets e sets

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}

// Extensão de Animal
class Reptil extends Animal {
    private String corEscama;

    // Sobrepondo métodos novamente

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    // gets e sets

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

// Extensão de Animal
class Peixe extends Animal {
    private String corEscama;

    // Sobrepondo métodos

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Nao faz som");
    }

    // Este método é final portanto não pode ser sobreposto em outra classe
    public final void soltarBolhas() {
        System.out.println("Soltando bolhas");
    }

    // gets e sets

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

class Ave extends Animal {
    private String corPena;

    // Sobreposição dos métodos

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    // Método final não pode ser sobrescrito
    public final void fazerNinho() {
        System.out.println("Construindo ninho");
    }

    // gets e sets

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}

class Polimorfismo {
    public static void main(String[] args) {
        // Vamos instanciar objetos das classes com exceção de Animal que é abstrata
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        System.out.println("Metodos locomover, alimentar e emitir som");
        System.out.println("Mamifero");
        m.setPeso(25.6);
        m.setCorPelo("Marrom");
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println("-------------------------");

        System.out.println("Ave");
        a.locomover();
        a.alimentar();
        a.emitirSom();

        System.out.println("-------------------------");

        System.out.println("Peixe");
        p.locomover();
        p.alimentar();
        p.emitirSom();

        System.out.println("-------------------------");

        System.out.println("Reptil");
        r.locomover();
        r.alimentar();
        r.emitirSom();
    }
}
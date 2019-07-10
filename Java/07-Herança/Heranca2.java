//Em herança tambem podemos ter uma espécie de arvore genealogica onde uma classe da origem a outras
// e estas outras dão origem à novas classes e assim por diante

//Esta classe é abstrata portanto objetos desta classe NÃO podem ser instanciados
abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // Método
    public void fazerAniversario() {
        this.idade++;
    }

    // Gets e Sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}

// Classe herda de Pessoa e possui herança pobre ou de implementação
class Visitante extends Pessoa {
    // esta classe terá apenas métodos e atributos de pessoa
}

// Classe herda de Pessoa e possui herança para diferença ja que tambem tem seus
// próprios atributos
// e métodos
class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    // Método
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    // Gets e Sets

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

// Esta classe herda de Aluno(sua superclassse) e como aluno herdou de Pessoa
// esta classe vai herdar de Pessoa tambem(sua ancestral)
// esta classe tambem é final portanto não é possivel ser uma superclasse de
// outra classe(nenhuma classe pode herdar nada desta)
final class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());

    }

    // get e set

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}

class Heranca2 {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); Não permitido pois esta classe é abstrata

        // Estes objetos podem ser instanciados sem problema
        Visitante v1 = new Visitante();
        // Atributos e métodos herdados de pessoa
        v1.setNome("Pedro");
        v1.setIdade(34);
        v1.setSexo("M");
        System.out.println(v1.getNome() + " " + v1.getIdade() + " " + v1.getSexo());
        v1.fazerAniversario();
        System.out.println(v1.getNome() + " " + v1.getIdade() + " " + v1.getSexo());

        // Subclasse Aluno
        Aluno a1 = new Aluno();
        // Herdado
        a1.setNome("Maria");
        a1.setIdade(24);
        a1.setSexo("F");
        // Própria classe
        a1.setMatricula(1024);
        a1.setCurso("Java");
        System.out.println("Aluno (filha de Pessoa)");
        System.out.println(a1.getNome() + " " + a1.getIdade() + " " + a1.getSexo() + " matricula:  " + a1.getMatricula()
                + " curso: " + a1.getCurso());
        a1.pagarMensalidade();

        // Bolsista é Subclasse de Aluno mas tambem herdou de Pessoa
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1242); // herdado de aluno
        b1.setNome("Paula"); // herdado de pessoa
        b1.setSexo("F"); // herdado de pessoa
        b1.setBolsa(15.5);
        System.out.println("Bolsista (filha de aluno e classe final)");
        System.out.println(b1.getNome() + " " + b1.getSexo() + " matricula:  " + b1.getMatricula() + " desconto : "
                + b1.getBolsa());
    }
}
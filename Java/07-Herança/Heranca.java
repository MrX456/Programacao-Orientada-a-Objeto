//superclasse(classe-mãe)
class Pessoa {
    // Esta classe dará origem a outras que herdarão estes atributos e métodos
    private String nome;
    private int idade;
    private String sexo;

    // Métodos
    public void fazerAniversario() {
        this.idade++;
    }

    public String mostrar() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
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

// Esta classe herda todos atributos e métodos de Pessoa portanto é sua
// sub-classe(classe filha)
// Isto é indicado atraves do uso do extends
class Aluno extends Pessoa {
    private int matricula;
    private String curso;

    // Método
    public void cancelarMatricula() {
        System.out.println("Matricula cancelada");
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

// Esta classe tambem herda de Pessoa portanto tambem é sua sub-classe
class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    // método
    public void receberAumento(double aum) {
        this.setSalario(this.getSalario() + aum);
    }

    // gets e sets
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// Esta classe tambem herda de Pessoa portanto tambem é sua sub-classe
class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    // método
    public void mudaTrabalho() {
        this.setTrabalhando(!this.isTrabalhando());
    }

    // gets e sets

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}

class Heranca {
    public static void main(String[] args) {
        // Vamos instanciar objetos das classes
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        // Agora vamos colocar atributo nome que vem de Pessoa mas foi herdado por todas
        // outras classes
        p1.setNome("Pedro"); // Pessoa
        p2.setNome("Maria"); // Aluno
        p3.setNome("Claudio"); // Professor
        p4.setNome("Fabiana"); // Funcionario

        // Todos atributos de Pessoa podem ser utilizados nas suas subclasses
        p1.setIdade(29);
        p2.setIdade(19);
        p3.setIdade(42);
        p4.setIdade(31);

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        // Vamos exibir os atributos
        System.out.println(p1.getNome() + " " + p1.getIdade() + " " + p1.getSexo());
        System.out.println(p2.getNome() + " " + p2.getIdade() + " " + p2.getSexo());
        System.out.println(p3.getNome() + " " + p3.getIdade() + " " + p3.getSexo());
        System.out.println(p4.getNome() + " " + p4.getIdade() + " " + p4.getSexo());

        // Este método vem de Pessoa e pode ser utilizado por qualquer sub-classe dela
        p2.fazerAniversario();
        System.out.println("-----------------");
        System.out.println(p2.getNome() + " " + p2.getIdade() + " " + p2.getSexo());

        // Ja estes atributos são especificos de cada subclasse e não podem ser
        // colocados em uma classe que não os possua
        p2.setCurso("Java");
        p3.setSalario(1800.00);
        p4.setSetor("Estoque");

        // O mesmo se aplica aos métodos
        p3.receberAumento(55.0);
        // p3.cancelarMatricula(); Este método não é desta classe

        System.out.println("--------------------------------------------");

        // Agora vamos exibir as informações
        System.out.println(p1.mostrar());
        System.out.println(p2.mostrar() + " curso: " + p2.getCurso());
        p2.cancelarMatricula();
        System.out.println(p3.mostrar() + " salario com aumento : " + p3.getSalario());
        System.out.println(p4.mostrar() + " setor : " + p4.getSetor());

    }
}
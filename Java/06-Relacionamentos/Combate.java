import java.util.Random;

class Lutador {
    // Atributos encapsulados
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Métodos
    public void apresentar() {
        System.out.println("-------------------------------------------");
        System.out.println("Apresentando o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getPeso() + "kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas e");
        System.out.println(this.getEmpates() + " empates");

    }

    public void status() {
        System.out.println(this.getNome() + " e um peso " + this.getCategoria());
        System.out.println("Ganhou : " + getVitorias());
        System.out.println("Perdeu : " + getDerrotas());
        System.out.println("Empatou : " + getEmpates());
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // Construtor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
            int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // Gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Invalido";
        } else if (this.getPeso() < 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() < 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() < 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}

// Esta classe vai agregar Lutador
class Luta {
    // Como esta classe agrega Lutador, podemos usar a classe Lutador para definir
    // os atributos desta classe
    // todos os métodos de lutador também podem ser invocados aqui
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Tipos de parâmetros são da classe agregada
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("---Desafiado---");
            this.desafiado.apresentar();
            System.out.println("---Desafiante---");
            this.desafiante.apresentar();

            // Vencedor será aleatório
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 ou 2

            switch (vencedor) {
            case 0:// empate
                System.out.println("-------------------------------------------");
                System.out.println("Empate");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;

            case 1:// desafiado vence
                System.out.println("-------------------------------------------");
                System.out.println("Vitoria de " + this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;

            case 2: // desafiante vence
                System.out.println("-------------------------------------------");
                System.out.println("Vitoria de " + this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                break;
            }
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("A luta nao pode acontecer!");
        }
    }

    // Gets e Sets
    // Tipo de retorno é substituido pelo nome da classe agregada(Lutador)

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

// Classe principal
class Combate {
    public static void main(String[] args) {
        // Vamos instanciar oss lutadores em forma de vetor(6 lutadores)
        Lutador l[] = new Lutador[6];

        // Paramêtros necessarios
        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75, 68.9, 11, 2, 1);

        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);

        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.75, 80.9, 12, 2, 1);

        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93, 81.5, 13, 0, 2);

        l[4] = new Lutador("UfoCobol", "Brasil", 37, 1.98, 119.3, 5, 4, 3);

        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.91, 105.7, 12, 2, 4);

        // Métodos podem ser chamados
        l[0].apresentar();
        l[1].apresentar();

        // Vamos fazer lutadores lutarem
        Luta luta1 = new Luta();
        luta1.marcarLuta(l[0], l[1]);
        luta1.lutar();

        // Como podemos ver o status dos lutadores foi atualizado
        l[0].status();
        l[1].status();
    }
}
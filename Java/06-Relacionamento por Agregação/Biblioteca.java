interface Publicacao {
    // Métodos da inteface a serem implementados
    public abstract void abrir();

    public abstract void fechar();

    public abstract void folhear(int pag);

    public abstract void avancarpagina();

    public abstract void voltarPagina();
}

class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // método
    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1);
    }

    // Construtor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // gets e sets

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

// Esta classe agrega pessoa e implementa publicacao
class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // Esta classe etsa agregando Pessoa

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual="
                + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + ", idade=" + leitor.getIdade()
                + ", sexo=" + leitor.getSexo() + '}';
    }

    // Construtor

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    // Gets e sets

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // Implementação dos métodos da interface
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if (pag > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = pag;
        }
    }

    public void avancarpagina() {
        this.pagAtual++;
    }

    public void voltarPagina() {
        this.pagAtual--;
    }

}

class Biblioteca {
    public static void main(String[] args) {
        // vamos instanciar livros e pessoas em vetores
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[4];

        // Construir pessoas
        p[0] = new Pessoa("Paulo", 22, "M");
        p[1] = new Pessoa("Maria", 19, "F");
        p[2] = new Pessoa("Sandra", 25, "F");

        // Construir livros
        l[0] = new Livro("A Odisseia", "Homero", 800, p[2]); // Sandra esta lendo este livro
        l[1] = new Livro("Os lusiadas", "Luis de Camoes", 400, p[0]); // Paulo esta lendo este livro
        l[2] = new Livro("Dom Casmurro", "Machado de Assis", 450, p[2]); // Sandra esta lendo este livro
        l[3] = new Livro("O Codigo DaVinci", "Dan Brown", 360, p[1]); // Maria esta lendo este livro

        // Agora podemos usar métodos de Livro, inclusive da Interface publicação
        l[0].abrir(); // abrir livro
        l[0].folhear(200); // folhear ate determinada pagina
        l[0].avancarpagina(); // Avnçar uma pagina (201)

        l[1].abrir();
        l[1].folhear(25);
        l[1].voltarPagina(); // Pagina 24

        l[3].abrir();
        l[3].avancarpagina(); // Pagina 1

        // Vamos verificar os detalhes de cada livro(através do método)
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        System.out.println(l[3].detalhes());

    }
}
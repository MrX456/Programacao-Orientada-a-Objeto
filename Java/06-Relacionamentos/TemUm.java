class Contato {
    private String nome;
    private Endereco endereco; //Contato tem um Endereco
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


   
    
    
}

//Um objeto da classe Contato terá um objeto da classe Endereco
class Endereco {
    private String nomeRua;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
}
class TemUm {
    public static void main(String[] args) {
        //Para instanciar um Contato precisaremos primeiro de um Endereco,
        //pois Contato possui um Endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Tres");
        end.setNumero("n/a");
        end.setComplemento("n/a");
        end.setCidade("São Paulo");
        end.setEstado("São Paulo");
        end.setCep("21149222");
        
        //Este endereco será colocado em um contato
        Contato c1 = new Contato();
        c1.setNome("Maria");
        c1.setTelefone("11 3344-2150");
         
        //Mostrando
        System.out.println(c1.getNome());
        System.out.println(c1.getTelefone());
        
        System.out.println("Informações de endereço");
        
        c1.setEndereco(end);//Objeto end foi passado a c1
        
        //Para evitar Exceções de Ponteiro nulo podemos usar um condicional 
        //ao acessar atributos de endereço pertencentes a contato
        if(c1 != null && c1.getEndereco() != null) {
            System.out.println(c1.getEndereco().getNomeRua());
            System.out.println(c1.getEndereco().getNumero());
            System.out.println(c1.getEndereco().getCidade());
        }
        
    }
}
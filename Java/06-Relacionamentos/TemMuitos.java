class Contato {
    private String nome;
    private String endereco; 
    private Telefone[] telefone; //Contato pode ter muitos telefones portanto usaremos um vetor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Telefone[] getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone[] telefone) {
        this.telefone = telefone;
    }

    
}

//Um contato poderá ter muitos Telefones
class Telefone {
    private String tipo;
    private String ddd;
    private String numero;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}

class TemMuitos {
    public static void main(String[] args) {
        //Vamos instanciar objetos Telefone para atribuir
        //varios telefones a um contato
        Telefone tel = new Telefone();
        tel.setTipo("celular");
        tel.setDdd("11");
        tel.setNumero("98988-2131");
        
        //telefone 2
        Telefone tel2 = new Telefone();
        tel2.setTipo("casa");
        tel2.setDdd("11");
        tel2.setNumero("3322-2151");
        
        //Jogaremos estes telefones para um vetor
        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;
        
        //Vamos intanciar o Contato
        Contato contato = new Contato();
        contato.setNome("Maria");
        contato.setEndereco("Rua Tres");
        //Contato receberá vetor telefones
        contato.setTelefone(telefones);
        
        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco());
        
        System.out.println("Contatos :");
        
        //Para evitar Exceções vamos usar um if
        if(contato != null && contato.getTelefone() != null){
           for(Telefone t : contato.getTelefone()) {
            //Exibindo os atributos ddd e numero dos Telefones atribuidos a contato
               System.out.println(t.getDdd() + " " + t.getNumero());
           }
           //Usamos estrutura de controle for pois o numero de telefones pode variar dependendo do contato
        }
    }
}

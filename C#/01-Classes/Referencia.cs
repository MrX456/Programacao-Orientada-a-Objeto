using System;

class Carro 
{

//Vamos usar como exemplo a classe carro novamente
//Primeiro atributos
    public string nome;
    public string marca;
    public int ano;
    public string cor;
}

class Referencias
{
    static void Main(string[] args)
    {
    //Ao instanciar um objeto o nome dado a ele é uma REFERÊNCIA ao endereço 
    //da memória que vai guardar seus atributos.

        //carro1 é uma referencia a um endereço que guarda estes atributos
        Carro carro1 = new Carro();
        carro1.nome = "Supra" ;
        carro1.marca = "Toyota" ;
        carro1.cor =  "Prata" ;
        carro1.ano = 1998 ;

        //Podemos pegar esta referência e armazenar em outro objeto
        Carro carro2 = carro1;

        //Agora ambos apontam para o mesmo endereço que contém o estes  atributos
        Console.WriteLine("Primeiro Carro instanciado");
        Console.WriteLine("{0}, {1}, {2}, {3}", carro1.marca, carro1.nome, carro1.ano, carro1.cor);

        Console.WriteLine("------------------------");

        Console.WriteLine("Segundo Carro instanciado");
        Console.WriteLine("{0}, {1}, {2}, {3}", carro2.marca, carro2.nome, carro2.ano, carro2.cor);
        //Atributos são iguais

        //Agora vamos alterar a cor do carro2
        carro2.cor = "Azul";

        Console.WriteLine("------------------------");

        //Como os dois objetos compartilham o mesmo endereço o que for alterado em um
        //será alterado no outro automaticamente, valores serão sempre iguais entre eles.
        Console.WriteLine("Alteração feita somente no carro 2");
        Console.WriteLine("Primeiro Carro instanciado");
        Console.WriteLine("{0}, {1}, {2}, {3}", carro1.marca, carro1.nome, carro1.ano, carro1.cor);

        Console.WriteLine("------------------------");

        Console.WriteLine("Segundo Carro instanciado");
        Console.WriteLine("{0}, {1}, {2}, {3}", carro2.marca, carro2.nome, carro2.ano, carro2.cor);

        Console.ReadLine();

    }
}
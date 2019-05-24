using System;

class Carro
{
    //Vamos utilizar os construtores que irão auxiliar na instanciação de um objeto
    //Vamos usar como exemplo a classe carro novamente
    //Primeiro atributos
    public string nome;
    public string marca;
    public int ano;
    public string cor;

    //Agora o construtor terá parametros, estes parametros deverão ser passados
    //durante a instanciação do objeto e serão colocados nos atributos
    public Carro(string nome, string marca, int ano, string cor)
    {
        //Cada atributo da classe receberá como valor um parametro
        //this faz referencia ao atributo desta classe
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
}

class ConstrutoresParametro
{
    static void Main(string[] args)
    {
        //Agora devemos passar os atributos como parametros dentro do construtor
        Carro carro1 = new Carro("A3", "Audi", 2004, "Prata");

        //Vamos mostrar os atributos do carro criado
        Console.WriteLine("{0}, {1}, {2}, {3}", carro1.marca, carro1.nome, carro1.ano, carro1.cor);

        //Vamos criar mais alguns objetos
        Console.WriteLine("-----------------------------------");
        Carro carro2 = new Carro("RX-7", "Mazda", 1995, "Preto");
        Console.WriteLine("{0}, {1}, {2}, {3}", carro2.marca, carro2.nome, carro2.ano, carro2.cor);

        Console.WriteLine("-----------------------------------");
        Carro carro3 = new Carro("Camaro", "Chevrolet", 2014, "Amarelo");
        Console.WriteLine("{0}, {1}, {2}, {3}", carro3.marca, carro3.nome, carro3.ano, carro3.cor);

        Console.ReadLine();
    }
}
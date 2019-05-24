using System;

class Carro
{
    //Agora vamos utilizar os construtores que irão auxiliar na instanciação de um objeto
    //Vamos usar como exemplo a classe carro novamente
    //Primeiro atributos
    public string nome;
    public string marca;
    public int ano;
    public string cor;

    //Aqui vai o método construtor que recebe o mesmo nome da classe
    public Carro()
    {
        nome = "GT-R"; //Por padrão todo carro criado será GT-R
        marca = "Nissan"; //Por padrão todo carro criado será Nissan        
        ano = 2019; //Por padrão todo carro será de 2019
        cor = "Prata"; //Por padrão todo carro criado será Prata
    }
}

class Construtores
{
    static void Main(string[] args)
    {
        //Vamos criar um objeto carro sem passar nenhum atributo
        Carro carro1 = new Carro();

        //Vamos mostrar os atributos do carro criado
        Console.WriteLine("{0}, {1}, {2}, {3}", carro1.marca, carro1.nome, carro1.ano, carro1.cor);
        //Embora não foi passado nenhum atributo, ele recebeu automaticamente os que vieram do construtor
        Console.ReadLine();
    }
}
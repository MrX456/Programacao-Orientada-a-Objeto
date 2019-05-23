using System;

//O uso do static em um método indica que não é necessario instanciar
//um objeto da classe a qual ele pertence utiliza-lo.
class Carro 
{
    public string marca;
    public string modelo;

    //Este método é estático
    public static void desligado() 
    {
        Console.WriteLine("Motor desligado");
    }

    //Este não
    public string ligarMotor() 
    {
        return "Motor ligado";
    }
}

class Programa
{

    static void Main(string[] args)
    {
        //Método estático já pode ser invocado. Não esquecer de colocar a classe a qual ele pertence
        Carro.desligado();

        //Agora o outro método só pode ser invocado se instanciarmos um objeto primeiro
        Carro carro1 = new Carro();
        carro1.marca = "Mazda";
        carro1.modelo = "RX-8";
        Console.WriteLine("{0} {1} : {2}", carro1.marca, carro1.modelo, carro1.ligarMotor());
        Console.ReadLine();
    }
}
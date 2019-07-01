using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace ConsoleApplication1
{
    //Vamos criar duas classes para usar o terceiro conceito de coleção "dicionario"

    //Para organizar coleções usando método dicionario :
    //precisamos de uma chave que seja unica então vamos criar outro atributo que 
    //deverá ser unico em cada carro como a placa por exemplo
    class Carro
    {
        public string marca;
        public string modelo;
        public string placa;

        //construtor
        public Carro(string marca, string modelo, string placa)
        {
            this.marca = marca;
            this.modelo = modelo;
            this.placa = placa;
        }
    }

    //segunda classe
    //O mesmo será feito aqui
    class Moto
    {
        public string marca;
        public string modelo;
        public string placa;

        //Construtor
        public Moto(string marca, string modelo, string placa)
        {
            this.marca = marca;
            this.modelo = modelo;
            this.placa = placa;
        }
    }

    //Metodo principal
    class Colecoes
    {
        static void Main(string[] args)
        {
            //Vamos instanciar alguns objetos
            Carro carro1 = new Carro("Honda", "Nsx", "GML-2453");

            Carro carro2 = new Carro("Ford", "GT", "ASR-1170");

            Carro carro3 = new Carro("Nissan", "GT-R", "BRN-3326");

            Carro carro4 = new Carro("Audi", "TT", "PKR-6234");

            Moto moto1 = new Moto("Yamaha", "R1", "DAT-2689");

            Moto moto2 = new Moto("Ducati", "999R", "EKX-1045");

            Moto moto3 = new Moto("Aprilia", "RSV", "CMZ-7834");

            Moto moto4 = new Moto("Honda", "CBR1100", "KZR-8190");

           //Para criar o diconario usamos: Dictionary<tipo do atributo unico, NomeClasse>
            Dictionary<string, Carro> meusCarros = new Dictionary<string, Carro>();

            //Agora só adicionar os elementos da coleção(lembrando que a placa é um atributo unico em cada carro)
            meusCarros.Add(carro1.placa, carro1);
            meusCarros.Add(carro2.placa, carro2);
            meusCarros.Add(carro3.placa, carro3);
            meusCarros.Add(carro4.placa, carro4);

            //Agora vamos mostrar o carro que possui a placa "BRN-3326"
            Console.WriteLine(meusCarros["BRN-3326"].modelo);

            Console.WriteLine(meusCarros["PKR-6234"].marca);


            Console.ReadLine();
           
        }
    }
}

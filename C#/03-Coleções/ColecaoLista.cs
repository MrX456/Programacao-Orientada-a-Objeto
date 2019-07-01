using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;


namespace ConsoleApplication1
{
    //Vamos criar duas classes para usar o segundo conceito de coleção
    class Carro
    {
        public string marca;
        public string modelo;

        //construtor
        public Carro(string marca, string modelo)
        {
            this.marca = marca;
            this.modelo = modelo;
        }
    }

    //segunda classe
    class Moto
    {
        public string marca;
        public string modelo;

        //Construtor
        public Moto(string marca, string modelo)
        {
            this.marca = marca;
            this.modelo = modelo;
        }
    }

    //Metodo principal
    class Colecoes
    {
        static void Main(string[] args)
        {
            //Vamos instanciar alguns objetos
            Carro carro1 = new Carro("Honda", "Nsx");

            Carro carro2 = new Carro("Ford", "GT");

            Carro carro3 = new Carro("Nissan", "GT-R");

            Carro carro4 = new Carro("Audi", "TT");

            Moto moto1 = new Moto("Yamaha", "R1");

            Moto moto2 = new Moto("Ducati", "999R");

            Moto moto3 = new Moto("Aprilia", "RSV");

            Moto moto4 = new Moto("Honda", "CBR1100");

            //Este conceito de coleção é mais eficiente pois não permite
            //misturar classes, gerando um erro imediato. Usaremos uma lista
            //List<Classe> nomeList = new List<Classe>();

            List<Carro> carros = new List<Carro>();
            //Agora só adicionar
            carros.Add(carro1);
            carros.Add(carro2);
            carros.Add(carro3);
            carros.Add(carro4);

            //Para mostrar
            Console.WriteLine("Coleção de carros");
            foreach(Carro carro in carros)
            {
                Console.WriteLine(carro.marca +" " +carro.modelo);
            }

            

            //Agora o outro tipo
            List<Moto> motos = new List<Moto>();
            motos.Add(moto1);
            motos.Add(moto2);
            motos.Add(moto3);
            motos.Add(moto4);

            Console.WriteLine("Coleção de motos");
            foreach(Moto moto in motos)
            {
                Console.WriteLine(moto.marca +" " +moto.modelo);
            }

            Console.ReadLine();
           
        }
    }
}

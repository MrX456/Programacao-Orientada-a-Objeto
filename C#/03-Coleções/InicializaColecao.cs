using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Carro
    {
        public string marca;
        public string modelo;

        public Carro(string marca, string modelo)
        {
            this.marca = marca;
            this.modelo = modelo;
        }
    }


    class Moto
    {
        public string marca;
        public string modelo;

        public Moto(string marca, string modelo)
        {
            this.marca = marca;
            this.modelo = modelo;
        }
    }


    class Caminhao
    {
        public string marca;
        public string modelo;

        public Caminhao(string marca, string modelo)
        {
            this.marca = marca;
            this.modelo = modelo;
        }
    }


    class Onibus
    {
        public string marca;
        public string modelo;

        public Onibus(string marca, string modelo)
        {
            this.marca = marca;
            this.modelo = modelo;
        }
    }


    class Colecao
    {
        static void Main(string[] args)
        {
            //Cada objeto será inicializado já dentro de sua coleção do tipo list
            Console.WriteLine("Coleção Carros");
            List<Carro> carros = new List<Carro>() {
                new Carro("Nissan", "Skyline"),
                new Carro("Toyota", "Supra"),
                new Carro("Chevrolet", "Camaro SS"),
                new Carro("Audi", "R8"),
                new Carro("Ferrari", "F40"),
                new Carro("Plymouth", "Cuda")
            };

            foreach (Carro carro in carros)
            {
                Console.WriteLine(carro.marca + " " + carro.modelo);
            }

            Console.WriteLine("-----------------------------");

            //Proxima lista
            Console.WriteLine("Coleção Motos");
            List<Moto> motos = new List<Moto>() {
                new Moto("Yamaha", "R1"),
                new Moto("Honda", "CBR1100"),
                new Moto("Triumph", "Speed Triple"),
                new Moto("Aprilia", "RSV"),
                new Moto("Ducati", "999R")
            };

            foreach (Moto moto in motos)
            {
                Console.WriteLine(moto.marca + " " + moto.modelo);
            }


            Console.WriteLine("-----------------------------");

            //Proxima lista
            Console.WriteLine("Coleção Caminhões");
            List<Caminhao> caminhoes = new List<Caminhao>() {
                new Caminhao("Mercedes", "Actros"),
                new Caminhao("Volkswagen", "Constellation"),
                new Caminhao("Iveco", "Stralis"),
                new Caminhao("Ford", "Cargo")
            };

            foreach (Caminhao caminhao in caminhoes)
            {
                Console.WriteLine(caminhao.marca + " " + caminhao.modelo);
            }



            Console.WriteLine("-----------------------------");

            //Proxima lista
            Console.WriteLine("Coleção Ônibus");
            List<Onibus> onibus = new List<Onibus>() {
                new Onibus("Caio", "Apache Vip"),
                new Onibus("Busscar", "Urbanuss"),
                new Onibus("Comil", "Svelto"),
                new Onibus("Caio", "Millennium II"),
                new Onibus("Marcopolo", "Torino"),
            };

            foreach (Onibus bus in onibus)
            {
                Console.WriteLine(bus.marca + " " + bus.modelo);
            }
            Console.ReadLine();

            //Cada objeto foi iniciaializado dentro de sua coleção
        }
    }
}

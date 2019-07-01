using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{

    class Carro 
    {
    //Agora vamos ordenar a coleção
        public string marca;
        public string modelo;
        public string placa;
        public int preco;
        public int ano;
    }


    class OrdenarColecao
    {
        static void Main(string[] args)
        {
            //Criando coleção
            List<Carro> carros = new List<Carro>() { 
                new Carro() {placa = "A1", marca = "Honda", modelo = "Civic Si", preco = 35000, ano = 2006 },
                new Carro() {placa = "B1", marca = "Chevrolet", modelo = "Corvette ZR1", preco = 80000, ano = 2001 },
                new Carro() {placa = "C1", marca = "Audi", modelo = "R8", preco = 350000, ano = 2009 },
                new Carro() {placa = "D1", marca = "Nissan", modelo = "GT-R", preco = 550000, ano = 2014 },
                new Carro() {placa = "E1", marca = "Dodge", modelo = "Viper", preco = 180000, ano = 2005 },
                new Carro() {placa = "F1", marca = "Honda", modelo = "NSX", preco = 65000, ano = 1993 },
                new Carro() {placa = "G1", marca = "Chevrolet", modelo = "Camaro SS", preco = 130000, ano = 2012 },
                new Carro() {placa = "H1", marca = "Dodge", modelo = "Charger", preco = 190000, ano = 2011 },
                new Carro() {placa = "I1", marca = "Nissan", modelo = "Skyline R33", preco = 115000, ano = 1997 },
                new Carro() {placa = "J1", marca = "Dodge", modelo = "Challenger", preco = 125000, ano = 1969 }
            };

            //O nome da coleção é carros
            //Vamos pesquisar e ordenar esta coleção mediante seus atributos

            //Vamos encontrar todos veículos da Dodge nessa lista através de uma query
            //que é parecida com SQL
            //var indica que o compilador decidirá qual é o tipo de dado
            var dodge = from carro in carros
                        where carro.marca == "Dodge"
                        select carro;

            //Agora vamos exibir esta query 
            Console.WriteLine("Primeira Query = Dodge");
            foreach(var carro in dodge)
            {
                Console.WriteLine("{0} {1}", carro.modelo, carro.ano);

            }

            Console.WriteLine("---------------------------");
            //Esta query terá 2 filtros que serão ligados pelo operador &&
            var nissan = from carro in carros
                         where carro.marca == "Nissan"
                         && carro.ano == 1997
                         select carro;

            //Agora vamos exibir esta query que retorna carros que se enquadrem nas duas condições
            Console.WriteLine("Segunda Query = Nissan 1997");
            foreach (var carro in nissan)
            {
                Console.WriteLine("{0} {1}", carro.modelo, carro.ano);

            }

            Console.WriteLine("---------------------------");
            //Agora vamos filtrar todos os Honda
            //dessa vez através de um método da biblioteca Linq
            var honda = carros.Where(carro => carro.marca == "Honda");

            Console.WriteLine("Terceira Query = Honda");
            foreach (var carro in honda)
            {
                Console.WriteLine("{0} {1}", carro.modelo, carro.ano);

            }

            Console.WriteLine("---------------------------");
            //Agora vamos ordenar esta coleção
            //Os critérios serão o ano começando do mais novo
            var ordenaAno = from carro in carros
                            orderby carro.ano descending
                            select carro;

            //Exibindo
            Console.WriteLine("Quarta Query = Por Ano Descendo");
            foreach (var carro in ordenaAno)
            {
                Console.WriteLine("{1} {2} {0}", carro.modelo, carro.ano, carro.marca);

            }


            Console.WriteLine("---------------------------");
            //Agora vamos exibir todos modelos e preços de uma outra maneira
            Console.WriteLine("Quinta Query : Preços");
            carros.ForEach(carro => Console.WriteLine("{0} R${1}", carro.modelo, carro.preco));


            Console.WriteLine("---------------------------");
            //Agora vamos descontar 5000 no preço de cada carro
            Console.WriteLine("Sexta Query : Desconto de 5000 no preço");
            carros.ForEach(carro => carro.preco -= 5000);
            carros.ForEach(carro => Console.WriteLine("{0} R${1}", carro.modelo, carro.preco));


            Console.WriteLine("---------------------------");
            //Agora vamos somar o preço de todos veiculos
            Console.WriteLine("Sétima Query : Soma dos preços");
            Console.WriteLine("R$" +carros.Sum(carro => carro.preco));

            
            Console.WriteLine("---------------------------");
                    

            Console.ReadLine();
            
        }
    }
}

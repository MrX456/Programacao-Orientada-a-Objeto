using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Collections;//Necessario para usar classe array list

namespace ConsoleApplication1
{
    //Vamos criar duas classes para usar o conceito de coleção
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
    class Livro
    {
        public string titulo;
        public string autor;

        //Construtor
        public Livro(string titulo, string autor)
        {
            this.titulo = titulo;
            this.autor = autor;
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

            Livro livro1 = new Livro("A Odisseia", "Homero");

            //Podemos utilizar coleções através de um arrayList
            //todos objetos instanciados farão parte desse array
            //porém mesmo que pertençam a classes diferentes eles podem ser
            //adicionados, e neste caso não queremos misturar carros e livros
            //pois isso poderia acarretar em um erro de execução do programa
            //este tipo de coleção não é muito eficiente, mas se tivermos apenas
            //uma classe pode ser utilizado.

            ArrayList meuArraylist = new ArrayList();
            meuArraylist.Add(carro1); //carro1 vai para este array
            meuArraylist.Add(carro2); //para dentro do array
            meuArraylist.Add(carro3);
            meuArraylist.Add(carro4);
            //meuArraylist.Add(livro1); não pode ser colocado aqui

            //Para mostrar este array list usamos
            //carro é apenas uma variavel local para fazer a iteração,
            //poderia ter qualquer nome
            foreach (Carro carro in meuArraylist)
            {
                Console.WriteLine(carro.marca +" " +carro.modelo);//Vamos mostrar esta coleção
            }
            Console.ReadLine();
        }
    }
}

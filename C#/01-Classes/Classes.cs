using System;


//Programação Orientada a Objeto: Classes

//Vamos criar uma classe e depois vamos instanciar objetos dessa classe facilmente
    class Carro 
    {
        //Primeiro precisamos colocar os atributos dessa classe(variaveis),todos serão publicos
        public string nome;
        public string marca;
        public int ano;
        public string cor;

        //Aqui vamos colocar um método dessa classe.
        //Este método tera um retorno do tipo decimal e será publico
        public decimal valorMercado() 
        {
            decimal valor_mercado;

            if(nome == "Skyline R34")
            {
                valor_mercado = 250000;
            }
            else if (nome == "F430")
            {
                valor_mercado = 750000;
            }
            else 
            {
                valor_mercado = 130000;
            }
            //Agora o retorno
            return valor_mercado;
        }
     
    }

//Aqui esta a classe principal, onde o programa começara a ser executado
    class Principal
    {
        static void Main(string[] args)
        {

    //Para instanciar um objeto da classe criada usamos:
    //NomeClasse nomeObjeto = new NomeClasse();
            Carro carro1 = new Carro();    

        //Agora precisamos passar os atributos desse objeto(foram definidos na classe)
        //portanto para isso usamos: nomeObjeto.nomeAtributo = valor passado;
        //OBS: Podemos receber estes valores por comandos de entrada se necessario
            carro1.nome = "Skyline R34";
            carro1.marca = "Nissan";
            carro1.ano = 2001;
            carro1.cor = "Azul";

        //Agora vamos exibir todos estes atributos na tela
        //Vamos usar a substituição para gerar os espaços entre os atributos e diminuir o código
            Console.WriteLine("Primeiro carro instanciado");
            Console.WriteLine("{0} {1} {2} {3}", carro1.marca, carro1.nome, carro1.ano, carro1.cor);

        //Agora vamos chamar o método da classe Carro que mostra o preço
            Console.WriteLine("{0:C}", carro1.valorMercado());//Vai mostrar valor de mercado do carro1 já formatado em R$

            Console.WriteLine("-----------------------------");

        //Vamos instanciar mais objetos desta classe
            Carro carro2 = new Carro();

            carro2.nome = "F430";
            carro2.marca = "Ferrari";
            carro2.ano = 2007;
            carro2.cor = "Vermelho";

            Console.WriteLine("Segundo carro instanciado");
            Console.WriteLine("{0} {1} {2} {3}", carro2.marca, carro2.nome, carro2.ano, carro2.cor);

            //Apliquemos o método da classe aqui também 
            Console.WriteLine("{0:C}", carro2.valorMercado());

            Console.WriteLine("-----------------------------");

            Carro carro3 = new Carro();

            carro3.nome = "Charger";
            carro3.marca = "Dodge";
            carro3.ano = 1969;
            carro3.cor = "Preto";

            Console.WriteLine("Terceiro carro instanciado");
            Console.WriteLine("{0} {1} {2} {3}", carro3.marca, carro3.nome, carro3.ano, carro3.cor);

            Console.WriteLine("{0:C}", carro3.valorMercado());

            Console.ReadLine();
        }
    }


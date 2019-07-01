using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ConsoleApplication1
{
    class Fazer 
    {
        //Aqui vamos utilizar uma enumereção
        public string descricao;
        public int horas;
        public Status situacao;
    }

    //Enumeração
    enum Status 
    {
        NaoIniciado,
        EmProgresso,
        EmEspera,
        Completo,
        Apagado
    }

    class Tarefas
    {
        //Método usando switch vamos mudar a cor do texto dependendo
        //da condição
        private static void mostraAcessos(List<Fazer> tarefas) 
        {
            foreach (var tarefa in tarefas) 
            {
                switch (tarefa.situacao) 
                {
                    case Status.Completo:
                        Console.ForegroundColor = ConsoleColor.Green;
                        break;

                    case Status.NaoIniciado:
                        Console.ForegroundColor = ConsoleColor.Red;
                        break;

                    case Status.EmProgresso:
                        Console.ForegroundColor = ConsoleColor.Yellow;
                        break;

                    case Status.EmEspera:
                        Console.ForegroundColor = ConsoleColor.DarkMagenta;
                        break;

                    case Status.Apagado:
                        Console.ForegroundColor = ConsoleColor.DarkCyan;
                        break;

                    default:
                        break;
                }
                Console.WriteLine(tarefa.descricao);
            }
        }
        static void Main(string[] args)
        {
            //Vamos criar uma coleção
            List<Fazer> tarefas = new List<Fazer>()
            {
                new Fazer {descricao ="Tarefa 1", horas = 6, situacao = Status.Completo},
                new Fazer {descricao ="Tarefa 2", horas = 2, situacao = Status.EmProgresso},
                new Fazer {descricao ="Tarefa 3", horas = 8, situacao = Status.NaoIniciado},
                new Fazer {descricao ="Tarefa 4", horas = 12, situacao = Status.Apagado},
                new Fazer {descricao ="Tarefa 5", horas = 6, situacao = Status.EmProgresso},
                new Fazer {descricao ="Tarefa 6", horas = 2, situacao = Status.NaoIniciado},
                new Fazer {descricao ="Tarefa 7", horas = 14, situacao = Status.Completo},
                new Fazer {descricao ="Tarefa 8", horas = 8, situacao = Status.EmEspera},
                new Fazer {descricao ="Tarefa 9", horas = 8, situacao = Status.Completo},
                new Fazer {descricao ="Tarefa 10", horas = 8, situacao = Status.Apagado},
                new Fazer {descricao ="Tarefa 11", horas = 4, situacao = Status.NaoIniciado},
                new Fazer {descricao ="Tarefa 12", horas = 10, situacao = Status.EmEspera},
                new Fazer {descricao ="Tarefa 13", horas = 12, situacao = Status.Completo},
                new Fazer {descricao ="Tarefa 14", horas = 6, situacao = Status.EmProgresso},
            };

            //Mudar cor do texto do console
            Console.ForegroundColor = ConsoleColor.DarkRed;

            mostraAcessos(tarefas);
            Console.ReadLine();
        }
    }
}

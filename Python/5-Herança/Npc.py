class Npc:

    #Esta classe é uma superclasse, ou seja, seus métodos e atributos poderao
    #ser herdados por outras classes

    def __init__(self, nome, time, forca, municao):
        self.nome = nome
        self.time = time
        self.forca = forca
        self.municao = municao
        self.vivo = True
        self.energia = 100

    def info(self):
        print('Nome : ', self.nome)
        print('Time : ', self.time)
        print('Força : ', self.forca)
        print('Munição :', self.municao)
        print('Vivo :', 'sim' if self.municao else 'nao')
        print('Energia :', self.municao)
        print('-----------------------')
            

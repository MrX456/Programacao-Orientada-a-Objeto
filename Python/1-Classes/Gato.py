class Gato:
    
    '''Classe para trabalhar com gatos'''

    #Construtor
    def __init__(self, nome):
        self.nome = nome;
        print('Seu gato se chama', self.nome)

    #Metodos diversos
    def peso_gato(self, peso):
        self.peso = peso
        if (self.peso > 5.0):
            print('Seu gato está acima do peso')
        elif(self.peso > 3.5):
            print('Peso parece normal')
        else:
            print('Seu gato está abaixo do peso')

    #Métodos iniciados com _ são privados e não podem ser invocados
    #fora do escopo desta classe
    def _dieta_especial_gato(self):
        self.msg = 'Tudo OK'
        if(self.peso < 3.5):
            self.msg = 'Aumente a ração do gato'
        if(self.peso >= 5.0):
            self.msg = 'Diminua a ração do gato'
            
        return self.msg

    #Método criado para acessar o método acima que é privado
    def dados_gato(self):
        print('\nO gato', self.nome,'está com', self.peso, 'kg')
        print(self._dieta_especial_gato())
        
#Fim do escopo da classe

nome_gato = input('Digite o nome do seu gato : ')
g1 = Gato(nome_gato)

peso = float(input('Digite o peso do gato : '))
g1.peso_gato(peso)

g1.dados_gato()

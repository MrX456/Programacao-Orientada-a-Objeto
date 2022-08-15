class Animal:
    
    def __init__(self, peso, idade, membros):
        self.peso = peso
        self.idade = idade
        self.membros = membros
        
    #Esses métodos serão passados como herança
    def locomover(self):
        print('Andando...')
        
    def alimentar(self):
        print('Comendo...')
        
    def emitir_som(self):
        print('Gritando...')
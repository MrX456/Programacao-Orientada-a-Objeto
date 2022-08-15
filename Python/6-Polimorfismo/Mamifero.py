from Animal import Animal
class Mamifero(Animal):
    
    def __init__(self, peso, idade, membros, cor_pelo):
        self.cor_pelo = cor_pelo
        super().__init__(peso, idade, membros)
        
    #Vamos sobrescrever os métodos da SuperClasse(Polimorfismo)
    def locomover(self):
        print('Correndo...')
        
    def alimentar(self):
        print('Mamando...')
        
    def emitir_som(self):
        print('Som de mamifero...')
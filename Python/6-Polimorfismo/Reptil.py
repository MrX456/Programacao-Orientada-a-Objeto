from Animal import Animal
class Reptil(Animal):
    
    def __init__(self, peso, idade, membros, cor_escama):
        self.cor_escama = cor_escama
        super().__init__(peso, idade, membros)
        
    #Vamos sobrescrever os métodos da SuperClasse(Polimorfismo)
    def locomover(self):
        print('Rastejando...')
        
    def alimentar(self):
        print('Comendo vegetais...')
        
    def emitir_som(self):
        print('Som de Reptil...')
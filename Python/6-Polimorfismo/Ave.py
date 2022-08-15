from Animal import Animal
class Ave(Animal):
    
    def __init__(self, peso, idade, membros, cor_penas):
        self.cor_penas = cor_penas
        super().__init__(peso, idade, membros)
        
    #Vamos sobrescrever os métodos da SuperClasse(Polimorfismo)
    def locomover(self):
        print('Voando...')
        
    def alimentar(self):
        print('Comendo frutas...')
        
    def emitir_som(self):
        print('Som de ave...')
        
    def fazer_ninho(self):
        print('Contruindo ninho...')
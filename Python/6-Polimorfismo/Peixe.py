from Animal import Animal
class Peixe(Animal):
    
    def __init__(self, peso, idade, membros, cor_escama):
        self.cor_escama = cor_escama
        super().__init__(peso, idade, membros)
        
    #Vamos sobrescrever os métodos da SuperClasse(Polimorfismo)
    def locomover(self):
        print('Nadando...')
        
    def alimentar(self):
        print('Comendo substâncias...')
        
    def emitir_som(self):
        print('Não faz som...')
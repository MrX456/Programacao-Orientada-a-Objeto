class Carro:
    '''Criação de objetos Carro será através de entrada de dados'''
    
    #Construtor
    def __init__(self, marca, modelo, cor, potencia):
        #Atributos da classe
        self.marca = marca
        self.modelo = modelo
        self.cor = cor
        self.potencia = potencia

    #Destrutor, remove um objeto da memória
    def __del__(self):
        print('Carro removido com sucesso')

    #Métodos diversos
    def mostrar_carro(self):
        print('Mostrando atributos...') 
        print('Marca : ' + self.marca)
        print('Modelo : ' + self.modelo)
        print('Cor : ' + self.cor)
        print('Potencia : ' + str(self.potencia) + 'cv')
    
    def turbinar_carro(self):
        #Queremos mudar valor do atributo deste objeto(SELF)
        self.potencia = int(self.potencia) + 200
        return 'Potencia aumentada para ' + str(self.potencia) +'cv'

    def pintar_carro(self, novaCor):
        self.cor = novaCor #Mudar valor do atributo cor desta classe(SELF)
        print('Carro pintado com sucesso')

    def guardar_especificacoes(self):
        print('Guardando especificações...')
        arquivo = open(self.modelo + "_specs.txt", "w+")
        arquivo.write("Marca : " + self.marca)
        arquivo.write("\nModelo : " + self.modelo)
        arquivo.write("\nCor : " + self.cor)
        arquivo.write("\nPotencia : " + str(self.potencia) + "cv")
        arquivo.close()
        print('Especificações guardadas com sucesso!')

    def vender_carro(self):
        escolha = input('Deseja vender este carro?[s/n]: ')
        if escolha == 's':
            del(self)
            print('Carro vendido com sucesso')
        else :
            print('Venda cancelada')
        
            

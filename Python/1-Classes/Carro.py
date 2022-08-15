#Aqui temos a inicialização de uma classe em Python através da palavra class
class Carro:

    #É recomendavel colocar uma docstring indicando o que é esta classe
    '''Classe responsável pela instância de Carro'''

    #Método construtor, sempre que um objeto desta classe for inicializado
    #esse método será executado
    def __init__(self, marca, modelo, cor, potencia):
        #Atributos da classe
        self.marca = marca
        self.modelo = modelo
        self.cor = cor
        self.potencia = potencia
        print('Objeto criado!')
        
    #O construtor sempre deve se chamar __init__ e posuir um parametro self

    #Aqui vamos criar outros métodos para esta classe(Nao esqueça de colocar
    #o parametro self que indica se tratar desta classe
    def ligar_motor(self):
        print('Ligando motor...')

    def aumentar_potencia(self):
        novaPotencia = self.potencia + 200
        return 'Potencia aumentada para ' + str(novaPotencia) +'cv'

    #Os métodos deve ser iniciados com letra minuscula e separados por _


#Fim da classe

#Vamos criar um objeto do tipo carro agora, não se esquecendo de passar o valor
#de seus 4 atributos(marca, modelo, cor, ano), não passar nada para o self.
carro = Carro('Toyota', 'Supra', 'Amarelo', 276)

#Podemos mostrar o valor de cada atributo do objeto depois de criá-lo
print(carro.marca)
print(carro.modelo)
print(carro.cor)
print(carro.potencia)

#Chamando os métodos da classe Carro
carro.ligar_motor()
print(carro.aumentar_potencia())

#Criando outro objeto
carro2 = Carro('Ferrari', 'F355', 'Vermelho', 420)

print(carro2.marca)
print(carro2.modelo)
print(carro2.cor)
print(carro2.potencia)

carro2.ligar_motor()
print(carro2.aumentar_potencia())



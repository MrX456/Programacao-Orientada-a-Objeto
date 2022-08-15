class Veiculo:
    
    def __init__(self, marca, modelo):
        self.__marca = marca
        self.__modelo = modelo
    
    def get_marca(self):
        return self.__marca
        
    def get_modelo(self):
        return self.__modelo
        
class Carro(Veiculo):
    
    def __init__(self, marca, modelo, passageiros):
        self.__passageiros = passageiros
        super().__init__(marca, modelo)
        
    def get_passageiros(self):
        return self.__passageiros
        
class Moto(Veiculo):
    
    def __init__(self, marca, modelo, cor):
        self.__cor = cor
        super().__init__(marca, modelo)
        
    def get_cor(self):
        return self.__cor
        

#Podemos criar listas com objetos
carro1 = Carro('Audi', 'RS4 Avant', 5)
carro2 = Carro('Toyota', 'Supra', 2)
carro3 = Carro('McLaren', 'F1 GTR', 3)

lista_carros = [carro1, carro2, carro3]

print('Lista de Carros')
print('Marca - Modelo - Ocupantes')
for elem in lista_carros:
    print(elem.get_marca() + ' - ' + elem.get_modelo() + ' - ' + str(elem.get_passageiros()))
    
print('-------------------------------------')
    
moto1 = Moto('Kawasaki', 'Ninja ZX 10R', 'Verde')
moto2 = Moto('Ducatti', '999R', 'Vermelha')
moto3 = Moto('Yamaha', 'YZF R1', 'Azul')

lista_motos = [moto1, moto2, moto3]

print('Lista de Motos')
print('Marca - Modelo - Cor')
for elem in lista_motos:
    print(elem.get_marca() + ' - ' + elem.get_modelo() + ' - ' + elem.get_cor())

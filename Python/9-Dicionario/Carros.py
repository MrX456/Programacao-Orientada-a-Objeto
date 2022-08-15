#Criar dicionario a partir de outros dicionários
Carro1 = {
    'Fabricante':'Audi',
    'Modelo':'S4'
}

Carro2 = {
    'Fabricante':'Nissan',
    'Modelo':'Skyline R34'
}

Carro3 = {
    'Fabricante':'Toyota',
    'Modelo':'Supra'
}

Carro4 = {
    'Fabricante':'VW',
    'Modelo':'Golf'
}

#Colocando carros dentro de um dicionario maior
Carros = {
    'C1': Carro1,
    'C2': Carro2,
    'C3': Carro3,
    'C4': Carro4
}

print('Mostrando Dicionario Maior')
print(Carros["C1"])
print(Carros["C2"])
print(Carros["C3"])
print(Carros["C4"])

#Mostrar valor especifico
print('-----------------------------------------------')
print(Carros['C3']['Fabricante'])
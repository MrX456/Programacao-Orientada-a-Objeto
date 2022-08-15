#Tuplas são estruturas de dados cujo os valores são IMUTÀVEIS, ou seja não podem ser alterados no decorrer do código

#Para criar uma tupla usamos():
tupla_carros = ('Golf', 'A3', '240SX', 'Camaro')

print('Tupla de Carros')

#A tupla pode ser impressa da seguinte maneira:
for carro in tupla_carros:
    print(carro)

print('-------------------------------')

#Imprimir elemento especifico
print(tupla_carros[0])

#Não é possivel mudar qualquer valor dentro da tupla bem com não há metodo para remover também
#tupla_carros[1] = 'Focus'
#TypeError: 'tuple' object does not support item assignment

#Os dados de uma tupla podem ser armazenados em uma lista
lista_carros = list(tupla_carros)
lista_carros[1] = 'Focus'

print('-------------------------------')
print('Lista de Carros')
for carro in lista_carros:
    print(carro)
    
print('-------------------------------')
    
#Os dados de uma lista podem ser armazenados em uma tupla
tupla_carros = tuple(lista_carros)

print('Tupla de Carros')
for carro in tupla_carros:
    print(carro)
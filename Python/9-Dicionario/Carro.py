#Para inicializar um dicionário usamos:
carro = {
    'Fabricante':'Honda',
    'Modelo':'NSX',
    'Ano':'1992',
    'Cor':'Vermelho'
}#Chave:Valor

#Para exibir todos os elementos do dicionario usamos
print(carro)

print('---------------------------')

#Para exibir cada elemento do dicionario usamos
print('Fabricante do Carro')
print(carro['Fabricante'])

print('Modelo do Carro')
print(carro['Modelo'])

print('Ano do Carro')
print(carro['Ano'])

#Para exibir cada elemento do dicionario tambem podemos usar o get()
print('Cor do Carro[get]')
print(carro.get('Cor'))

print('---------------------------')

#Podemos mudar um valor de um dicionario usando:
carro['Cor'] = 'Prata'

print('Pintando Carro...')
print(carro)

print('---------------------------')

#Podemos percorrer as chaves de um dicionario usando:
print('Percorrendo Chaves...')
for key in carro:
    print(key)
    
#Podemos percorrer os valores de um dicionario usando:
print('Percorrendo Valores...')
for key in carro:
    print(carro[key])

#Podemos percorrer cada chave/valor de um dicionario usando: 
print('Percorrendo Chaves/Valores...')
for key, value in carro.items():
    print(key + " : " + value)
    
print('---------------------------')
    
#Podemos verificar se uma chave está no dicionario
if 'Modelo' in carro:
    print('Modelo está em carro')
else:
    print('Modelo NÃO está em carro')
    
if 'Motorista' in carro:
    print('Motorista está em carro')
else:
    print('Motorista NÃO está em carro')
    
print('---------------------------')

#Podemos retornar o tamanho do dicionario(qtde de pares chave/valor)
print('Tamanho do dicionário : ', len(carro))

print('---------------------------')

#Podemos adicionar elementos no dicionário
carro['Cambio'] = 'Manual'
print(carro)

print('---------------------------')  

#Podemos remover elementos do dicionário de duas maneiras
carro.pop('Cambio')
del carro['Cor']
print(carro)

#Para remover o dicionario por completo usamos clear()
carro.clear()
print('Carro removido')


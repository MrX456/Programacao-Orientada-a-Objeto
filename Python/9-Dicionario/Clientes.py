#Criando dicionário com chave do tipo inteiro
clientes = {
    1:'Ana',
    2:'Paulo',
    3:'Luiz',
    4:'Claudia',
    5:'Evelyn',
    6:'Marcos'
}

#Para exibir chave do tipo int converter para string
print('Mostrando dicionário completo...')
print('ID: Cliente')
for key, value in clientes.items():
    print(str(key) + ' : ' + value)
    
print('-------------------')
print('Inserindo Novos Clientes')
print('-------------------')

clientes[7] = 'Adriana'
clientes[8] = 'Tatiana'
clientes[9] = 'Carlos'
clientes[10] = 'Pedro'

print('ID: Cliente')
for key, value in clientes.items():
    print(str(key) + ' : ' + value)
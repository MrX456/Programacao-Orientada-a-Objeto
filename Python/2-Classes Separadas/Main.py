#Para usar uma classe criada em outro arquivo temos que importá-la aqui
from Carro import Carro

print('Criar carro')

#Os atributos serão digitados pelo usuário
marca = input('Digite a marca : ')
modelo = input('Digite o modelo : ')
cor = input('Digite a cor : ')
potencia = input('Digite o valor potência : ')

carro1 = Carro(marca, modelo, cor, potencia)

print('------------------------------------')

print('Carro criado com sucesso!')

print('------------------------------------')

carro1.mostrar_carro()

print('------------------------------------')

print('Turbinando carro...')
print(carro1.turbinar_carro())

print('------------------------------------')

print('Pintar carro')
novaCor = input('Digite a nova cor : ')
carro1.pintar_carro(novaCor)

print('------------------------------------')

carro1.mostrar_carro()

print('------------------------------------')

carro1.guardar_especificacoes()

print('------------------------------------')

carro1.vender_carro()

print('------------------------------------')


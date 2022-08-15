from Mamifero import Mamifero
from Reptil import Reptil
from Peixe import Peixe
from Ave import Ave

print('Criando mamifero')
cachorro = Mamifero(9.5, 4, 4, 'preto')
#A classe Mamifero apresenta implemetação diferente destes métodos
print('Cachorro se locomove :')
cachorro.locomover()
print('Cachorro se alimenta :')
cachorro.alimentar()
print('Cachorro emite som :')
cachorro.emitir_som()

print('---------------------------------------')

print('Criando reptil')
tartaruga = Reptil(2.5, 3, 4, 'verde')
#A classe Reptil apresenta implemetação diferente destes métodos
print('Tartaruga se locomove :')
tartaruga.locomover()
print('Tartaruga se alimenta :')
tartaruga.alimentar()
print('Tartaruga emite som :')
tartaruga.emitir_som()

print('---------------------------------------')

print('Criando reptil')
barracuda = Peixe(3.5, 2, 0, 'cinza')
#A classe Peixe apresenta implemetação diferente destes métodos
print('Barracuda se locomove :')
barracuda.locomover()
print('Barracuda se alimenta :')
barracuda.alimentar()
print('Barracuda emite som :')
barracuda.emitir_som()

print('---------------------------------------')

print('Criando ave')
beija_flor = Ave(0.9, 2, 2, 'marrom')
#A classe Ave apresenta implemetação diferente destes métodos
print('Beija_Flor se locomove :')
beija_flor.locomover()
print('Beija_Flor se alimenta :')
beija_flor.alimentar()
print('Beija_Flor emite som :')
beija_flor.emitir_som()
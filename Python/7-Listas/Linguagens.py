#As listas permitem armazenar diversos valores em uma unica variavel
#Para utilizar uma lista usamos[]:
lista_linguagens = ['Python', 'Java', 'C#', 'PHP', 'Javascript']

#Para mostrar uma lista usamos:
print('Mostrando lista')
print(lista_linguagens)

print('------------------------------------')

#Para acessar elemento especifico de uma lista usamos(lmebrando que o incdice começa em 0):
print('Mostrando elemento especifico')
print(lista_linguagens[0])

#Podemos usar indices negativos, -1 imprime o ultimo elemento adicionado na lista
print(lista_linguagens[-1])
print(lista_linguagens[-5])#primeiro elemento

print('------------------------------------')

#Para mudar um elemento em uma lista usamos:
lista_linguagens[2] = 'C++'

print(lista_linguagens)

print('------------------------------------')

#Para adicionar um elemento em uma lista usamos append():
lista_linguagens.append('C')
lista_linguagens.append('Ruby')
lista_linguagens.append('C#')
lista_linguagens.append('Rusty')

print(lista_linguagens)

print('------------------------------------')

#Mostrar tamanho da lista
print('Tamanho da Lista:', len(lista_linguagens))

print('------------------------------------')

#Para remover um elemento em uma lista usamos remove()
lista_linguagens.remove('Ruby')

print(lista_linguagens)

print('------------------------------------')

#O metodo pop() remove o ultimo elemento da lista
lista_linguagens.pop()

print(lista_linguagens)

print('------------------------------------')

#del remove mediante a posição do elemento
del lista_linguagens[4]

print(lista_linguagens)

print('------------------------------------')

#Podemos copiar uma lista para outra
lista2 = list(lista_linguagens)

#Para percorrer uma lista usamos
for item in lista2:
    print(item)
    
print('------------------------------------')

lista3 = ['Ruby', 'Javascript', 'Visual Basic', 'Pascal', 'Lisp']

#Podemos fundir duas listas em uma nova

lista4 = lista2 + lista3

print('Lista 4')
for item in lista4:
    print(item)
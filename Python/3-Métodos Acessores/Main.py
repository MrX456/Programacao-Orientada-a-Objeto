from Pessoa import Pessoa

print('Instanciando pessoa...')
pessoa1 = Pessoa('Paulo', 26, 'Masculino', 1.86)

print('Mostrando atributos da pessoa')

#Para mostrar os atributos do objeto usamos os métodos Getters
print('Nome : ', pessoa1.get_nome())
print('Idade : ', pessoa1.get_idade())
print('Sexo : ', pessoa1.get_sexo())
print('Altura : ', pessoa1.get_altura())

print('-------------------------------------')

print('Instanciando pessoa...')
pessoa2 = Pessoa('Ana', 22, 'Feminino', 1.61)
print('Nome : ', pessoa2.get_nome())
print('Idade : ', pessoa2.get_idade())
print('Sexo : ', pessoa2.get_sexo())
print('Altura : ', pessoa2.get_altura())

print('-------------------------------------')

#Para modificar um atributo de um objeto usamos os métodos Setters
print('Modificando atributos...')

pessoa1.set_idade(29)
pessoa2.set_idade(23)

print('Nome : ', pessoa1.get_nome())
print('Idade : ', pessoa1.get_idade())
print('Sexo : ', pessoa1.get_sexo())
print('Altura : ', pessoa1.get_altura())

print('-------------------------------------')

print('Instanciando pessoa...')
print('Nome : ', pessoa2.get_nome())
print('Idade : ', pessoa2.get_idade())
print('Sexo : ', pessoa2.get_sexo())
print('Altura : ', pessoa2.get_altura())

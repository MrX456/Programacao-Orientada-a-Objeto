from Funcionario import Funcionario

#Só podemos acessar os atributos com os getters
def dados_funcionario(funcionario):
    print('Nome : ', funcionario.get_nome())
    print('Matricula : ', funcionario.get_matricula())
    print('Cargo : ', funcionario.get_cargo())
    print('Salário :', format(funcionario.get_salario(), ".2f"))
    
funcionario1 = Funcionario('Marcos Silva', 1088, 'Assistente ADM')
funcionario2 = Funcionario('Adriana Souza', 1076, 'Assistente RH')
funcionario3 = Funcionario('Carlos Viana', 1084, 'Gerente TI')
funcionario4 = Funcionario('Renata Santana', 1067, 'Gerente RH')

funcionarios = []
funcionarios.append(funcionario1)
funcionarios.append(funcionario2)
funcionarios.append(funcionario3)
funcionarios.append(funcionario4)

for func in funcionarios:
    dados_funcionario(func)
    print('-------------------------')

print('Inserindo salários')
print('---------------------------------')

#Só podemos modificar os atributos com os setters
funcionario1.set_salario(1400.00)
funcionario2.set_salario(1700.00)
funcionario3.set_salario(4500.00)
funcionario4.set_salario(4000.00)

for func in funcionarios:
    dados_funcionario(func)
    print('-------------------------')

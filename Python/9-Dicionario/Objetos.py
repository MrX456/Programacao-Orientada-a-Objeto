class Aluno:
    
    def __init__(self, nome, matricula, sexo):
        self.__nome = nome
        self.__matricula = matricula
        self.__sexo = sexo
        
    def get_nome(self):
        return self.__nome
        
    def get_matricula(self):
        return self.__matricula
        
    def get_sexo(self):
        return self.__sexo
        
aluno1 = Aluno('Fernanda Lima', 332,'F')
aluno2 = Aluno('Ailton Souza', 269,'M')
aluno3 = Aluno('Evelyn Cristina', 338,'F')
aluno4 = Aluno('Edson Alves', 302,'M')

#Podemos ter objetos em dicionarios
Alunos = {
    1:aluno1,
    2:aluno2,
    3:aluno3,
    4:aluno4
}
print('ID - Aluno - Matricula - Sexo')
for key in Alunos:
    print(str(key) + "-" + Alunos[key].get_nome() + "-" + str(Alunos[key].get_matricula()) + "-" + Alunos[key].get_sexo())

class Funcionario:

    def __init__(self, nome, matricula, cargo):
        #No python há uma convenção onde atributos iniciados com __
        #são privados e só devem ser acessados com getters e setters,
        #isto representa o encapsulamento(equivalente a private no java)
        self.__nome = nome
        self.__matricula = matricula
        self.__cargo = cargo
        self.__salario = 0

    #Getters e setters
    def get_nome(self):
        return self.__nome
    def get_matricula(self):
        return self.__matricula
    def get_cargo(self):
        return self.__cargo
    def get_salario(self):
        return self.__salario
    
    def set_nome(self, nome):
        self.__nome = nome
    def set_matricula(self, matricula):
        self.__matricula = matricula
    def set_sexo(self, cargo):
        self.__cargo = cargo
    def set_salario(self, salario):
        self.__salario = salario

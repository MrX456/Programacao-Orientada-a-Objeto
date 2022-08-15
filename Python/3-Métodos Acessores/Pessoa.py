class Pessoa:

    def __init__(self, nome, idade, sexo, altura):
        self.nome = nome
        self.idade = idade
        self.sexo = sexo
        self.altura = altura

    #Estes metodos acessores permitem retornar os valores dos atributos
    def get_nome(self):
        return self.nome
    def get_idade(self):
        return self.idade
    def get_sexo(self):
        return self.sexo
    def get_altura(self):
        return self.altura

    #Estes metodos acessores permitem modificar os valores dos atributos
    #sem precisar instanciar a classe denovo
    def set_nome(self, nome):
        self.nome = nome
    def set_idade(self, idade):
        self.idade = idade
    def set_sexo(self, sexo):
        self.sexo = sexo
    def set_altura(self, altura):
        self.altura = altura

    

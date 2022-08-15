from Npc import Npc

class Soldado(Npc):
    
    #Utilizando () podemos indicar que uma classe herdará de outra
    #O construtor deve passar os atributos da supeclasse
    def __init__(self, nome, time):
        forca = 200
        municao = 200
        #Agora precisamos do construtor da classe pai
        super().__init__(nome, time, forca, municao)

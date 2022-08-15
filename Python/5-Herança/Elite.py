from Npc import Npc

class Elite(Npc):
    
    #Utilizando () podemos indicar que uma classe herdará de outra
    #O construtor deve passar os atributos da supeclasse
    def __init__(self, nome, time):
        forca = 400
        municao = 500
        #Agora precisamos do construtor da classe pai
        super().__init__(nome, time, forca, municao)



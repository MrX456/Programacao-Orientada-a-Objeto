class Estoque:
    
    def __init__(self, sku, item, qtde):
        self.__sku = sku
        self.__item = item
        self.__qtde = qtde
        
    def get_sku(self):
        return self.__sku
        
    def get_item(self):
        return self.__item
        
    def get_qtde(self):
        return self.__qtde    
        
#Podemos armazenar objetos em tuplas
item1 = Estoque(1661, 'Caneta Azul', 100)
item2 = Estoque(1322, 'Apontador', 50)
item3 = Estoque(1734, 'Lápis', 200)
item4 = Estoque(1587, 'Grafite 0.5', 80)

tupla_estoque = (item1, item2, item3, item4)

print('SKU - Item - QTDE')

#Percorrendo tupla
for elem in tupla_estoque:
    print(str(elem.get_sku()) + ' - ' + elem.get_item() + ' - ' + str(elem.get_qtde()))
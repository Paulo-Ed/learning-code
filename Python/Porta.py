class Porta:
    def __init__(self, condicao):
        self.condicao = condicao
    
    def Abre(self, fechadura):
        if (fechadura == 'true'):
            self.condicao = "aberta"
            return self.condicao
        elif(fechadura == 'false'):
            self.condicao = "fechada"
            return self.condicao
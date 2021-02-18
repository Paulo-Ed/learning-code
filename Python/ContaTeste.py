class Conta:
    def __init__(self, agencia, numero, tipo, cliente, saldo, limite = 3000.0):
        self.agencia = agencia
        self.numero = numero
        self.tipo = tipo
        self.titular = cliente
        self.saldo = saldo
        self.limite = limite
    
   
    def saldo(self):
        return self.saldo
    
   
    def saca(self, valor):
        if(self.saldo < 0):
            print("Saldo insuficiente")
            print(self.saldo)
        else:
            self.saldo -= valor
            return self.saldo, print("Valor sacado: {}".format(valor))
    
    
    def deposita(self, valor):
        self.saldo += valor
        return self.saldo
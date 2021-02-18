import	datetime
class Historico:
	def	__init__(self):
		self.data_abertura	=	datetime.datetime.today()
		self.transacoes	=	[]
	def	imprime(self):
		print("data	abertura:	{}".format(self.data_abertura))
		print("transações:	")
		for	t	in	self.transacoes:
			print("-",	t)


class Cliente:
	def	__init__(self, nome, sobrenome, cpf):
		self.nome =	nome
		self.sobrenome = sobrenome
		self.cpf = cpf

class Conta:
    def __init__(self, numero, cliente, saldo, limite = 1000.0):
        self.numero = numero
        self.titular = cliente
        self.saldo = saldo
        self.limite = limite
        self.Historico= Historico
    
    def saca(self,valor):
        if(self.saldo < valor):
            return False
        else:
            self.saldo -= valor
            self.historico.transacoes.append("saque	de	{}".format(valor))

    def deposita(self, valor):
        self.saldo += valor
        self.historico.transacoes.append("depósito	de	{}".format(valor))

    def extrato(self):
        print("número: {} \nSaldo: {}".format(self.numero, self.saldo))
        self.historico.transacoes.append("tirou	extrato	-	saldo	de	{}".format(self.saldo))

    
    def transfere(self, destino, valor):
        retirou = self.saca(valor)
        if(retirou == False):
            return False
        else:
            destino.deposita(valor)
            self.historico.transacoes.append("transferencia	de	{}	para	conta	{}".format(valor,	destino.numero))
            return True
    
    def	pega_saldo(self):
		return	self._saldo

    def	set_saldo(self,	saldo):
		if(saldo < 0):
			print("saldo não pode ser negativo")
		else:
			self.saldo = saldo


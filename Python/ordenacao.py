V1 = input("Digite o primeiro número:\n")
V2 = input("Digite o segundo número:\n")
V3 = input("Digite o terceiro número:\n")
N1 = int(V1)
N2 = int(V2)
N3 = int(V3)
crescente = N1<= N2 <= N3
if(crescente):
    print("crescente")
else:
    print("Não está em ordem crescente")
alturastr = input("Diga a altura:\n")
altura = float(alturastr)

if(altura >= 1.8):
    print("Alto")
elif(altura > 1.65 and altura <= 1.79):
    print("Altura Média")
elif(altura < 1.65):
    print("Baixo")
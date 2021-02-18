numero1 = input("Digite um número:\n")
numero = int(numero1)
divisivel3 = (numero % 5 == 0)

if(divisivel3):
    print("buzz")
else:
    print(numero)
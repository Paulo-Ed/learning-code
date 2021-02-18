numero1 = input("Digite um número:\n")
numero = int(numero1)
divisivel3 = (numero % 3 == 0)
divisivel5 = (numero % 5 == 0)

if(divisivel3):
    print("Fizz")
else:
    print(numero)
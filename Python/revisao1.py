print("Oi!\n")
nome = input("Qual o seu nome?\n")
infor = "\nMeu Nome é Python!"
print(infor.upper())
infor2 = "\nsou uma linguagem de programação!\n"
print(infor2.capitalize())
print("Qual a sua idade {}?".format(nome))
idade = input("\nMe diz por favor!\n")
print("Então seu nome é {} e você tem {} anos, \nPrazer em te conhecer!\n".format(nome, idade))
#print("Como você está  {}?\n".format(nome))
#emocao = int(input("1:Bem / 2:Mal\n"))
emocao = input("Como você está {}?\n".format(nome))
if (emocao.upper() == "BEM"):
    print("Que bom! :) Fico feliz por Você!")
elif(emocao.upper() == "MAL"):
    print("Poxa! :( como posso te ajudar?")
    ajuda = input("pode falar\n".upper())
Lista = ["nao sei","me deixa em paz","cala a boca"]
if(ajuda.lower() == Lista[0]):
    print("Acho que um abraço pode ajudar você!")
elif(ajuda.lower() == Lista[1]):
    print("Eu só quero lhe ajudar {}".format(nome))
elif(ajuda.lower() == Lista[2]):
    print("Tudo bem {}, não quero incomodar você!".format(nome))
dados = open('dados.txt', 'r')
LeituraDados = dados.readline()
for linha in LeituraDados:
    linha = linha.strip()
    print(linha)

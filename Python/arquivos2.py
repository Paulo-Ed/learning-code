print("==== Criando um arquivo e adicionando conteúdo ====")
nomeArquivo = input("Digite o nome do arquivo\n")
conteudoArquivo = input("Digite o conteúdo\n")

dados = open(nomeArquivo, 'w')
dados.write(conteudoArquivo)
dados.close()

dadosGravados = open(nomeArquivo, 'r')
print(dadosGravados.read())

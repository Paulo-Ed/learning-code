print('******************************')
print('*   Jogo	da	adivinhação	    *')
print('******************************')

numero_secreto	=	42
total_de_tentativas	=	3
rodada	=	1

for	rodada	in	range(1,	total_de_tentativas):
	print('Tentativa	{}	de	{}'.format(rodada,	total_de_tentativas))
#while	(rodada	<=	total_de_tentativas):
	#print('Tentativa	{}	de	{}'.format(rodada,	total_de_tentativas))
	chute	=	int(input('Digite	o	seu	número:	'))
	print('Você	digitou: ',chute)

#while	(total_de_tentativas	>	0):
	#chute = int(input('Digite o	seu	número:	'))
	#print('Você	digitou: ',	chute)

#if(numero_secreto	==	chute):
	#print('Você	acertou!')
#else: 
	#print('Você	errou!')
#elif	(chute	>	numero_secreto):
	#print('Você	errou!	O	seu	chute	foi	maior	que	o	número	secreto')
#elif	(chute	<	numero_secreto):
	#print('Você	errou!	O	seu	chute	foi	menor	que	o	número	secreto')

	acertou	=	chute	==	numero_secreto
	maior	=	chute	>	numero_secreto
	menor	=	chute	<	numero_secreto

	if(acertou):
		print('Você	acertou!')
		break
	elif(maior):
		print('Você	errou!	O	seu	chute	foi	maior	que	o	número	secreto')
	elif(menor):
		print('Você	errou!	O	seu	chute	foi	menor	que	o	número	secreto')
		rodada	=	rodada	+	1
print('Fim	do	jogo')
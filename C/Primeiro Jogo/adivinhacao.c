#include <stdio.h>
#include <stdlib.h>

int main()
{
    printf("************************************\n");
    printf("* Bem-vindo ao Jogo de Adivinhacao *\n");
    printf("************************************\n");

    int numerosecreto;
    numerosecreto = 42;

    int chute;

    printf("Qual e o seu chute?\n");
    scanf("%d", &chute);
    printf("Seu chute foi %d", chute);

    return 0;
}

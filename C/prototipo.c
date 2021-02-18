#include <stdio.h>
#include <stdlib.h>
clear();
void Modo();
int main(){
printf("%30s","==================\n");
printf("%30s","Bem vindo ao Simoc\n");
printf("%30s","==================\n");
clear;
Modo();
return 0;
}

void Modo(){
int modo;
printf("1: Cadastrar Operador\n");
printf("2: Selecionar Operador\n");
printf("3: Nova Compra\n");
scanf("%d", &modo);
if(modo == 1){
   printf("Cadastrar Operador\n");
   Cadastro();
} else if(modo == 2){
    printf("Selecionar Operador\n");
} else{
    printf("Nova Compra\n");
}
}

void Cadastro(){
int operador;
int opcao;
printf("Informe o Código do Operador:\n");
scanf("%d", &operador);
printf("Operador Cadastrado\n");
printf("1: Voltar\n");
scanf("%d", &opcao);
if (opcao == 1){
    Modo();
}

}

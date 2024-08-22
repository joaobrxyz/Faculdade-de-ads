/* Faça um programa em C para calcular a média de uma disciplina
   regular qualquer da faculdade eniac, respeitando o sistema de 
   avaliação.*/
/* Dado salário atual de uma pessoa,
   faça um programa em C para calcular o salário com aumento.
   Sabendo que o aumento foi de 15,35%. */
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "Portuguese");
    float nota, ex, prova, port;
    printf("Digite a nota que vc tirou nos exercícios: ");
    scanf("%f",&ex);
    printf("Digite a nota que vc tirou no portfólio: ");
    scanf("%f",&port);
    printf("Digite a nota que vc tirou na prova: ");
    scanf("%f",&prova);
    nota = (prova * 0.5) + (port * 0.3) + (ex * 0.2);
    printf("A média final do aluno foi: %.2f\n",nota);
    system("pause");
    return 0;
}

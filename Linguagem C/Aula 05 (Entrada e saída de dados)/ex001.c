/* Dado salário atual de uma pessoa,
   faça um programa em C para calcular o salário com aumento.
   Sabendo que o aumento foi de 15,35%. */
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "Portuguese");
    float salario, aumento;
    printf("Digite o salário atual: R$");
    scanf("%f",&salario);
    aumento =  salario + (salario * 15.35 / 100);
    printf("O novo salário com o aumento é: R$%.2f\n",aumento);
    system("pause");
    return 0;
}

/* Dado sal�rio atual de uma pessoa,
   fa�a um programa em C para calcular o sal�rio com aumento.
   Sabendo que o aumento foi de 15,35%. */
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL, "Portuguese");
    float salario, aumento;
    printf("Digite o sal�rio atual: R$");
    scanf("%f",&salario);
    aumento =  salario + (salario * 15.35 / 100);
    printf("O novo sal�rio com o aumento �: R$%.2f\n",aumento);
    system("pause");
    return 0;
}

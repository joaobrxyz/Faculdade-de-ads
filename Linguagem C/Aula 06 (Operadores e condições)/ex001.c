/* Dados dois números inteiros, faça um programa em C
para mostrar qual número é maior ! */
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL,"Portuguese");
    int n1, n2;
    printf("Digite o primeiro número: ");
    scanf("%d",&n1);
    printf("Digite o segundo número: ");
    scanf("%d",&n2);
    // estrutura condicional simples
    if (n1>n2){
       printf("O número %d é maior!\n",n1);
    } 
    if (n1<n2){
       printf("O número %d é maior!\n",n2);
    }
    if (n1==n2){
       printf("Os números %d e %d são iguais!\n",n1,n2);
    }
    system("pause");
    return 0;  
}

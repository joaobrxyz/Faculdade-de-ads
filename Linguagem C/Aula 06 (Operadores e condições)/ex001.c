/* Dados dois n�meros inteiros, fa�a um programa em C
para mostrar qual n�mero � maior ! */
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL,"Portuguese");
    int n1, n2;
    printf("Digite o primeiro n�mero: ");
    scanf("%d",&n1);
    printf("Digite o segundo n�mero: ");
    scanf("%d",&n2);
    // estrutura condicional simples
    if (n1>n2){
       printf("O n�mero %d � maior!\n",n1);
    } 
    if (n1<n2){
       printf("O n�mero %d � maior!\n",n2);
    }
    if (n1==n2){
       printf("Os n�meros %d e %d s�o iguais!\n",n1,n2);
    }
    system("pause");
    return 0;  
}

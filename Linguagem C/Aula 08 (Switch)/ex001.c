#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL,"Portuguese");
    int opcao;
    float n1, n2, res;
    printf("Digite o primeiro número: ");
    scanf("%f",&n1);
    printf("Digite o segundo número: ");
    scanf("%f",&n2);
    printf("\nMenu para operação aritmética: \n");
    printf("1 - somar. \n");
    printf("2 - subtrair. \n");
    printf("3 - multiplicar. \n");
    printf("4 - dividir. \n\n");
    printf("Escolha a sua opção: ");
    scanf("%d",&opcao);
    switch(opcao){
        case 1:
            res = n1 + n2;
            printf("\nO resultado da soma é: %.2f\n",res);
            break;
        case 2:
            res = n1 - n2;
            printf("\nO resultado da subtração é: %.2f\n",res);
            break;
        case 3:
            res = n1 * n2;
            printf("\nO resultado da multiplicação é: %.2f\n",res);
            break;
        case 4:
            res = n1 / n2;
            printf("\nO resultado da divisão é: %.2f\n",res);
            break;
        default:
            printf("Vc digitou uma opção inválida!\n");
    }
    system("pause");
    return 0;
}

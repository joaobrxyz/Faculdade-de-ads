#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL,"Portuguese");
    int opcao;
    float n1, n2, res;
    printf("Digite o primeiro n�mero: ");
    scanf("%f",&n1);
    printf("Digite o segundo n�mero: ");
    scanf("%f",&n2);
    printf("\nMenu para opera��o aritm�tica: \n");
    printf("1 - somar. \n");
    printf("2 - subtrair. \n");
    printf("3 - multiplicar. \n");
    printf("4 - dividir. \n\n");
    printf("Escolha a sua op��o: ");
    scanf("%d",&opcao);
    switch(opcao){
        case 1:
            res = n1 + n2;
            printf("\nO resultado da soma �: %.2f\n",res);
            break;
        case 2:
            res = n1 - n2;
            printf("\nO resultado da subtra��o �: %.2f\n",res);
            break;
        case 3:
            res = n1 * n2;
            printf("\nO resultado da multiplica��o �: %.2f\n",res);
            break;
        case 4:
            res = n1 / n2;
            printf("\nO resultado da divis�o �: %.2f\n",res);
            break;
        default:
            printf("Vc digitou uma op��o inv�lida!\n");
    }
    system("pause");
    return 0;
}

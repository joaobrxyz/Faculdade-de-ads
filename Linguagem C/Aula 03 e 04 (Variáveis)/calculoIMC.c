// Este programa é para calcular o IMC
#include <stdio.h>
#include <stdlib.h>
int main(){
    float peso, altura, imc;
    
    // Operadores de cálculo: +, -, /, *
    printf("Informe o peso: ");
    scanf("%f",&peso);
    printf("Informe a altura: ");
    scanf("%f",&altura);
    imc = peso / (altura * altura);
    printf("Resultado do IMC: %.2f\n",imc);
    
    system("pause");
    return 0;
}

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
float media(float nota1, float nota2); // Declaração de um subprograma
int main(){ // Programa principal
    setlocale(LC_ALL,"Portuguese");
    float nota1, nota2;
    printf("Informe a sua primeira nota: ");
    scanf("%f", &nota1);
    printf("Informe a sua segunda nota: ");
    scanf("%f", &nota2);
    // Chamando o subprograma para executar
    printf("A média das suas notas é: %.2f\n", media(nota1,nota2));
    system("pause");
    return 0;
}
// Subprograma: temos parâmetros nota1 e nota2
// Parâmetros são utilizados para receber os dados
// Quando um subprograma tem o comando "return", chamamamos de função
// A função funciona como um valor!
float media(float nota1, float nota2){
     float med; // Variável local
     med = (nota1 + nota2) / 2;
     return med;
}

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
float media(float nota1, float nota2); // Declara��o de um subprograma
int main(){ // Programa principal
    setlocale(LC_ALL,"Portuguese");
    float nota1, nota2;
    printf("Informe a sua primeira nota: ");
    scanf("%f", &nota1);
    printf("Informe a sua segunda nota: ");
    scanf("%f", &nota2);
    // Chamando o subprograma para executar
    printf("A m�dia das suas notas �: %.2f\n", media(nota1,nota2));
    system("pause");
    return 0;
}
// Subprograma: temos par�metros nota1 e nota2
// Par�metros s�o utilizados para receber os dados
// Quando um subprograma tem o comando "return", chamamamos de fun��o
// A fun��o funciona como um valor!
float media(float nota1, float nota2){
     float med; // Vari�vel local
     med = (nota1 + nota2) / 2;
     return med;
}

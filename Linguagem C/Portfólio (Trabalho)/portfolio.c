#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL,"Portuguese");
    // Dados de entrada
    char nome_animal[30]; // Nome da espécie do animal
    int qntd; // Quantidade de animais da espécie informada
    float custo_kg; // Custo por kg de comida
    float qntd_dia; // Quantidade de comida em kg que o animal dessa espécie consome por dia

    // Dados de saída
    float custo_dia; // Custo estimado da comida por dia
    float qntd_mes; // Quantidade de comida necessária para o mês
    float custo_mes; // Custo estimado da comida por mês

    printf("Digite o nome da espécie do animal: ");
    gets(nome_animal);
    printf("Digite a quantidade de animais da espécie %s: ",nome_animal);
    scanf("%i",&qntd);
    printf("Custo por kg de comida: R$");
    scanf("%f",&custo_kg);
    printf("Quantidade de comida (em kg) que o animal dessa espécie consome por dia: ");
    scanf("%f",&qntd_dia);

    custo_dia = custo_kg * qntd_dia * qntd;
    qntd_mes = qntd_dia * qntd * 30;
    custo_mes = custo_dia * 30;

    printf("Custo estimado de comida por dia: R$%.2f\n",custo_dia);
    printf("Quantidade de comida (em kg) necessaria para o mes: %.2fkg\n",qntd_mes);
    printf("Custo estimado de comida por mes: R$%.2f\n",custo_mes);

    system("pause");
    return 0;
}
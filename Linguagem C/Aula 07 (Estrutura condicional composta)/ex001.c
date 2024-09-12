/* Este programa recebe o sálario bruto atual de um funcionário e calcula
o novo sálario bruto com aumento de acordo com a faixa salarial e mostra
o sálario líquido a receber sabendo que o imposto a pagar é 9,5%.

| Para sálario <= 3000,00 o aumento é: 15,45% |
| Para sálario > 3000,00 e <= 5500,00 o aumento é: 10,15% |
| Para sálario >5500,00 o aumento é: 7,5% |
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main(){
    setlocale(LC_ALL,"Portuguese");
    float sb_atual, novo_sb, novo_sl, aumento;
    printf("Digite o atual salário bruto: R$");
    scanf("%f",&sb_atual);
    if (sb_atual <= 3000){
           aumento =  15.45;
           novo_sb = sb_atual + sb_atual * aumento / 100;
           novo_sl = novo_sb - novo_sb * 9.5 / 100;
    } else if (3000 < sb_atual < 5500) {
           aumento =  10.15;
           novo_sb = sb_atual + sb_atual * aumento / 100;
           novo_sl = novo_sb - novo_sb * 9.5 / 100;
    } else {
           aumento =  7.5;
           novo_sb = sb_atual + sb_atual * aumento / 100;
           novo_sl = novo_sb - novo_sb * 9.5 / 100;
    }
    printf("O novo salário bruto com o aumento de %.2f%% é: R$%.2f \nO novo salário líquido é: R$%.2f\n",aumento,novo_sb,novo_sl);
    system("pause");
    return 0;
}

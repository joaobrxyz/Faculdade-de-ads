/* Dados um n�mero inteiro, fa�a um programa em C para 
   verificar se este n�mero � par ou impar  */
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
int main(){	
	setlocale(LC_ALL,"portuguese");
	int  num;
	printf("Informe um n�mero inteiro para verificar se � um n�mero par ou �mpar: ");
	scanf("%d",&num);
	//if-else Estrutura condicional composta
	if (num % 2 == 0) {
		printf("O n�mero %d � par!\n",num);
	}
	else {
		printf("O n�mero %d � impar!\n",num);
	}	
	system("pause");
	return 0;
}

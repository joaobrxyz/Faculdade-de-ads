#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
int soma_sequencia(int n); //declara��o de um subprograma
//programa principal
int main(){	
	int n;
	setlocale(LC_ALL,"portuguese");
	printf("Informe um n�mero inteiro n para somar a seq�encia de 1 a n: n = ");
	scanf("%d",&n);
	printf("O resultado da soma = %d\n",soma_sequencia(n));	
	system("pause");
	return 0;
}
//subprograma: fun��o
int soma_sequencia(int n){
	int cont = 1; //vari�vel local
	int soma = 0; 
	while (cont <= n){
		soma += cont; //soma = soma + cont;
		cont++; //atualizar cont
	}
	return soma;
}


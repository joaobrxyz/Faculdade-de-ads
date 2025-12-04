#include<stdio.h>
int soma_recursivo(int n);
int soma_iterativo(int n);
int main(){
	int n;
	printf("Informe um numero inteiro n = ");
	scanf("%d",&n);
	printf("A soma das sequecias de 1 a %d = %d\n",n,soma_recursivo(n));
	printf("A soma das sequecias de 1 a %d = %d\n",n,soma_iterativo(n));
	return 0;
}
int soma_recursivo(int n){
	if (n == 1){//ponto de parada !
		return 1;
	}
	else{//para n > 1
		return soma_recursivo(n-1) + n;
	}
}
int soma_iterativo(int n){
	int i, soma = 0;
	for(i = 1; i<=n; i++){
		soma = soma + i;
	}
	return soma;
}

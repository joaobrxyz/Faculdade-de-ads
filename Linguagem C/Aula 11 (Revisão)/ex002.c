/* Este programa � para mostrar um subprograma que 
funciona como uma fun��o (que retorna um valor) */

#include<stdio.h> // Biblioteca padr�o para entrada e sa�da

int get_idade(); // declara��o de subprograma
int main() {
	printf("A sua idade: %d anos",get_idade());
	
	return 0;
}

// Subprograma funciona como um valor
int get_idade() {
	int idade;
	printf("Informe a sua idade: ");
	scanf("%d",&idade);
	return idade;
}

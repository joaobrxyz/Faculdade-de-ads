/* Este programa é para mostrar um subprograma que 
funciona como uma função (que retorna um valor) */

#include<stdio.h> // Biblioteca padrão para entrada e saída

int get_idade(); // declaração de subprograma
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

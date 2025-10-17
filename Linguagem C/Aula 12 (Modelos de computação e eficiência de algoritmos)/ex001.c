#include<stdio.h>
int buscaLinear(int vetor[], int tamanho, int valorBuscado);
int main() {
	int vetor[] = {10, 20, 30, 40, 50};
	int tamanho = sizeof(vetor) / sizeof(vetor[0]);
	int valorBuscado;
	
	printf("Digite o valor que deseja buscar: ");
	scanf("%d", &valorBuscado);
	
	int resultado = buscaLinear(vetor, tamanho, valorBuscado);
	
	if (resultado != -1) {
		printf("Valor %d encontrado no índice %d. \n", valorBuscado, resultado);
	} else {
		printf("Valor %d não encontrado no vetor. \n", valorBuscado);
	}
	return 0;
}

// Função que realiza a busca linear
int buscaLinear(int vetor[], int tamanho, int valorBuscado) {
	int i = 0;
	for (i = 0; i < tamanho; i++) {
		if (vetor[i] == valorBuscado) {
			return i; // Retorna o índice onde o valor foi encontrado
		}
	}
	return -1; // Retorna -1 se o valor não for encontrado
}

/* Vamos montar uma lista dinâmica para armazenar os RAs de alunos */
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

struct Nodo {
	int id_aluno; // Para armazenar RA do aluno
	struct Nodo *prox; // Um ponteiro para receber o endereço da próxima célula
}
typedef struct Nodo celula;
celula *p = NULL; // Um ponteiro para receber o endereço da primeira célula
// Declaração de subprogramas
void insereFinal(int x); // Inserir uma célula no final da lista
void removeInicio(); // Remover uma célula no ínicio da lista
void mostrarLista(celula *); // Mostrar todos os elementos da lista
void removeAll(); // Coleta de lixo: devolver todas as células para a memória (ram)
void menu(); // Opção de operações

// Programa principal
int main() {
	setlocale(LC_ALL,"Portuguese");
	
	system("pause");
	return 0;
}

void insereFinal(int x) {
	celula *ptr, *aux;
	/* pegar uma célula na memória atráves do comando malloc(...) e
	   atribuir o endereço desta célula para ponteiro ptr */
	ptr = (celula *)malloc(sizeof(celula));
	ptr->id_aluno = x;
	ptr->prox = NULL;
	
	if(p == NULL) { // Caso 1: sem lista ainda e essa célula é primeira da lista
		p = ptr;
	} else {
		
	}
	ptr = NULL;
}


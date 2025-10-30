/* Vamos montar uma lista din�mica para armazenar os RAs de alunos */
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

struct Nodo {
	int id_aluno; // Para armazenar RA do aluno
	struct Nodo *prox; // Um ponteiro para receber o endere�o da pr�xima c�lula
}
typedef struct Nodo celula;
celula *p = NULL; // Um ponteiro para receber o endere�o da primeira c�lula
// Declara��o de subprogramas
void insereFinal(int x); // Inserir uma c�lula no final da lista
void removeInicio(); // Remover uma c�lula no �nicio da lista
void mostrarLista(celula *); // Mostrar todos os elementos da lista
void removeAll(); // Coleta de lixo: devolver todas as c�lulas para a mem�ria (ram)
void menu(); // Op��o de opera��es

// Programa principal
int main() {
	setlocale(LC_ALL,"Portuguese");
	
	system("pause");
	return 0;
}

void insereFinal(int x) {
	celula *ptr, *aux;
	/* pegar uma c�lula na mem�ria atr�ves do comando malloc(...) e
	   atribuir o endere�o desta c�lula para ponteiro ptr */
	ptr = (celula *)malloc(sizeof(celula));
	ptr->id_aluno = x;
	ptr->prox = NULL;
	
	if(p == NULL) { // Caso 1: sem lista ainda e essa c�lula � primeira da lista
		p = ptr;
	} else {
		
	}
	ptr = NULL;
}


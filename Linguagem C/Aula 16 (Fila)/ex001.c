//Este programa mostra a implementação da Fila na alocação dinâmica
#include<stdio.h>
#include<stdlib.h> // Usar para comando system("pause");
#include<locale.h>

struct Nodo {
       int info;
       struct Nodo *prox;
}; //Definição de uma célula
typedef struct Nodo celula;

// temos dois onteiros para fila: variáveis global
celula *ifila = NULL; // no ínicio da fila
celula *ffila = NULL; // no final da fila

// Declarações de subprogramas (operações da fila)
int filaVazia(void); // Verificar se fila está vazia
void insereFinal(int x);
void removeInicio(void);
void mostraFila(void);
void menu(void);
void devolverFila(void); // Coleta de lixo

// Programa principal
int main (){
    setlocale(LC_ALL,"Portuguese");
    
    system("pause");
    return 0;
}

int filaVazia(){
    if (ifila == NULL){
       return 1; // Verdadeiro
    }
    else {
       return 0; // Falso
    } 
}

void insereFinal(int x){
     celula *ptr, *aux;
     ptr = (celula *)malloc(sizeof(celula));
     ptr->info = x;
     ptr->prox = NULL;
     if (filaVazia()){
        ifila = ptr;
        ffila = ptr;
     }
     else {
        ffila->prox = ptr;
        ffila = ffila->prox; // ou ffila = ptr;
     }
     ptr = NULL;
}

void removeInicio(void){
     celula *aux;
     
     aux = ifila;
     ifila = ifila->prox; // Andar uma célula para frente
     aux->prox = NULL; // Desconectar a fila
     free(aux); // Levar essa célula devolta pra memória
     aux = NULL;
}

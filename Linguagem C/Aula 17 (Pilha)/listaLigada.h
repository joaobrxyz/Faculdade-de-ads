#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct Nodo{
       char info;
       struct Nodo *prox;
};// definição uma caixinha
typedef struct Nodo No;
// ponteiro para a lista: variável global
No *Ptrlista = NULL ;
//Declaração de subprogramas 
void insereNo(char x);
void inverterLista(void);
void mostralista(void);
void devolverlista(void);
     
void insereNo(char x)
{  No *aux, *ptr;
   ptr = (No*)malloc(sizeof(No));
   if (Ptrlista == NULL){
        Ptrlista = ptr;
        ptr->info = x;
        ptr->prox = NULL; }
   else{
        aux = Ptrlista;
        while(aux->prox!=NULL)
            aux = aux->prox;
        ptr->prox = NULL;
        ptr->info = x;
        aux->prox = ptr;
        aux = NULL; }
   ptr = NULL;
}              
void inverterLista(void){
   
   No *aux, *ptr, *lista2 = NULL;
   if (Ptrlista){
   	   aux = Ptrlista;
   	   while (aux!=NULL){
   	   		ptr = (No*)malloc(sizeof(No));
        	ptr->info = aux->info;
            ptr->prox = lista2;
            lista2 = ptr;
            aux = aux->prox;   	   	
       }
   	}	
    Ptrlista = lista2;
    ptr = NULL;
    aux = NULL;
    lista2 = NULL;
}

void mostralista(void)
{
    No *aux;
    aux = Ptrlista;
    while (aux!=NULL){           
        printf("%c",aux->info);          
        aux = aux->prox; }
    aux = NULL;
}
void devolverlista()
{  No *aux;
   if (Ptrlista)
   {  aux = Ptrlista;
      while (aux!=NULL)
      {   Ptrlista = Ptrlista->prox;
          aux->prox = NULL; 
          free(aux);
          aux = Ptrlista;
      } 
   }
   aux = NULL;
   Ptrlista = NULL;
}


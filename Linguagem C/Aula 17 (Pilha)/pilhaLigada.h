#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct NodoPilha{
       char info;
       struct NodoPilha *prox;
};// definição uma caixinha
typedef struct NodoPilha NoPilha;
NoPilha *Stack = NULL; // ponteiro para a Pilha

char desempilhar(void); 
void empilhar(char x);
void devolverPilha(void);

void empilhar(char x)
{  NoPilha *ptr;
   ptr = (NoPilha*)malloc(sizeof(NoPilha));
   ptr->info = x;
   ptr->prox = Stack;
   Stack = ptr;
   ptr = NULL;
}
char desempilhar(void)
{ NoPilha *aux;
  char x;
  aux = Stack;
  x = Stack->info;
  Stack = Stack->prox;
  aux->prox = NULL;
  free(aux);
  aux = NULL;
  return x;
}
void devolverPilha()
{  NoPilha *aux;
   if (Stack)
   {  aux = Stack;
      while (aux!=NULL)
      {   Stack = Stack->prox;
          aux->prox = NULL; 
          free(aux);
          aux = Stack;
      } 
   }
   aux = NULL;
   Stack = NULL;
}


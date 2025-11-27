//Este programa mostre o funcionamento da Pilha na alocação dinamica
#include<stdio.h>
#include<stdlib.h>
//#include<conio.h>
struct Nodo{
       int info;
       struct Nodo *prox;
};//definição uma caixinha (celula)
typedef struct Nodo celula; //definir a estrutura Nodo como celula
//um ponteiro (cabeça) para uma Pilha : uma variável global
celula *Stack = NULL; 
//operações para estrutura pilha
void empilhar(int x); //push(x) ou empilhar
int desempilhar(void); //pop() ou desempilhar
void mostraPilha(void);
void menu(void);
void devolverPilha(void); //devolver os nós da pilha para memória livre (RAM)
//Programa Principal: para testar o funciomanto da pilha
int main(){
   int info;
   int opcao;   
   menu();
   printf("Escolha uma opcao!\n");
   scanf("%d",&opcao);
   while(opcao!=3){
      switch(opcao){
      case 1:
           printf("Digite um numero a ser inserido na Pilha !\n");
           scanf("%d",&info);
           empilhar(info);
           mostraPilha();
           printf("\nUma celula inserida na Pilha!\n");
           break;                 
      case 2:           
           if (!Stack) //pilha vazia
              printf("\nA Pilha esta vazia, nada a fazer! \n");
           else { //Temos uma pilha e pelo menos uma celula     
              //desempilhar();
			  printf("\nA celula %d foi removida na Pilha!\n",desempilhar());                
              mostraPilha();              
           }
           break;
      default:
           printf("Escolha invalida! Somente 3 numeros: 1,2,3\n"); 
	       menu() ;         
           break;
       }
      printf("\nEscolha uma opcao!\n");
      scanf("%d",&opcao);   
    }
   devolverPilha(); //Esvaziar a Pilha para a mem. livre
   printf("Fim do programa!!!\n");
   system("pause");
   return 0;
}
//subprograma: operação push(x) - empilhar/inserção
void empilhar(int x)
{  celula *ptr; //ponteiro auxiliar
   ptr = (celula *)malloc(sizeof(celula)); //alocar uma caixinha(celula) da meméria RAM
   //realizar as operações de push(x)
   ptr->info = x;
   ptr->prox = Stack;
   Stack = ptr;
   ptr = NULL;
}
//subprograma para imprimir os elementos da pilha
void mostraPilha(void)
{
     celula *aux;
     aux = Stack;
     while (aux!=NULL){
           if (aux->prox == NULL)
             printf("%d->#",aux->info);
           else 
             printf("%d->",aux->info);
           aux = aux->prox; //percorre a pilha
	 }
     aux = NULL;
}
//subprograma: operação pop() - desempilhar/remoção
int desempilhar(void)
{ celula *aux; //ponteiro auxiliar
  int dado;
  dado = Stack->info;
  aux = Stack; //aux recebe Stack (receber o endereço do primero nó da Pilha)
  Stack = Stack->prox;//Anda uma posição para frente
  aux->prox = NULL; //desconectar da pilha
  free(aux); // devolver um nó apontado pelo aux para memória livre 
  aux = NULL; //por segurança
  return dado;
} 
//subprograma: devolver todos os nós da pilha para memória RAM
void devolverPilha()//coleta de lixo
{  celula *aux; //ponteiro auxiliar
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
//subprograma: menu() para opção           
void menu(void)
{
     printf("Digite sua escolha:\n"
     "       1 -- Inserir uma celula na Pilha (empilhar/push(x)).\n"     
     "       2 -- Remover uma celula na Pilha (desempilhar/pop()).\n"
     "       3 -- Finalizar. \n ");
}


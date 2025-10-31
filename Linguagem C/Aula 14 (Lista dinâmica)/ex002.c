/* Vamos montar uma lista ligada para armazenar os RAs de alunos */
#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
struct Nodo{
	int id_aluno; //para armazenar o RA do aluno	
	struct Nodo *prox; //um ponteiro para armazenar o endereço da proxima célula
};
typedef struct Nodo celula;
celula *p = NULL; //ponteiro para ficar com endereço da primeira célula
//Declaração de subprogramas
void insereFinal(int);//inserir uma célula no final da lista
void removeInicio(void);//remover uma célula no inicio da lista
void mostralista(void);//mostrar todos os elementos da lista
void removeAll(void);//devolver todas as células da lista para memória (RAM)
void menu(void); //Opção de operações
//programa principal
int main(){
   int ra_aluno, opcao;   
   menu();//mostrar menu()
   printf("Escolha uma opcao!\n");
   scanf("%d",&opcao);
   while(opcao!=3){
      switch(opcao){//multiescolha
      case 1:
           printf("Digite ra de um aluno !\n");
           scanf("%d",&ra_aluno);
           insereFinal(ra_aluno);
           mostralista();
           break;
      case 2:
	       if (p == NULL){
	       	  printf("Nao existe a lista!!!");
		   }
		   else{
		   	   removeInicio();
	           printf("A celula removida !\n");
	           mostralista();
		   }              
           break;
      default:
           printf("Escolha invalida!\n");           
           break;
       }
    printf("\nEscolha uma opcao!\n");
    scanf("%d",&opcao);   
   }
   printf("Fim do programa!!!\n");
   removeAll();   
   system("pause");
   return 0;
}
//subprogramas
void insereFinal(int x){
	celula *ptr, *aux;
	/* pegar uma celula na memória através o comando malloc(...) e
	atribuir o endereço desta célula para o ponteiro ptr (alocação dinâmica) */
	ptr = (celula *)malloc(sizeof(celula));
	ptr->id_aluno = x;
	ptr->prox = NULL;			
	if (p == NULL){//sem lista e essa célula é a primeira
	    p = ptr; //o ponteiro p recebe o endereço da primeira célula
	}
	else{//temos uma lista
	   aux = p;
	   while(aux->prox!=NULL){
	   	  aux = aux->prox; //percorrendo na lista para achar uma célula
	   }
	   //fazer a conexão com a célula apontado por ptr
	   aux->prox = ptr;
	   aux = NULL;
	}
	ptr = NULL;
}
void removeInicio(void){
	celula *aux;
	if (p == NULL){
		printf("Nao existe a lista!\n");
	}
	else{//temos uma lista
		aux = p;
		p = p->prox; //Andar uma célula para frente
		aux->prox = NULL; //desconectar a primeira celula da lista
		free(aux);//devolver a celula apontado pelo aux para memória livre(RAM)
		if (p == NULL){
			printf("Essa celula removida foi ultima celula da lista!\n");
		}
		aux = NULL;
	}	
}
void mostralista(void){
	celula *aux;
	aux = p;
	while(aux!=NULL){
		if (aux->prox==NULL){
			printf("%d->#",aux->id_aluno);
		}
		else{
			printf("%d->",aux->id_aluno);
		}		
		aux = aux->prox; //percorrend a lista
	}
	aux = NULL;
}
void menu(void){
	printf("Menu da opcao:\n"
     "    1 -- Inserir uma celula no final da lista.\n"
     "    2 -- Remover uma celula no inicio da lista.\n"
     "    3 -- Finalizar. \n");
}
//subprograma: coleta de lixo
void removeAll(void){
	celula *aux;
  	if (!p) { //temos uma lista : if (p!==NULL)	 
	    aux = p;
	    while (aux!=NULL){ //percorrer a lista para devolver celula por celula 
	       p = p->prox;
	       aux->prox = NULL; //desconectar essa celula da lista
	       free(aux); //devolver para memória livre
	       aux = p;
        } 
    }
    aux = NULL; p = NULL;
}	

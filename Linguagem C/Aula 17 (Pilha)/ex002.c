//Este programa decodificar uma dada mensagem códificada
#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include "listaLigada.h"
#include "pilhaLigada.h"
//declaração de subprogramas
void Entrada(); //receber uma mensagem
void Decodif_Codif(); //tarefa para codificar uma mensagem ou decoficar 
int Vogal(char c); //verificar as letras vogais
void menu(); //menu de opção 

//programa principal
int main(){
	int opcao;
	menu();
	printf("\nEscolha a sua opcao!\n");
	scanf("%d",&opcao);
	while(opcao!=3){
		switch(opcao){
			case 1:
				printf("informe uma mensagem para codificar:\n");
				Entrada();
				printf("Mensagem digitada foi armazenada numa lista ligada:\n");
				mostralista();
				inverterLista();
				printf("\nMensagem codificada!\n");
				Decodif_Codif();
				devolverPilha();
				devolverlista();
				break;
			case 2:
				printf("informe uma mensagem para decodificar:\n");
				Entrada();
				inverterLista();
				printf("\nMensagem decodificada!\n");
				Decodif_Codif();
				devolverPilha();
				devolverlista();
				break;
			default:
				printf("Escolha invalida!\n");
		}
		printf("\n\n");
		menu();
		printf("Escolha a sua opcao!\n");
		scanf("%d",&opcao);		
	}
	printf("\nFim do programa!\n");	
	system("pause");
	return 0;
}
//Subprogramas
void Entrada(){
    char elem;
	elem =' ';
	getchar(); //letra digitada pelo teclado
	while((elem = getchar())!='\n')	{
		insereNo(elem); //inserir este elemento na lista ligada
	}	
}
int Vogal(char c){
	switch(c){
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return 1;
			break;
		default:
			return 0;
			break;
	}
}
void menu(){
	printf("Menu de opcoes:\n"
	"       1 - Codificar uma mensagem.\n"
	"       2 - Decodificar uma mensagem codificada.\n"
	"       3 - Finalizar. \n");
}
void Decodif_Codif(){
	No *aux; //ponteiro auxiliar
	aux = Ptrlista;
	while(aux!=NULL){
		if (Vogal(aux->info))//se for vogal, simplsmente imprimir
		{   
		    printf("%c",aux->info);
		    aux = aux->prox;
	    }
	    else {//colocar os elementos na pilha	    	
	    	while((aux!=NULL)&&(!Vogal(aux->info))){
	    		empilhar(aux->info);
	    		aux = aux->prox;
			}
	    	while(Stack!=NULL){//imprimir a pilha
	    		printf("%c",desempilhar());
			}
		}
   }
}

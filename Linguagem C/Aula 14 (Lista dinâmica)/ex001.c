/* Este programa é para mostrar como criar uma célula em C */
#include<stdio.h>
#include<string.h> // Para usar o comando strcpy(...)
#include<locale.h>

// Definindo uma célula usando struct
struct Aluno {
	// char nome[50];
	char *nome;
	int idade;
	float nota;
};
typedef struct Aluno alunos; // Define struct Aluno como "alunos"

int main(){
	setlocale(LC_ALL,"Portuguese");
	alunos aluno1;
	alunos *ptr;
	
	aluno1.idade = 25;
	aluno1.nota = 8.6;
	// Cria uma cópia com nome "Neymar" e atribiuir para aluno1.nome
	// strcpy(aluno1.nome, "Neymar");
	aluno1.nome = "Neymar";
	ptr = &aluno1; //ptr recebeu o endereço da célula aluno1
	
	printf("Dados mostrados na célula: \n");
	printf("Nome: %s \n", aluno1.nome);
	printf("Idade: %d \n", aluno1.idade);
	printf("Nota: %f \n", aluno1.nota);
	
	printf("Dados mostrados na célula usando ponteiro ptr: \n");
	printf("Nome: %s \n", ptr->nome);
	printf("Idade: %d \n", ptr->idade);
	printf("Nota: %f \n", ptr->nota);
	
	return 0;
}

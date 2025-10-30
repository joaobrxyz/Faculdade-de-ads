/* Este programa � para mostrar como criar uma c�lula em C */
#include<stdio.h>
#include<string.h> // Para usar o comando strcpy(...)
#include<locale.h>

// Definindo uma c�lula usando struct
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
	// Cria uma c�pia com nome "Neymar" e atribiuir para aluno1.nome
	// strcpy(aluno1.nome, "Neymar");
	aluno1.nome = "Neymar";
	ptr = &aluno1; //ptr recebeu o endere�o da c�lula aluno1
	
	printf("Dados mostrados na c�lula: \n");
	printf("Nome: %s \n", aluno1.nome);
	printf("Idade: %d \n", aluno1.idade);
	printf("Nota: %f \n", aluno1.nota);
	
	printf("Dados mostrados na c�lula usando ponteiro ptr: \n");
	printf("Nome: %s \n", ptr->nome);
	printf("Idade: %d \n", ptr->idade);
	printf("Nota: %f \n", ptr->nota);
	
	return 0;
}

/* Este programa é para mostrar um subprograma que 
funciona como um procedimento */

#include<stdio.h> // Biblioteca padrão para entrada e saída

void mensagem(); // Declaração de subprograma
int main() {
	mensagem(); // Chamando subprograma mensagem()
	
	system("pause");
	return 0;
}

// Subprograma
void mensagem(){
	printf("Seja bem vindo a linguagem C avançada!!\n");
}

/* Este programa � para mostrar um subprograma que 
funciona como um procedimento */

#include<stdio.h> // Biblioteca padr�o para entrada e sa�da

void mensagem(); // Declara��o de subprograma
int main() {
	mensagem(); // Chamando subprograma mensagem()
	
	system("pause");
	return 0;
}

// Subprograma
void mensagem(){
	printf("Seja bem vindo a linguagem C avan�ada!!\n");
}

#include<stdio.h>//é uma biblioteca padrão para entrada e saida
#include<stdlib.h> // é uma biblioteca para usar o comando system("pause")
//programa principal main()
int main(){
	//declaração de variáveis:
	int num1, num2; //variáveis para entrada de dados
	int result_soma; //variável para saida de dados	
	/*O comando scanf() é para receber um dado digitado por usuário 
	%d - formatação em inteiro; & - operador de endereço */
	printf("Informe um numero inteiro: ");
	scanf("%d",&num1);
	printf("Informe um outro numero inteiro: ");
	scanf("%d",&num2);	
	//Realizar a operação da soma
	/* símbolo "=" significar receber ou atribuição
	   simbolo "+" operador da soma  */
	result_soma = num1 + num2;	
	// \n é para pular uma linha
	printf("Resultado da soma = %d\n ",result_soma);
	system("pause");
	return 0;
}

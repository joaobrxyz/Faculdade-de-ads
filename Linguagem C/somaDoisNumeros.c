#include<stdio.h>//� uma biblioteca padr�o para entrada e saida
#include<stdlib.h> // � uma biblioteca para usar o comando system("pause")
//programa principal main()
int main(){
	//declara��o de vari�veis:
	int num1, num2; //vari�veis para entrada de dados
	int result_soma; //vari�vel para saida de dados	
	/*O comando scanf() � para receber um dado digitado por usu�rio 
	%d - formata��o em inteiro; & - operador de endere�o */
	printf("Informe um numero inteiro: ");
	scanf("%d",&num1);
	printf("Informe um outro numero inteiro: ");
	scanf("%d",&num2);	
	//Realizar a opera��o da soma
	/* s�mbolo "=" significar receber ou atribui��o
	   simbolo "+" operador da soma  */
	result_soma = num1 + num2;	
	// \n � para pular uma linha
	printf("Resultado da soma = %d\n ",result_soma);
	system("pause");
	return 0;
}

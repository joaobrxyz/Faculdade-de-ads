#include<stdio.h>
#include <locale.h>

int main () {
	setlocale(LC_ALL,"Portuguese");
	
	// na declara��o de vari�veis, * indica que tal vari�vel � um ponteiro
	int x, *ptr_int;
	float y, *ptr_float;
	x = 25; y = 65.99;
	
	//& - operador de endere�o
	printf("O endere�o da vari�vel x na mem�ria: %p\n",&x);
	printf("O endere�o da vari�vel y na mem�ria: %p\n",&y);
	printf("O endere�o do ptr_int na mem�ria: %p\n",&ptr_int);
	printf("O endere�o do ptr_float na mem�ria: %p\n",&ptr_float);
	
	ptr_int = &x; // Agora o ptr_int est� apontando para x
	ptr_float = &y; // Agora o ptr_int est� apontando para y
	printf("O endere�o do ptr_int que recebeu: %p\n",ptr_int);
	printf("O endere�o do ptr_float que recebeu: %p\n",ptr_float);
	
	*ptr_int = 63; // O conte�do da vari�vel (x) que ptr_int est� apontando
	*ptr_float = 75.86; // O conte�do da vari�vel (y) que ptr_float est� apontando
	printf("O valor da vari�vel x = %d\n",x);
	printf("O valor da vari�vel y = %.2f\n",y);
	printf("O valor da vari�vel x = %d\n",*ptr_int);
	printf("O valor da vari�vel y = %.2f\n",*ptr_float);

	
	return 0;
}

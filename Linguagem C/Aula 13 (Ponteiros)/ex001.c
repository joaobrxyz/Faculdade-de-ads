#include<stdio.h>
#include <locale.h>

int main () {
	setlocale(LC_ALL,"Portuguese");
	
	// na declaração de variáveis, * indica que tal variável é um ponteiro
	int x, *ptr_int;
	float y, *ptr_float;
	x = 25; y = 65.99;
	
	//& - operador de endereço
	printf("O endereço da variável x na memória: %p\n",&x);
	printf("O endereço da variável y na memória: %p\n",&y);
	printf("O endereço do ptr_int na memória: %p\n",&ptr_int);
	printf("O endereço do ptr_float na memória: %p\n",&ptr_float);
	
	ptr_int = &x; // Agora o ptr_int está apontando para x
	ptr_float = &y; // Agora o ptr_int está apontando para y
	printf("O endereço do ptr_int que recebeu: %p\n",ptr_int);
	printf("O endereço do ptr_float que recebeu: %p\n",ptr_float);
	
	*ptr_int = 63; // O conteúdo da variável (x) que ptr_int está apontando
	*ptr_float = 75.86; // O conteúdo da variável (y) que ptr_float está apontando
	printf("O valor da variável x = %d\n",x);
	printf("O valor da variável y = %.2f\n",y);
	printf("O valor da variável x = %d\n",*ptr_int);
	printf("O valor da variável y = %.2f\n",*ptr_float);

	
	return 0;
}

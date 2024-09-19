#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main (){
    setlocale(LC_ALL,"Portuguese");
    int cont;
    for(cont = 1; cont <= 20; cont++){
         printf("Valor do contador = %d\n",cont);
         printf("Hello world!\n\n");
    }
    printf("\nFim do programa!\n");
    system("pause");
    return 0;    
}

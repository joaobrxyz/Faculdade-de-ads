#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
int main (){
    setlocale(LC_ALL,"Portuguese");
    int cont = 1;
    while(cont <= 20){
         printf("Valor do contador = %d\n",cont);
         printf("Hello world!\n\n");
         cont++;
    }
    printf("\nFim do programa!\n");
    system("pause");
    return 0;    
}

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <locale.h>
int main(){	
    setlocale(LC_ALL,"Portuguese");
    int cont, num, n;
    srand(time(NULL)); //semente para gerar uma sequencia de números 
    printf("Informe a quantidade numeros para MegaSena: n = ");
    scanf("%d",&n);
    printf("Os numeros gerados para MegaSena:\n");   
    /*cont = 1;
    while (cont <= n){    	
    	// gerar um número aleatório para mega sena 
    	num = 1 + rand()%60 ;
    	printf("%d ",num);
    	cont++;  //cont = cont + 1;  	    	
    }  */
    for (cont = 1; cont <= n; cont++){
    	num = 1 + rand()%60 ;
    	printf("%d ",num);
    }
    printf("\n");
    system("pause");
    return 0;    
}

#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define max 10
//Programa para testar o algoritmo de Busca Binaria
int BuscaBinaria(int A[],int n,int x); //protótipo do subprograma
int main()
{  int A[max], num,i;
   srand(time(NULL));//semente para gerar os numeros aleatorios

   printf("Entra com dados ordenados:\n");
   for(i=0;i<max;i++)
      scanf("%d",&A[i]);      
      //A[i]= 1 + (rand()%60);//vetor recebe os numeros aleatórios  
      
   for(i=0;i<max;i++)
   { printf(" A[%d]= %d",i,A[i]);
     printf("\n"); }
     
   printf("Digite um numero inteiro a ser pesquisado:\n");
   scanf("%d",&num);
   if (BuscaBinaria(A,max,num))
      printf("Este numero %d pertence no vetor A.\n",num);
   else
      printf("Este numero %d nao pertence no vetor A.\n",num);  
   
   system("pause"); 
   return 0;  
}
// subprograma para fazer busca binaria  
int BuscaBinaria(int A[],int n,int x)
{   
    int achou = 0; //variável booleano 
	int L = 0, R = n-1, m; //variáveis para manipular os indices
    while((!achou)&&(L<=R))
    {   
	    m = (L + R)/2; //achar o indice do meio
        if (x == A[m])
           achou = 1;
        else if (x < A[m])
                  R = m-1; //pegar a parte esquerda
             else
                  L = m+1; //pegar a parte direita
      }
    return achou;
}

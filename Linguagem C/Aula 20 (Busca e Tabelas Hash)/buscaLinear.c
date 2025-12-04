#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define max 10
//Programa para testar o algoritmo de Busca Linear
int BuscaLinear(int A[],int n,int x); //protótipo do subprograma
int main()
{  int A[max], num,i;
   srand(time(NULL));//semente para gerar os numeros aleatorios

   for(i=0;i<max;i++)      
      A[i]= 1 + (rand()%60);//vetor recebe os numeros aleatórios  
   
   printf("Os numeros gerados no vetor A[]:\n");
   for(i=0;i<max;i++)
   { printf(" A[%d]= %d",i,A[i]);
     printf("\n"); }
     
   printf("Digite um numero inteiro a ser pesquisado:\n");
   scanf("%d",&num);
   if (BuscaLinear(A,max,num))
      printf("Este numero %d pertence no vetor A.\n",num);
   else
      printf("Este numero %d nao pertence no vetor A.\n",num);  
   
   system("pause");   
}
// subprograma para fazer busca liear   
int BuscaLinear(int A[],int n,int x)
{   
    int achou = 0, i = 0;
    while ((!achou)&&(i<n))
    { if (x == A[i])
          achou = 1;
        i++; }
    return achou;
    return 0;
}
        
    
    

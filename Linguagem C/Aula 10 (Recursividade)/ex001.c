#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
void mensagem(); // Declara��o de um subprograma
int main(){ // Programa principal
    setlocale(LC_ALL,"Portuguese");
    mensagem(); // Chamando subprograma mensagem()
    system("pause");
    return 0;
}
// Subprograma
void mensagem(){
     printf("Ol�, sou um subprograma!\n");     
}

#include<stdio.h> 
#include<stdlib.h> 
//criar uma estrutura de de ABB   
struct node 
{ 
    int key;
    //float media; 
    struct node *left, *right; 
};   
// Declaração das subrotinas (subprogrmas) 
struct node *newNode(int item);
struct node* insert(struct node* node, int key);
void inorder(struct node *root) ;

// programa principal para testar as subrotinas mencionadas 
main() 
{ 
    /* vamos criar uma ABB a seguir
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
       
    struct node *root = NULL;
    printf("ABB sair em in-ordem: \n"); 
    
    root = insert(root, 50); //insere a raiz
    insert(root, 30); 
    insert(root, 20); 
    insert(root, 40); 
    insert(root, 70); 
    insert(root, 60); 
    insert(root, 80);    
    //Imprimir ABB em ordem crescente: in-ordem
    inorder(root); 
   
    system("pause"); 
}

// criar um nó do tipo ABB 
struct node *newNode(int item) 
{ 
    struct node *temp = (struct node *)malloc(sizeof(struct node)); // alocação dinâmica
    temp->key = item; 
    temp->left = temp->right = NULL; 
    return temp; 
}  
// A operação da inserção para ABB
struct node* insert(struct node* node, int key) 
{ 
    /* se ABB é vazia, return a novo nó ABB */
    if (node == NULL) return newNode(key); 
  
    /* Caso contráro, inserir no ABB */
    if (key < node->key) 
        node->left  = insert(node->left, key); 
    else if (key > node->key) 
        node->right = insert(node->right, key);    
  
    /* return um pointer do nó ABB */
    return node; 
} 
// A subrotina para imprimir ABB em in-ordem
void inorder(struct node *root) 
{ 
    if (root != NULL) 
    { 
        inorder(root->left); 
        printf("%d \n", root->key); 
        inorder(root->right); 
    } 
} 

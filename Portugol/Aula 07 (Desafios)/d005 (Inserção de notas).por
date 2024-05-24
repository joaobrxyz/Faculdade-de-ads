programa {
  funcao inicio() 
  {
    
    inteiro c
    real n[5]
    cadeia aluno[5]

    c = 1

    escreva("----------------------------------------------------------")
    escreva("\n")
    escreva("Seja bem vindo ao programa de inserção de notas do ENIAC")
    escreva("\n")
    escreva("----------------------------------------------------------")
    escreva("\n")
    escreva("\n")
    
    escreva("Para começar, vamos inserir o nome dos alunos.")
    escreva("\n")
    escreva("\n")

    faca
    {
      
      escreva("Digite o nome do ", c, "º aluno: ")
      leia(aluno[c-1])
      c++

    } enquanto (c<=5)

    escreva("\n")
    escreva("\n")
    escreva("Agora, vamos colocar suas notas no sistema.")
    escreva("\n")
    escreva("\n")

    c = 1

    faca 
    {

      escreva("A nota do aluno, ", aluno[c-1], " foi: ")
      leia(n[c-1])
      c++

    } enquanto (c<=5)
    
    escreva("\n")
    escreva("\n")
    escreva("----------------------------Muito bem, apresentando o painel de notas:----------------------------")

    c = 1

    escreva("\n")
    
    faca 
    {

      escreva("Nome do aluno ", aluno[c-1])
      escreva("\n")
      escreva("Nota do aluno do aluno ", aluno[c-1])
      escreva("\n")
      c++

    } enquanto (c<=5)
    
  }
  
}

programa 
{

  funcao inicio() 
  {
    
    cadeia opcao

    escreva("Elogio")
    escreva("\n")
    escreva("Ofensa")
    escreva("\n")
    escreva("Sair")
    escreva("\n")
    escreva("\n")

    escreva("Escolha uma opção: ")
    leia(opcao)

    escolha(opcao) 
    {
      
      caso "Elogio":
      
      escreva("Você definitivamente é o sigma da Bahia!")

      pare

      caso "Ofensa":
      
      escreva("Você é um beta!")

      pare

      caso "Sair":
      
      escreva("Tchau!")

      pare

      caso contrario:
      
      escreva("Vc digitou uma opção inválida!")

      pare

    }

  }

}

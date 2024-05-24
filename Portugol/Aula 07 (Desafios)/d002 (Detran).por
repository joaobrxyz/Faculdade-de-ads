programa {
  funcao inicio() 
  {

    inteiro a, n, i
    
    escreva("-------DETRAN-------")
    escreva("\n")
    escreva("\n")

    escreva("Seja bem vindo ao sistema de detecção de idade do DETRAN")
    escreva("\n")
    escreva("Digite o ano em que estamos: ")
    leia(a)
    escreva("\n")
    escreva("\n")

    escreva("Agora, digite o ano em que o cidadão nasceu: ")
    leia(n)
    escreva("\n")
    escreva("\n")

    escreva("------calculando-------")
    escreva("\n")
    escreva("\n")

    i = a - n

    se (i >= 18) 
    {

      escreva("O cidadão está apto a tirar sua carteira de motorista")
      escreva("\n")
      escreva("\n")

    }
    senao 
    {

      escreva("O cidadão ainda não está apto a tirar sua carteira de motorista")
      escreva("\n")
      escreva("\n")

    }
    
    escreva("-------Finalizando programa-------")

  }
  
}

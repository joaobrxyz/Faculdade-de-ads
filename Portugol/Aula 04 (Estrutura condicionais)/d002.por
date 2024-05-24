programa {
  funcao inicio() 
  {
    
    real x, y

    escreva("-------DETRAN-------")
    escreva("\n")
    escreva("\n")

    escreva("Seja bem vindo ao sistema de detecção de idade do DETRAN")
    escreva("\n")
    escreva("Digite o ano em que estamos: ")
    leia(x)
    escreva("\n")
    escreva("Agora, digite o ano em que o cidadão nasceu: ")
    leia(y)
    escreva("\n")
    escreva("\n")

    escreva("------calculando-------")
    escreva("\n")
    escreva("\n")

    se((x - y) >= 18)
    {

      escreva("O cidadão está apto a tirar sua carteira de motorista")

    }
    senao
    {

      escreva("O cidadão ainda não está apto a tirar sua carteira de motorista")

    }

    escreva("\n")
    escreva("\n")

    escreva("-------Finalizando programa-------")
  }
}

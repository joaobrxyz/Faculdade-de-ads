programa {
  funcao inicio() 
  {

    real x
    
    escreva("Digite o número que quer descobrir a paridade: ")
    leia(x)
    escreva("\n")
    escreva("\n")

    se((x % 2) == 1)
    {

      escreva(x, " é um número ímpar")

    }
    senao
    {

      escreva(x, " é um número par")

    }

  }
}
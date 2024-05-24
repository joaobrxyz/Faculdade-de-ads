programa {
  funcao inicio() 
  {

    real x
    
    escreva("Digite o horário do dia (entre 0 e 23 horas): ")
    leia(x)
    escreva("\n")
    escreva("\n")

    se((x >= 6)e(x < 18))
    {

      escreva("Agora é dia")

    }
    senao
    {

      escreva("Agora é noite")

    }

  }
}

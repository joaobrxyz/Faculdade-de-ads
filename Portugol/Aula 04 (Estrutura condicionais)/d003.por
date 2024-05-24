programa {
  funcao inicio() 
  {

    real x
    
    escreva("Digite o horário do dia (entre 0 e 23 horas): ")
    leia(x)
    escreva("\n")
    escreva("\n")

    se((x >= 6)e(x < 12))
    {

      escreva("Agora é de manhã")

    }
    senao
    {

      se((x >= 12) e (x < 18))
      {

        escreva("Agora é de tarde")

      }
      senao
      {

        se((x >= 18) e (x < 24))
        {

          escreva("Agora é de noite")

        }
        senao
        {

          escreva("Agora é de madrugada")

        }

      }

    }

  }
}

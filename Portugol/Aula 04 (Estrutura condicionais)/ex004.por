programa 
{
  funcao inicio() 
  {

    real nota 

    escreva("Qual nota você tirou no trabalho? ")
    leia(nota)

    se (nota < 6)
    {

      escreva("Poxa vida, infelizmente com essa nota você foi reprovado")

    }

    senao
    {

      se ((nota >= 6) e (nota < 8))
      {

        escreva("Essa foi por pouco hein, tome cuidado na próxima mas você ainda está aprovado")

      }

      senao
      {

        se ((nota >= 8) e (nota <= 10))
        {

          escreva("Caramba, que nota boa que você conseguiu, meus parabéns! continue assim!")

        }

        senao
        {

          escreva("Você não digitou uma nota válida, pense de novo em qual sua nota verdadeira.")

        }

      }

    }

  }
  
}

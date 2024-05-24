programa 
{
  funcao inicio() 
  {

    cadeia decisao

    escreva("Você ainda quer continuar? [sim/nao]: ")
    leia(decisao)
    escreva("\n")

    se (decisao == "sim")
    {

      escreva("Que ótimo, estou aliviado!")

    }

    senao
    {

      se (decisao == "nao")
      {

        escreva("Não fique triste porque acabou, fique feliz porque aconteceu")

      }

      senao
      {

        escreva("Você não conseguiu decidir ainda? Pense um pouco e rode o programa novamente")

      }

    }

  }

}

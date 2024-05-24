programa
{

  funcao inicio() 
  {
    
    real resposta

    escreva("Oi, vamos fazer uma brincadeira?")
    escreva("\n")
    escreva("Eu vou pensar em um número entre 1 e 9 e você tem que adivinhar qual é ele!")
    escreva("\n")
    escreva("Em qual número estou pensando? ")
    leia(resposta)

    enquanto (resposta != 3)
    {

      escreva("Não é bem esse. Tenta denovo!")
      escreva("\n")
      escreva("Em qual número estou pensando? ")
      leia(resposta)
      escreva("\n")

    }

    escreva("\n")
    escreva("Caramba, você acertou! Parabéns!")

  }

}

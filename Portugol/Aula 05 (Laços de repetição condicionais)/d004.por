programa
{

  funcao inicio() 
  {
    
    real resposta

    escreva("Oi, vamos fazer uma brincadeira?")
    escreva("\n")
    escreva("Eu vou pensar em um número entre 1 e 100 e você tem que adivinhar qual é ele!")
    escreva("\n")
    escreva("Em qual número estou pensando? ")
    leia(resposta)

    enquanto (resposta != 29)
    {
      
      se (resposta > 29)
      {

        escreva("O número que você digitou é maior que o que eu pensei!")
        escreva("\n")
        escreva("Tente denovo!")
        escreva("\n")
        escreva("Em qual número estou pensando? ")
        leia(resposta)
        escreva("\n")

      }
      senao
      {

        escreva("O número que você digitou é menor que oque eu pensei!")
        escreva("\n")
        escreva("Tente denovo!")
        escreva("\n")
        escreva("Em qual número estou pensando? ")
        leia(resposta)
        escreva("\n")

      }

    }

    escreva("\n")
    escreva("Caramba, você acertou! Parabéns!")

  }

}

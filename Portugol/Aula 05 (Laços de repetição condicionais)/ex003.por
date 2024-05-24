programa 
{

  funcao inicio() 
  {
    
    real somatorio, valor, limite

    somatorio = 0


    escreva("Até qual número você quer somar? ")
    leia(limite)
    escreva("\n")
    escreva("Digite números para serem somados ao total.")

    enquanto (somatorio <= limite)
    {

      leia(valor)
      escreva("\n")

      somatorio = somatorio + valor

      escreva("O valor atual do somatório é: ", somatorio)
      escreva("\n")

    }

  }

}

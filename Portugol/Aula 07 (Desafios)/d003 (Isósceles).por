programa {
  funcao inicio() 
  {
    
    real l1, l2, l3

    escreva("Digite o comprimento (em centímetros) do primeiro lado: ")
    leia(l1)
    escreva("\n")
    escreva("\n")

    escreva("Digite o comprimento (em centímetros) do segundo lado: ")
    leia(l2)
    escreva("\n")
    escreva("\n")

    escreva("Digite o comprimento (em centímetros) do terceiro lado: ")
    leia(l3)
    escreva("\n")
    escreva("\n")

    se(l1 == l2 ou l1 == l3 ou l2 == l3) 
    {

      escreva("Esse triângulo é isósceles!")

    }
    senao 
    {

      escreva("Esse triângulo não é isósceles!")

    }
    
  }
  
}

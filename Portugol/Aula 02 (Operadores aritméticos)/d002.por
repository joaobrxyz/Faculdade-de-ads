programa {
  funcao inicio() 
  {

    real x, y, z

    escreva("Digite o valor base para o cálculo: ")
    leia(x)
    escreva("\n")
    escreva("\n")

    escreva("Agora, digite o valor da porcentagem que você quer descobrir do valor base: ")
    leia(y)
    escreva("\n")
    escreva("\n")

    z = (x * y)/100

    escreva(y, "% de ", x," é ", z)

  }
}

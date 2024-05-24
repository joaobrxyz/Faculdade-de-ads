programa {
  funcao inicio() 
  {

    real x, y, z

    escreva("Digite o peso da pessoa, em quilos: ")
    leia(x)
    escreva("\n")
    escreva("\n")

    escreva("Agora, digite a altura da pessoa, em metros: ")
    leia(y)
    escreva("\n")
    escreva("\n")

    z = x/(y*y)

    escreva("O IMC dessa pessoa é: ", z)

  }
}

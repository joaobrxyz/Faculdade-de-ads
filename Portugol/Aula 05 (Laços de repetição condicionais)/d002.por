programa {
  funcao inicio() 
  {
    
    caracter a
    inteiro x, y, m
    real n

    m = 0
    y = 1

    escreva("Bem vindo ao programa de somatório!")
    escreva("\n")
    escreva("\n")

    faca
    {

      escreva("Digite o ", y,"º valor: ")
      leia(n)
      escreva("\n")
      escreva("\n")

      m = m + n
      y = y + 1

      escreva("Você gostaria de continuar? [s/n] ")
      leia(a)
      escreva("\n")

    } enquanto(a == "s")

    escreva("\n")
    escreva("\n")
    escreva("A somatória dos valores digitados é: ", m)

  }
}

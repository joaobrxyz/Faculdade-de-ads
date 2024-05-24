programa {
  funcao inicio() 
  {
    
    real p, a, imc

    escreva("Digite o peso da pessoa, em quilos: ")
    leia(p)
    escreva("\n")

    escreva("Agora, digite a altura da pessoa, em metros: ")
    leia(a)
    escreva("\n")

    imc = p / (a * a)
    escreva("O IMC dessa pessoa é: ", imc)

  }
  
}

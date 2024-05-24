programa {
  funcao inicio() 
  {

    real x, y, z

    escreva("Digite o seu peso, em quilos: ")
    leia(x)
    escreva("\n")
    escreva("\n")

    escreva("Agora, digite sua altura, em metros: ")
    leia(y)
    escreva("\n")
    escreva("\n")

    z = x/(y*y)

    escreva("O seu IMC é: ", z)
    escreva("\n")
    escreva("\n")

    se((z >= 18.5) e (z <= 23))
    {

      escreva("Você está em seu peso ideal!")

    }
    senao
    {

      escreva("Você não está em seu peso ideal, sugiro procurar um médico")

    }
  }
}

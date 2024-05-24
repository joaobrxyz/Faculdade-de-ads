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

    se(z < 18.5)
    {

    escreva("Você está MUITO abaixo do peso, procure ajuda!")  

    }
    senao
    {

      se((z >= 18.5) e (z < 24.9))
      {

        escreva("Voce está em seu peso ideal, parabéns!")

      }
      senao
      {

        se((z >= 24.9) e (z < 29.9))
        {

          escreva("Você está em leve sobrepeso, cuidado!")

        }
        senao
        {

          se((z >= 29.9) e (z < 34.9))
          {

            escreva("Você está com bastante sobrepeso, recomendo procurar um médico")

          }
          senao
          {

            se((z >= 34.9) e (z < 39.9))
            {

              escreva("Você esta com muito sobrepeso, sua saúde pode estar em risco!")

            }
            senao
            {

              escreva("Você está em obesidade mórbida e precisa de ajuda urgente")

            }
          }
        }
      }
    }
  }
}

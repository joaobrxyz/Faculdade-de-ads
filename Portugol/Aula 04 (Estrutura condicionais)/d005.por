programa {
  funcao inicio() 
  {
    
    real x

    escreva("-----BEM VINDO AO CRIANÇA ESPERANÇA-----")
    escreva("\n")
    escreva("\n")

    escreva("Agradecemos a sua ligação, veja as opções de doação que você pode fazer:")
    escreva("\n")
    escreva("Para doar 10 reais, digite [1]")
    escreva("\n")
    escreva("Para doar 20 reais, digite [2]")
    escreva("\n")
    escreva("Para doar 50 reais, digite [3]")
    escreva("\n")
    escreva("Para doar 100 reais, digite [4]")
    escreva("\n")
    escreva("Para cancelar, digite [5]")
    escreva("\n")
    escreva("------------------------------------")
    escreva("\n")
    escreva("\n")

    escreva("Digite a opção desejada: ")
    leia(x)

    se(x == 1)
    {

      escreva("Obrigado pela sua doação de R$10, uma criança agradece!")

    }
    senao
    {

      se(x==2)
      {

        escreva("Nossa, estamos contentes de poder ter doadores como você! Sua doação de R$20 foi realizada com sucesso")

      }
      senao
      {

        se(x==3)
        {

          escreva("Poxa vida, com esses R$50 várias crianças vão poder almoçar, muito obrigado!")
    
        }
        senao
        {

          se(x==4)
          {

            escreva("Com essa doação de R$100, podemos ajudar muita gente. Estamos muito felizes de poder contar com a sua ajuda!")

          }
          senao
          {

            se(x==5)
            {

              escreva("Poxa vida, entendo, foi engano então. Espero que possa nos ajudar um outro dia!")

            }
            senao
            {

              escreva("Por favor, digite um número válido de nosso menu.")

            }
          }
        }
      }
    }
  }
}

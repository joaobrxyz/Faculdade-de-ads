programa {
  funcao inicio() 
  {
    
    inteiro opcao

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
    escreva("---------------------------------")
    escreva("\n")
    escreva("\n")


    escreva("Digite a opção desejada: ")
    leia(opcao)

    escolha(opcao) 
    {

      caso 1:

      escreva("Muito obrigado pela doação de R$10!")

      pare

      caso 2:

      escreva("Muito obrigado pela doação de R$20! Graças a ela, uma criança poderá almoçar.")

      pare

      caso 3:

      escreva("Poxa vida, com esses R$50 várias crianças vão poder almoçar, muito obrigado!")

      pare

      caso 4:

      escreva("Com essa doação de R$100, podemos ajudar muita gente. Estamos muito felizes de poder contar com a sua ajuda!")

      pare

      caso 5:

      escreva("Você ainda pode ajudar compartilhando a campanha!")

      pare

      caso contrario:

      escreva("Você digitou uma opção inválida!")

      pare

    }
    
    
  }
  
}

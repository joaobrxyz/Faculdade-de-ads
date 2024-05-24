programa 
{

  funcao inicio() 
  {
    
    cadeia opcao
    real saldo, saque

    saldo = 1000

    escreva("Seja bem vindo ao banco ENIAC")
    escreva("\n")
    escreva("Aqui você pode sacar seu dinheiro, mas não temos nenhum empréstimo disponível.")
    escreva("\n")
    escreva("Atualmente, seu saldo é de: R$", saldo)
    escreva("\n")
    escreva("\n")

    faca
    {

      escreva("Quanto você quer sacar da sua conta?")
      escreva("\n")
      escreva("R$")
      leia(saque)

      saldo = saldo - saque

      escreva("Você gostaria de retirar mais dinheiro? [s/n]: ")
      leia(opcao)
      escreva("\n")

    }
    enquanto ((opcao == "s") e (saldo > 0))

    se (saldo >= 0 )
    {

      escreva("Seu saldo final é de R$", saldo)
      escreva("\n")
      escreva("Muito obrigado por usar nossos serviços!")

    }
    senao
    {

      escreva("VOCÊ PEGOU MAIS DO QUE DEVERIA, VAMOS ATRÁS DE VOCÊ!")

    }

  }

}

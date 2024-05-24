programa 
{

  funcao inicio() 
  {
    
    cadeia senha
    inteiro tentativas

    tentativas = 3

    escreva("Seja bem vindo ao programa de segurança do Eniac.")
    escreva("\n")
    escreva("Você tem ", tentativas, " tentativas.")
    escreva("\n")
    escreva("\n")
    escreva("Para continuar, por favor, insira sua senha: ")
    leia(senha)
    escreva("\n")

    faca
    {

      tentativas = tentativas - 1

      escreva("Senha incorreta, você tem mais ",tentativas, " tentativas")
      escreva("\n")
      escreva("Para continuar, por favor, insira sua senha: ")
      leia(senha)
      escreva("\n")

    }
    enquanto ((senha != "OláMundo!") e (tentativas > 1))

    se (senha == "OláMundo!")
    {

      escreva("\n")
      escreva("Seja bem vindo, pode continuar.")

    }
    senao
    {

      escreva("Infelizmente, você esgotou suas tentativas, o programa será encerrado.")

    }

  }

}

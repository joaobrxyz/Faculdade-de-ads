programa 
{

  funcao inicio() 
  {
    
    inteiro opcao

    escreva("Seja bem vindo ao cardápio virtual do ENIAC")
    escreva("\n")
    escreva("Vou lhe passar quais são as opções de pratos servidos hoje e você escolhe qual irá pedir.")
    escreva("\n")
    escreva("\n")

    escreva("1) Macarronada")
    escreva("\n")
    escreva("2) Parmegianna")
    escreva("\n")
    escreva("3) Frango a milanesa")
    escreva("\n")
    escreva("4) Peixe frito")
    escreva("\n")
    escreva("\n")

    escreva("Qual opção você deseja? [1 a 4]: ")
    leia(opcao)

    escolha(opcao) 
    {

      caso 1:

      escreva("\n")
      escreva("A macarronada está custando R$30")
      escreva("\n")

      pare

      caso 2:

      escreva("\n")
      escreva("A parmegianna está custando R$40")
      escreva("\n")

      pare

      caso 3:

      escreva("\n")
      escreva("O frango a milanesa está custando R$35")
      escreva("\n")

      pare

      caso 4:

      escreva("\n")
      escreva("O peixe frito está custando R$40")
      escreva("\n")

      pare

      caso contrario:

      escreva("\n")
      escreva("Você escolheu uma opção inválida!")
      escreva("\n")

    }

  }

}

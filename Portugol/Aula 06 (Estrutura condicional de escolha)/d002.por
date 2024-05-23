programa 
{

  funcao inicio() 
  {
    
    inteiro dia

    escreva("Olá, este é o programa de definição do dia da semana")
    escreva("\n")
    escreva("Aqui você insere qual é o número do dia da semana e eu lhe digo qual dia é esse.")
    escreva("\n")
    escreva("Qual é o número do dia da semana? [1 a 7]: ")
    leia(dia)
    escreva("\n")
    escreva("\n")

    escolha(dia) 
    {

      caso 1:

      escreva("Dia ", dia, " é domingo!")

      pare

      caso 2:

      escreva("Dia ", dia, " é segunda!")

      pare

      caso 3:

      escreva("Dia ", dia, " é terça!")

      pare

      caso 4:

      escreva("Dia ", dia, " é quarta!")

      pare

      caso 5:

      escreva("Dia ", dia, " é quinta!")

      pare

      caso 6:

      escreva("Dia ", dia, " é sexta!")

      pare

      caso 7:

      escreva("Dia ", dia, " é sábado!")

      pare

      caso contrario:
      
      escreva("Vc digitou uma opção inválida!")

      pare

    }
    

  }

}

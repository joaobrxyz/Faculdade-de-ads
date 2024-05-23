programa 
{

  funcao inicio() 
  {
    
    cadeia disciplina

    escreva("Este é o programa de definição de critérios de avaliação do ENIAC.")
    escreva("\n")

    escreva("Aqui você escolhe o tipo da disciplina e eu lhe digo qual é o critério de avaliação dela.")
    escreva("\n")
    escreva("\n")

    escreva("Aqui estão os tipos de disciplina do ENIAC:")
    escreva("\n")
    escreva("REGULAR")
    escreva("\n")
    escreva("PROJETO")
    escreva("\n")
    escreva("TOPICOS ESPECIAIS")
    escreva("\n")
    escreva("\n")

    escreva("Qual é o tipo da disciplina que você quer conferir?")
    escreva("\n")
    escreva("Digite EXATAMENTE o nome do tipo com a caixa alta: ")
    leia(disciplina)

    escolha(disciplina)
    {

    caso "REGULAR":
    
    escreva("\n")
    escreva("2 pontos dos exercícios, 3 pontos do portfólio e 5 pontos da prova.")

    pare

    caso "PROJETO":

    escreva("\n")
    escreva("Existem 3 sprints, e no final é atribuído uma nota de 0 a 10.")

    pare

    caso "TOPICOS ESPECIAIS":

    escreva("\n")
    escreva("É feito um simulado em três tentativas e a nota é a maior dentre elas")

    pare

    caso contrario:

    escreva("\n")
    escreva("Você escolheu uma opção inválida!")
    escreva("\n")

    pare

    }

  }

}

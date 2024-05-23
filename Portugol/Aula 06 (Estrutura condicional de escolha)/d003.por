programa 
{

  funcao inicio() 
  {
    
    cadeia opcao

    escreva("Seja bem vindo a maquina de consulta de preços.")
    escreva("\n")
    escreva("Aqui, você digita o nome de um produto e eu te digo quanto ele vai custar")
    escreva("\n")
    escreva("\n")

    escreva("Estes são nossos produtos disponíveis:")
    escreva("\n")
    escreva("azeite, detergente, bolacha, prato, almofada, camiseta, chocolate")
    escreva("\n")
    escreva("\n")

    escreva("Qual dos prdutos você quer saber o preço? ")
    leia(opcao)

    escolha(opcao) 
    {

      caso "azeite":

      escreva("O valor do ", opcao, " é R$20")

      pare

      caso "detergente":

      escreva("O valor do ", opcao, " é R$3")

      pare

      caso "bolacha":

      escreva("O valor do ", opcao, " é R$7")

      pare

      caso "prato":

      escreva("O valor do ", opcao, " é R$15")

      pare

      caso "almofada":

      escreva("O valor do ", opcao, " é R$12")

      pare

      caso "camiseta":

      escreva("O valor do ", opcao, " é R$30")

      pare

      caso "chocolate":

      escreva("O valor do ", opcao, " é R$5")

      pare

      caso contrario:
      
      escreva("Vc digitou uma opção inválida!")

      pare

    }

  }

}

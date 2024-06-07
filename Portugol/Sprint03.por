programa 
{

  funcao inicio() 
  {
    
    inteiro c, l, b, u, opcao

    c = 10
    l = 7
    b = 8
    
    escreva("Olá, seja bem vindo ao programa de contabilizador de estoque de material escolar do ENIAC")
    escreva("\n")
    escreva("Toda vez que você guardar ou retirar um item do estoque, marque a opção correspondente.")
    escreva("\n")
    escreva("Atualmente, temos 10 cadernos, 7 lápis e 8 borrachas.")
    escreva("\n")
    escreva("Eis as suas opções:")
    escreva("\n")
    escreva("\n")

    escreva("1. Vou guardar uma ou mais unidades")
    escreva("\n")
    escreva("2. Vou retirar uma ou mais unidades.")
    escreva("\n")
    escreva("3. Nada")
    escreva("\n")
    escreva("\n")
    
    
    faca
    {
    escreva("O que você vai fazer com os cadernos? ")
    leia(opcao)
    escolha(opcao)
    {
      caso 1:
      escreva("Quantas unidades você deseja guardar? ")
      leia(u)
      c += u
      escreva("\n")
      escreva("Armazenado! 👍")
      escreva("\n")
      pare

      caso 2:
      escreva("Quantas unidades você deseja retirar? ")
      leia(u)
      se(u>c)
      {
        escreva("\n")
        escreva("ERRO, a quantidade maxima para retirar é: ", c)
      }
      senao
      {
      c -= u
      escreva("\n")
      escreva("Retirado! 👍")

      }
      escreva("\n")
      pare

    }

    se (opcao == 3)
      {
        pare 
      }
      
    se (opcao > 3 ou opcao < 1)
      {
      escreva("ERRO!!!!! você escolheu uma opçao inválida")
      escreva("\n")
      }
    
    escreva("Vou lhe mostrar as opções novamente:")
    escreva("\n")
    escreva("\n")
    escreva("1. Vou guardar uma ou mais unidades")
    escreva("\n")
    escreva("2. Vou retirar uma ou mais unidades.")
    escreva("\n")
    escreva("3. Nada")
    escreva("\n")
    escreva("\n")
    
    }
    enquanto (opcao != 3)
    opcao = 0
    faca
    {
    escreva("O que você vai fazer com os lápis? ")
    leia(opcao)

    escolha(opcao)
    {
      caso 1:
      escreva("Quantas unidades você deseja guardar? ")
      leia(u)
      l += u
      escreva("\n")
      escreva("Armazenado! 👍")
      escreva("\n")
      pare

      caso 2:
      escreva("Quantas unidades você deseja retirar? ")
      leia(u)
      se(u>l)
      {
        escreva("\n")
        escreva("ERRO, a quantidade maxima para retirar é: ", l)
      }
      senao
      {
      l -= u
      escreva("\n")
      escreva("Retirado! 👍")
      }
      escreva("\n")
      pare
    
    }

    se (opcao == 3)
      {
        pare 
      }

    se (opcao > 3 ou opcao < 1)
      {
      escreva("ERRO!!!!! você escolheu uma opçao inválida")
      escreva("\n")
      }

    escreva("Vou lhe mostrar as opções novamente:")
    escreva("\n")
    escreva("\n")
    escreva("1. Vou guardar uma ou mais unidades")
    escreva("\n")
    escreva("2. Vou retirar uma ou mais unidades.")
    escreva("\n")
    escreva("3. Nada")
    escreva("\n")
    escreva("\n")
    
    }
    enquanto (opcao!=3)

    opcao = 0

    faca
    {
    escreva("O que você vai fazer com os borrachas? ")
    leia(opcao)

    escolha(opcao)
    {
      caso 1:
      escreva("Quantas unidades você deseja guardar? ")
      leia(u)
      b += u
      escreva("\n")
      escreva("Armazenado! 👍")
      escreva("\n")
      pare

      caso 2:
      escreva("Quantas unidades você deseja retirar? ")
      leia(u)
      se(b>l)
      {
        escreva("\n")
        escreva("ERRO, a quantidade maxima para retirar é: ", b)
      }
      senao
      {
      b -= u
      escreva("\n")
      escreva("Retirado! 👍")
      escreva("\n")
      }
      escreva("\n")
      pare
    
    }
    
    se (opcao == 3)
      {
        pare 
      }

    se (opcao > 3 ou opcao < 1)
      {
      escreva("ERRO!!!!! você escolheu uma opçao inválida")
      escreva("\n")
      }

    escreva("Vou lhe mostrar as opções novamente:")
    escreva("\n")
    escreva("\n")
    escreva("1. Vou guardar uma ou mais unidades")
    escreva("\n")
    escreva("2. Vou retirar uma ou mais unidades.")
    escreva("\n")
    escreva("3. Nada")
    escreva("\n")
    escreva("\n")
    
    } 
    enquanto (opcao!=3)

    escreva("\n")
    escreva("\n")
    escreva("Temos agora em nosso estoque: ")
    escreva("\n")
    escreva("\n")
    escreva(c, " Cadernos.")
    escreva("\n")
    escreva(l, " Lápis.")
    escreva("\n")
    escreva(b, " Borrachas.")
    
  }

}

programa 
{
  funcao inicio() // F(n) = F(n-1) + F(n-2)
  {
    
    real seq, f, n, c, temp

    f = 0
    c = 0
    n = 1
    temp = 0

    escreva("Quantos números da sequência de Fibonacci você gostaria de ver na tela? ")
    leia(seq) 
    escreva("\n") 

    faca {
      
      escreva(f)
      escreva("\n")
      temp = f
      f = n
      n += temp
      c ++
      
    }

    enquanto(c < seq)

  }

}

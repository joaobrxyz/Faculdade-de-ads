# Converte um valor em dólares para reais, para isso, peça ao usuário o valor em dólares e a cotação do dólar, calcule e mostre o valor em Reais.

valor_dolar = float(input("Digite o valor em dólar: "))
cotacao = float(input("Digite a cotação de dólar para reais: "))
valor_real = valor_dolar * cotacao
print(f'O valor ${valor_dolar:.2f} em dólares é R%{valor_real:.2f} em reais.')

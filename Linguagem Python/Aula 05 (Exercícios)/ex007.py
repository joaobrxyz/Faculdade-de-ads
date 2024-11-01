# Criar um programa que converta uma temperatura entre Celsius e Fahrenheit, para isso, solicite ao usuário que informe a temperatura e escolha a unidade de entrada ( 'C' para Celsius ou 'F' para Fahrenheit ) 
# se a entrada for em Celsius, converter para Fahrenheit usando a fórmula  F = c * 9/5 + 32
# se a entrada for Fahrenheit , converter para Celsius com a fórmula C = ( F - 32 ) * 5/9

temp = float(input("Digite a temperatura: "))
u = input("Digite a unidade de entrada (c = celsius) (f = fahrenheit:) ")

if u == 'c':
    f = temp * 9/5 + 32
    print(f"A temperatura é {temp:.2f} graus em celsius, e {f:.2f} graus em farenheit")
elif u == 'f':
    c = ( temp - 32 ) * 5/9
    print(f"A temperatura é {temp:.2f} graus em farenheit, e {c:.2f} graus em celsius")
else:
    print("Vc digitou uma unidade inválida! Digite apenas 'c' ou 'f'.")
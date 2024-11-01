# Criar um programa que receba dois números inteiros e uma operaç~´ao aritmética (+, -, /, *) e realize o cálculo solicitado.

n1 = int(input("Digite o primeiro número: "))
op = input("Digite a operação (+, -, /, *): ")
n2 = int(input("Digite o segundo número: "))

if op == "+":
    res = n1 + n2
elif op == "-":
    res = n1 - n2
elif op == "/":
    res = n1 / n2
elif op == "*":
    res = n1 * n2
else:
    print("Vc digitou uma operação inválida!")
    res = 'erro'

if res != 'erro':
    print(f'{n1} {op} {n2} = {res}')
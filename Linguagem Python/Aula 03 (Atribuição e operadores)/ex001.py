n1 = 20
n2 = 3

res = n1 + n2 
print(f'{n1} + {n2} = {res}')

res = n1 - n2 
print(f'{n1} - {n2} = {res}')

res = n1 * n2 
print(f'{n1} x {n2} = {res}')

res = n1 / n2 
print(f'{n1} ÷ {n2} = {res:.2f}') # O trecho ':.2f' é para formatar com 2 casas decimais

res = n1 // n2 
print(f'{n1} // {n2} = {res}') # Número inteiro na divisão

res = n1 % n2 
print(f'{n1} % {n2} = {res}') # Resto da divisão

res = n1 ** n2 
print(f'{n1} ** {n2} = {res}') # Potência

# n1 = n1 + 10
n1 += 10
print(f'n1 = {n1}')
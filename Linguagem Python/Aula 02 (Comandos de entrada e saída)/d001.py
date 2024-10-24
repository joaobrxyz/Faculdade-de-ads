# Criar um programa que receba o raio de um círculo do usuário,
# calcule e mostre na tela a área do círculo.

raio = float(input("Digite o raio do círculo: "))
area = 3.1415 * raio ** 2

print('A área do círculo é: ', area)
print('A área do círculo é: {}'.format(area))
print(f'A área do círculo é: {area:.2f}')
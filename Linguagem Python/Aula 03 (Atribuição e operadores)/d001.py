# Criar um programa para calcular o IMC, onde os valores 'Massa' e 'Altura' serão digitados pelo usuário.

peso = float(input('Digite seu peso: '))
altura = float(input('Digite sua altura: '))

imc = peso / (altura ** 2)

print(f'O seu IMC é: {imc:.2f}')
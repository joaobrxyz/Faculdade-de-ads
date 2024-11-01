# Calcule o IMC de uma pessoa e classifique o resultado conforme abaixo:
# Abaixo de 18.5:  Abaixo do peso
# Entre 18.5 e 24.9: Peso Normal
# Entre 25 e 29.9: Sobrepeso
# 30 ou mais: Obesidade
# Lembrete:  IMC = peso / ( altura ** 2 )

peso = float(input("Digite seu peso (em kg): "))
altura = float(input("Digite sua altura (em metros): "))
imc = peso / (altura ** 2)

if imc < 18.5:
    print(f"Seu IMC é de {imc:.2f}, você está abaixo do peso ideal.")
elif imc <= 24.9:
    print(f"Seu IMC é de {imc:.2f}, você está no peso ideal.")
elif imc <= 29.9:
    print(f"Seu IMC é de {imc:.2f}, você está com sobrepeso.")
else: 
    print(f"Seu IMC é de {imc:.2f}, você está com obesidade.")

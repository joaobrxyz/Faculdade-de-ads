# Calcule a multa baseada na velocidade de um veículo. O usuário deve digitar a velocidade do veículo e ao final do programa, mostra o valor da multa, caso tenha ultrapassado o limite.
# se a velocidade for até 80Km/h, informe "Dentro do limite"
# se ultrapassar 80km/h, aplique uma multa de R$15,00 para cada Km acima do limite de velocidade

vel = float(input("Digite a velocidade do carro (em Km/h): "))

if vel <= 80:
    print("A velocidade está dentro do limite.")
else:
    multa = 15 * (vel - 80)
    print("Você ultrapassou o limite de velocidade!")
    print(f"Uma multa de R${multa:.2f} por andar a {vel:.2f}Km/h")

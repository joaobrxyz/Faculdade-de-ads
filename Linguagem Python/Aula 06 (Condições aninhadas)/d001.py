# Escreva um programa que receba a idade de uma pessoa e verifique:
# a) Se tem idade para votar ( >= 16 )
# b) Se tem direito a voto obrigatório (entre 18 e 70 anos) ou voto facultativo (16-17 ou acima de 70)

idade = int(input("Digite sua idade: "))

if idade >= 16:
    if idade < 18 or idade > 70:
        print("Voto facultativo!")
    else:
        print("Voto obrigatório!")
else:
    print("Não tem idade pra votar!")

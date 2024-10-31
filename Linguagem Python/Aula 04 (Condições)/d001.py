# Escreva um programa que solicite ao usuário três notas e calcule a média. Em seguida, exiba se o aluno está 'aprovado', 'recuperação' ou 'reprovado', usando o seguinte critério:
# Aprovado --> média >= 7
# em recuperação --> média entre 5 e 7
# Reprovado --> média < 5

n1 = float(input("Digite a primeira nota: "))
n2 = float(input("Digite a segunda nota: "))
n3 = float(input("Digite a terceira nota: "))
media = (n1+n2+n3) / 3

if media >= 7:
    print(f'APROVADO com a média de {media:.2f}')
elif media >= 5:
    print(f'EM RECUPERAÇÃO com a média de {media:.2f}')
else:
    print(f'REPROVADO com a média de {media:.2f}')

def exibir_mensagem():
    print("Bom dia!")

def exibir_mensagem_nome(nome):
    print(f"Bom dia, {nome}. Seja bem vindo(a)")

def soma(a, b):
    return a + b

exibir_mensagem()
exibir_mensagem_nome("João")

n1 = int(input("Valor 1: "))
n2 = int(input("Valor 2: "))

print(soma(n1, n2))
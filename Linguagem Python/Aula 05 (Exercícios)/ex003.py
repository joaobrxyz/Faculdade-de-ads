# Calcule o  preço de um produto após um desconto baseado no valor de compra. Peça ao usuário o valor do produto e aplique o desconto de acordo com as faixas abaixo e ao final mostre o valor do produto(sem desconto) e o valor do produto (com desconto):
# se o valor for até 100, aplique 5% de desconto
# se o valor estiver entre 100 e 200, aplique o desconto de 10%
# se o valor for acima de 200, aplique 15% de desconto

vp = float(input('Digite o valor do produto: R$'))
desc = 0

if vp <= 100:
    desc = 5
elif vp <= 200:
    desc = 10
else:
    desc = 15
res = vp - (vp * desc / 100)
print(f'O valor do produto sem o desconto é R${vp:.2f} \nCom o desconto de {desc}% é R${res:.2f}')
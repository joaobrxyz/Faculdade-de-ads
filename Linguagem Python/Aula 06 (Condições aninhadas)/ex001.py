idade = 17
if idade < 18:
    print("Menor de idade")
    if idade <= 12:
        print("Categoria: Criança")
    else:
        print("Categoria: Adolescente")
else:
    print("Maior de idade")
    if idade >= 60:
        print('Desconto de idoso')

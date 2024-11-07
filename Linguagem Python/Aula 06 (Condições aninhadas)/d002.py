# Crie um programa que receba um nome de usuário e uma senha. Se o nome de usuário for "admin" e a senha for "123456" :
# --> Exiba "Login bem-sucedido"
# --> Receba do usuário o nível de acesso e verifique:
# --> Se for "admin", exiba "Acesso total", caso contrário, exiba "Acesso limitado"

user = input("Digite o nome de usuário: ")
senha = input("Digite a senha: ")

if user == "admin" and senha == "123456":
    print("Login bem-sucedido")
    nivel_acesso = input("Digite o nível de acesso: ")
    if nivel_acesso == "admin":
        print("Acesso total!")
    else:
        print("Acesso limitado!")
else:
    print("Usuário e/ou senha incorretos!")

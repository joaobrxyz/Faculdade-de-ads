// Criar uma lista de notas e mostre as notas na tela

var notas:number[] = [7.0, 8.4, 4.9, 7.5] ; 

for (let item in notas) {
    console.log("Matéria " + (item) + ": " + notas[item])
}
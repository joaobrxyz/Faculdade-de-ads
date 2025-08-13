var curso = "Sistema de Informação";
var idade = 21;
var salario = 12789.46;
var numBinario = 21;
var numOctal = 501;
var numHex = 0xFF;
console.log("Número Binário: " + numBinario);
console.log("Número Hexadecimal: " + numHex);
console.log("Número Octal: " + numOctal);
var lista = [3, 7, 2, 10, 2];
var lista2 = [1, 6, 5, 4];
console.log(lista);
console.log(lista[0]);
// Tupla
var alunos;
alunos = ['Ana', 212232025, 'ADS'];
console.log(alunos[0]);
var tudoCerto = true;
var coisa = "texto";
coisa = true;
coisa = 23;
// loop
for (var item in lista) {
    console.log("Chave: " + item);
}
for (var _i = 0, lista_1 = lista; _i < lista_1.length; _i++) {
    var item = lista_1[_i];
    console.log("Valor: " + item);
}

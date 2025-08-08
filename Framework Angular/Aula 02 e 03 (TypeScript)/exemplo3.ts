var curso:string = "Sistema de Informação" ;

var idade:number = 21 ;
var salario:number = 12789.46 ;

var numBinario:number = 0b010101 ;
var numOctal:number = 0o765 ;
var numHex:number = 0xFF ;

console.log("Número Binário: " + numBinario) ;
console.log("Número Hexadecimal: " + numHex) ;
console.log("Número Octal: " + numOctal) ;

var lista:number[] = [3, 7, 2, 10, 2] ;
var lista2:Array<number> = [1, 6, 5, 4] ;

console.log(lista) ;
console.log(lista[0]) ;

// Tupla
var alunos:[string, number, string];
alunos = ['Ana', 212232025, 'ADS'] ;
console.log(alunos[0]) ;

var tudoCerto:boolean = true ;

var coisa:any = "texto" ;
coisa = true ;
coisa = 23 ;

// loop

// Loop para pegar a Chave/posição
for (let item in lista) {
    console.log("Chave: " + item) ;
}

// Loop para pegar o valor
for (let item of lista) {
    console.log("Valor: " + item) ;
}
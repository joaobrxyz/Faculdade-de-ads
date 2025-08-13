var pessoa = /** @class */ (function () {
    // Construtor da classe
    function pessoa(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
    pessoa.prototype.mostrarDados = function () {
        console.log("Nome: ".concat(this.nome));
        console.log("Idade: ".concat(this.idade));
    };
    return pessoa;
}());
var natalia = new pessoa("Natália Silva", 21);
natalia.mostrarDados();

// Crie um sistema simples de produtos. Cada produto deve ter um nome, um código de identificação númerico e um preço.
// O sistema deve permitir que o usuário insira esses valores e, em seguida, exiba as informações do produto cadastrado.
var Produto = /** @class */ (function () {
    function Produto(nome, codigo, preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }
    Produto.prototype.exibirProduto = function () {
        console.log("Nome do produto cadastrado: ".concat(this.nome));
        console.log("C\u00F3digo do produto cadastrado: ".concat(this.codigo));
        console.log("Pre\u00E7o do produto cadastrado: ".concat(this.preco, "\n"));
    };
    return Produto;
}());
console.log("Cadastro de produto");
console.log("**********************");
var produto1 = new Produto("Celular", 56048, 4016.48);
produto1.exibirProduto();
var produto2 = new Produto("Relógio", 34812, 1016.39);
produto2.exibirProduto();
var produto3 = new Produto("Tênis", 46821, 649.99);
produto3.exibirProduto();

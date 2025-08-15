// Crie um sistema simples de produtos. Cada produto deve ter um nome, um código de identificação númerico e um preço.
// O sistema deve permitir que o usuário insira esses valores e, em seguida, exiba as informações do produto cadastrado.

class Produto {
    nome:string;
    codigo:number;
    preco:number

    constructor(nome:string, codigo:number, preco:number) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    exibirProduto() {
        console.log(`Nome do produto cadastrado: ${this.nome}`)
        console.log(`Código do produto cadastrado: ${this.codigo}`)
        console.log(`Preço do produto cadastrado: ${this.preco}\n`)

    }
}

console.log("Cadastro de produto")
console.log("**********************")

let produto1:Produto = new Produto("Celular", 56048, 4016.48);
produto1.exibirProduto();


let produto2:Produto = new Produto("Relógio", 34812, 1016.39);
produto2.exibirProduto();

let produto3:Produto = new Produto("Tênis", 46821, 649.99);
produto3.exibirProduto();
 
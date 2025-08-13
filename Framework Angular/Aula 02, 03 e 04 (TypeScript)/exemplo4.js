var n1 = 10;
var n2 = valor();
mostrarMensagem("Exemplo de uso de fun\u00E7\u00E3o: ".concat(n2));
mostrarMensagem();
var media = calcularMedia(5.5, 7.8);
mostrarMensagem("".concat(media));
function valor() {
    return 40;
}
function mostrarMensagem(mensagem) {
    if (mensagem === void 0) { mensagem = null; }
    console.log(mensagem);
}
function calcularMedia(n1, n2) {
    return (n1 + n2) / 2;
}

var n1:number = 10;
var n2:number = valor();

mostrarMensagem(`Exemplo de uso de função: ${n2}`);
mostrarMensagem()

var media:number = calcularMedia(5.5, 7.8) ;
mostrarMensagem(`${media}`);

function valor():number {
    return 40;
}

function mostrarMensagem(mensagem:string = null):void {
    console.log(mensagem);
}

function calcularMedia(n1:number , n2:number):number {
    return (n1+n2) / 2;
}
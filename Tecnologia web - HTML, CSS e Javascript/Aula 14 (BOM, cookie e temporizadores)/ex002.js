let nome = navigator.appName
let versao = navigator.appVersion

document.write(`Nome do navegador: ${nome}<br>`)
document.write(`Versão do navegador: ${versao}`)

let tela = window.open("https://www.eniac.edu.br/", '_blank', 'width=800, height=600')

setTimeout(()=>{
    tela.close()
},5000)

setInterval( ()=>{
    document.write("Oi turma<br>")
}, 2000)
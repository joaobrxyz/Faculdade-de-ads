function verificar(){
    let ok = true
    const txtnome = document.querySelector("#txtnome")
    const txtidade = document.querySelector("#txtidade")
    const txtemail = document.querySelector("#txtemail")
    const erroNome = document.querySelector("#erronome")
    const erroIdade = document.querySelector("#erroidade")
    const erroEmail = document.querySelector("#erroemail")
    if(txtnome.value.length == 0){
        erroNome.innerHTML = "Preencha o campo nome"
        txtnome.style.backgroundColor = 'yellow'
        ok = false
    } else {
        erroNome.innerHTML = ""
        txtnome.style.backgroundColor = ''
        ok = true
    }
    if(txtidade.value.length == 0){
        erroIdade.innerHTML = "Preencha o campo idade"
        txtidade.style.backgroundColor = 'yellow'
        ok = false
    } else {
        erroIdade.innerHTML = ""
        txtidade.style.backgroundColor = ''
        ok = true
    }
    if(txtemail.value.length == 0){
        erroEmail.innerHTML = "Preencha o campo email"
        txtemail.style.backgroundColor = 'yellow'
        ok = false
    } else {
        erroEmail.innerHTML = ""
        txtemail.style.backgroundColor = ''
        ok = true
    }
    if(ok == true){
        document.form1.submit()
    }
}
function inicia(){
    if(document.getElementById("botao").innerHTML == "Desligado"){
        document.getElementById("botao").innerHTML = "Ligado"
        document.getElementById("botao").style.backgroundColor = "#008000"
    } else{
        document.getElementById("botao").innerHTML = "Desligado"
        document.getElementById("botao").style.backgroundColor = "#ff0000"
    }
}
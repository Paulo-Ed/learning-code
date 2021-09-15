function media(){
    let nome = document.getElementById("nome").value
    let nota1 = Number(document.getElementById("nota1").value) 
    let nota2 = Number(document.getElementById("nota2").value) 
    let nota3 = Number(document.getElementById("nota3").value) 
    let nota4 = Number(document.getElementById("nota4").value)
    let soma = nota1 + nota2 + nota3 + nota4
    let media = soma/4
    if(media > 7){
    document.getElementById("resultado").innerHTML =`Parabéns!!! ${nome} <br>
    Média: ${media} <br> APROVADO`
    document.getElementById("resultado").style.backgroundColor = "#008000"
  } else{
    document.getElementById("resultado").innerHTML =`Que Pena! ${nome} <br> Média: ${media} <br> REPROVADO`
    document.getElementById("resultado").style.backgroundColor = "#ff0000"
  }
  }
  
  
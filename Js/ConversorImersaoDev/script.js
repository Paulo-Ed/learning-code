function ConverterDolar() {
    let valor = document.getElementById("valor").value
    let valorNumerico = parseFloat(valor)
    let resultado = valorNumerico / 5
    let retornaResultado = "O Valor em Dólar é $ " + resultado
    document.getElementById("valorConvertido").innerHTML = retornaResultado
  }
  function ConverterEuro() {
    let valor = document.getElementById("valor").value
    let valorNumerico = parseFloat(valor)
    let resultado = valorNumerico / 6
    let retornaResultado = "O Valor em Euro é " + resultado.toFixed(1)
    document.getElementById("valorConvertido").innerHTML = retornaResultado
  }
  function ConverterBitcoin() {
    let valor = document.getElementById("valor").value
    let valorNumerico = parseFloat(valor)
    let bitcoin = parseFloat("24890388")
    let resultado = valorNumerico * bitcoin
    let retornaResultado = "O Valor em Bitcoin é " + resultado.toFixed(1)
    document.getElementById("valorConvertido").innerHTML = retornaResultado}
  function ConverterAnoLuz() {
    let valor = document.getElementById("valor").value
    let valorNumerico = parseFloat(valor)
    let anoLuz = parseFloat("9460800000000")
    let resultado = valorNumerico * anoLuz
    let retornaResultado = "O Valor em Km é " + resultado.toFixed(1)
    document.getElementById("valorConvertido").innerHTML = retornaResultado
  }
  function ConverterKelvin() {
    let valor = document.getElementById("valor").value
    let valorNumerico = parseFloat(valor)
    let resultado = valorNumerico + 273
    let retornaResultado = "O Valor em Kelvin é " + resultado.toFixed(1) + " K"
    document.getElementById("valorConvertido").innerHTML = retornaResultado
  }
  function ConverterFahrenheit() {
    let valor = document.getElementById("valor").value
    let valorNumerico = parseFloat(valor)
    let resultado = ((valorNumerico * 9) / 5) + 32
    let retornaResultado = "O Valor em Fahrenheit é " + resultado.toFixed(1) + " °F"
    document.getElementById("valorConvertido").innerHTML = retornaResultado
  }
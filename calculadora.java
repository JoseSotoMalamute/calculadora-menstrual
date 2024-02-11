function calcular() {
  var ultimoPeriodo = new Date(document.getElementById("ultimoPeriodo").value);
  var duracionCiclo = parseInt(document.getElementById("duracionCiclo").value);
  
  var proximoPeriodo = new Date(ultimoPeriodo.getTime());
  proximoPeriodo.setDate(proximoPeriodo.getDate() + duracionCiclo);
  
  document.getElementById("resultado").innerHTML = "La fecha estimada para tu próximo periodo es: " + proximoPeriodo.toLocaleDateString();
}


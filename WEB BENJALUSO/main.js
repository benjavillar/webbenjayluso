"use strict"
// escuchamos el SUBMIT del form
let form = document.querySelector('#form');
form.addEventListener('submit', agregar);

function agregar(e) {
   e.preventDefault();

   let formData = new FormData(form);

   let nombre = formData.get('nombre');
   let email = formData.get('email');
   let password = formData.get('contrasenia');

   console.log(nombre, email, password);
}

let btnenviar = document.getElementById("btn-enviar");
btnenviar.addEventListener("click", verificarformulario, false);

function generarcatcha() {
   let captchanuevo = Math.floor((100000) * Math.random());
   let captchavalue = document.getElementById("captchavalue")
   captchavalue.innerHTML = captchanuevo;
}

function verificarformulario() {
   let captchavalue = document.getElementById("captchavalue");
   let respuestausuario = document.getElementById("respuestausuario");
   let resultadoform = document.getElementById("resultadoform");
   if (respuestausuario.value == captchavalue.innerHTML) {
      let valido = "Su cuenta ha sido registrada con exito";
      resultadoform.innerHTML = valido;
   }
   else {

     
      resultadoform.innerHTML = "Su respuesta no coincide con el captcha";
   }
}


generarcatcha();
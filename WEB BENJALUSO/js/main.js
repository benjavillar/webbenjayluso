"use sctrict";
let form = document.querySelector('#form');
form.addEventListener('sumbit', agregar);

function agregar(e){
    e.preventDefault();
    console.log("entre a la funcion");
}



//CAPTCHA
let btnenviar = document.getElementById("btn-enviar");
btnenviar.addEventListener("click", verificarformulario, false);

function generarcatcha(){
    let captchanuevo = Math.floor((10000) * Math.random()); 
    let captchavalue = document.getElementById("captchavalue")
    captchavalue.innerHTML = captchanuevo;
}

function verificarformulario(){
    let captchavalue = document.getElementById("captchavalue");
    let respuestausuario = document.getElementById("respuestausuario");
    let resultadoform = document.getElementById("resultadoform");
    if(respuestausuario.value == captchavalue.innerHTML){
        let valido = "Su cuenta ha sido registrada con exito";
        resultadoform.innerHTML = valido;
    }
    else{

        let novalido = "Su respuesta no coincide con el captcha";
        resultadoform.innerHTML = novalido;
    }
}

generarcatcha();
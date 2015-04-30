function clean(control){
    control.value = '';
}
function Password(pass){
    if(pass.value.length < 12){
        alert('Password need 12 characters!');
    }
}
//funcion para validar los datos del campo si son correctos
function Validate(){
    if (document.getElementById('name').value === ''){
        alert('Faltan datos');
    }else if(document.getElementById('pass').value === ''){
        alert('Faltan datos');
    }else if (document.getElementById('pass').value.length < 6){
        alert('Su contraseña debe tener 6 o más caracteres');
    }else(alert('Se ha validado correctamente.'));
}
//Funcion en caso de que el campo este a null.
function nullField (elemento){
    if (elemento.value==='') {
        elemento.value='Not valid user!!';
        elemento.style.color="red";
        alert('This field is required');
        document.getElementById('alname').innerHTML =
                '<img width="16px" height="16px" src="http://www.radiation-watch.co.uk/rad_left.png">';
    }else{
        alert('Well Done!! ;)');
        elemento.style.color="black";
        document.getElementById('alname').innerHTML =
                '<img width="16px" height="16px" src="http://wiki.metin2.co.uk/images/2/29/Tick.png">';
    }
}
var array = new Array();
var local;


function Clean(control) {
    control.value = '';
}
function validar() {

    var nombre = document.forms["formulario"]["nombre"].value;
    var dni = document.forms["formulario"]["dni"].value;
    var apellidos = document.forms["formulario"]["apellidos"].value;
    var fechaNacimiento = document.forms["formulario"]["fechaNacimiento"].value;
    if (dni === '' || dni === null) {
        alert('Faltan el DNI');
        return false;
    }
    if (nombre === '' || nombre === null) {
        alert('Faltan el nombre');
        return false;
    }
    if (apellidos === '' || apellidos === null) {
        alert('Faltan los apellidos');
        return false;
    }
    re = /^\d{1,2}\/\d{1,2}\/\d{4}$/;

   

    var cliente = new Cliente(dni, nombre, apellidos, fechaNacimiento);
    if (typeof (Storage) !== "undefined")
    {

        localStorage.setItem(dni, JSON.stringify(cliente));

    }
    else
    {
        // No es soportado el Web Storage
    }
    
    document.location = "index.html";
}
function validar2() {

    var nombre = document.forms["formulario"]["nombre"].value;
    var dni = document.forms["formulario"]["dni"].value;
    var apellidos = document.forms["formulario"]["apellidos"].value;
    var fechaNacimiento = document.forms["formulario"]["fechaNacimiento"].value;
    if (dni === '' || dni === null) {
        alert('Faltan el DNI');
        return false;
    }
    if (nombre === '' || nombre === null) {
        alert('Faltan el nombre');
        return false;
    }
    if (apellidos === '' || apellidos === null) {
        alert('Faltan los apellidos');
        return false;
    }
    re = /^\d{1,2}\/\d{1,2}\/\d{4}$/;

   

    var cliente = new Cliente(dni, nombre, apellidos, fechaNacimiento);
    if (typeof (Storage) !== "undefined")
    {

        localStorage.setItem(dni, JSON.stringify(cliente));

    }
    else
    {
        // No es soportado el Web Storage
    }
    document.location = "modificar.html";
}
function deserializar() {

    if (typeof (Storage) !== "undefined")
    {
        for (var i = 0; i < localStorage.length; i++) {
            var cliente = JSON.parse(localStorage[localStorage.key(i)]);
            var cliente = new Cliente(cliente.dni, cliente.nombre, cliente.apellidos, cliente.fechaNacimiento);
            array.push(cliente);
        }
    }

    else
    {

    }

}


function mostrar() {
    deserializar();
    var tabla;
    // var i;


    tabla = "<table border='black 2px solid'>";
    tabla += "<tr><th bgcolor='cyan'>DNI</th>";
    tabla += "<th bgcolor='cyan'>Nombre</th>";
    tabla += "<th bgcolor='cyan'>Apellido</th>";
    tabla += "<th bgcolor='cyan'>Fecha Nacimiento</th>";
    tabla += "<th bgcolor='cyan'>Modificar</th>";
    tabla += "<th bgcolor='cyan'>Borrar</th>";

    for (var i = 0; i < array.length; i++) {
        tabla += "<tr><td width='100px' height='20px' bgcolor='white'  align='center'>" + array[i].dni + "</td>";
        tabla += "<td width='200px' height='25px' bgcolor='white' align='center'>" + array[i].nombre + "</td>";
        tabla += "<td width='300px' height='25px' bgcolor='white' align='center'>" + array[i].apellidos + "</td>";
        tabla += "<td width='200px' height='25px' bgcolor='white' align='center'>" + array[i].fechaNacimiento + "</td>";
        tabla += '<td bgcolor="white" align="center"><a href= "modificar.html"><img src="http://www.ngncloud.com/wp-content/uploads/2011/04/engranaje.png" width="20px" height="20px"/></a></td>';
        tabla += '<td bgcolor="white" align="center"><a href= "borrar.html"><img src="http://ubuntux.info/wp-content/uploads/2011/01/papelera.png" width="20px" height="20px"/></a></td></tr>';
    }
    tabla += '</table>';
    document.getElementById('unCliente').innerHTML = tabla;
}
function Cliente(dni, nombre, apellidos, fechaNacimiento) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fechaNacimiento = fechaNacimiento;
}

function vaciarto() {
    localStorage.clear();
}
function coger() {
    local = document.getElementById('loc').value;
    valor = localStorage.getItem(local);
    alert(valor);
}
function borrar() {
    localStorage.removeItem(local);
    esbartular();
}
function esbartular() {
    document.location = "borrar.html";
}
function buscarCliente() {
    var dnibus = document.getElementById('dnibuscar').value;
    var cliente = JSON.parse(localStorage[dnibus]);

    document.getElementById('dni').value = cliente.dni;
    document.getElementById('nombre').value = cliente.nombre;
    document.getElementById('apellidos').value = cliente.apellidos;
    document.getElementById('fechaNacimiento').value = cliente.fechaNacimiento;
}
//function validarFormatoFecha(fechaNacimiento) {
//	var RegExPattern = /^\d{1,2}\/\d{1,2}\/\d{2,4}$/;
//	if ((fechaNacimiento.match(RegExPattern)) && (fechaNacimiento!='')) {
//                alert('Buen trabajo');
//		return true;
//	} else {
//		return false;
//                alert('Error de Fecha');
//	}
//}
//<![CDATA[
var blimgcursor=["http://lh3.googleusercontent.com/-UDRR9IyEP4o/UJ_8419wTlI/AAAAAAAABaw/ktNmUdcM5v4/s800/tux-icon.png", , ]
var blimgespacio=[12,12]
var blimgcursor_cuant=0

if (document.getElementById || document.all)
document.write('<div id="blimgcursorid" style="position:absolute;visibility:visible;left:0px;top:100px;width:1px;height:1px;z-index:1;"><img border="0" src="'+blimgcursor[0]+'"></div>')
function blimgcur_activo(){
if (document.getElementById)
return document.getElementById("blimgcursorid").style
else if (document.all)
return document.all.trailimagid.style
}
function blcentro(){
return (!window.opera && document.compatMode && document.compatMode!="BackCompat")? document.documentElement : document.body
}
function blinvis_img(){
blimgcur_activo().visibility="hidden"
document.onmousemove=""
}
function blimg_curseg(e){
var xcoord=blimgespacio[0]
var ycoord=blimgespacio[1]
if (typeof e != "undefined"){
xcoord+=e.pageX
ycoord+=e.pageY
}
else if (typeof window.event !="undefined"){
xcoord+=blcentro().scrollLeft+event.clientX
ycoord+=blcentro().scrollTop+event.clientY
}
var docwidth=document.all? blcentro().scrollLeft+blcentro().clientWidth : pageXOffset+window.innerWidth-15
var docheight=document.all? Math.max(blcentro().scrollHeight, blcentro().clientHeight) : Math.max(document.body.offsetHeight, window.innerHeight)
if (xcoord+blimgcursor[1]+3>docwidth || ycoord+blimgcursor[2]> docheight)
blimgcur_activo().display="none"
else
blimgcur_activo().display=""
blimgcur_activo().left=xcoord+"px"
blimgcur_activo().top=ycoord+"px"
}
document.onmousemove=blimg_curseg
if (blimgcursor_cuant>0)
setTimeout("blinvis_img()", blimgcursor_cuant*1000)
//]]>
var listaClientes = new Array();
var mostrar;

function add(codCliente, nom, apell, fechaNac){
    listaClientes.push(new cliente(codCliente, nom, apell, fechaNac));
}

function listar(){
    if(listaClientes.length === 0){
        alert("no hay clientes");
    }else{
        for (var i=0; i<listaClientes.length; i++){
            document.getElementById('cuadroMostrar').style.display='block';
            mostrar = document.getElementById('mostrar').value + "\n\ " + listaClientes[i].mostrarTodo;
            document.getElementById('mostrar').value = mostrar;
        }
    }
    
} 

function eliminar(codigo){
    var eli = prompt("Desea eliminar al cliente: " + listaClientes[codigo].mostrarTodo);
    if(eli === 'si'){
        listaClientes.splice(codigo, 1);
    alert("Cliente numero: "+ codigo +" ha sido eliminado");
    }
    
}

function buscar(codigo){
    if(listaClientes[codigo] === undefined){
        alert("Esta vacio");
    }else{
            document.getElementById('cuadroMostrar').style.display='block';
            mostrar = document.getElementById('mostrar').value + "\n\ " + listaClientes[codigo].mostrarTodo;
            document.getElementById('mostrar').value = mostrar;
    }
}

function modificar(codigo, nom, apell, fechaNac){
    listaClientes.splice(codigo, 1, new cliente(codigo, nom, apell, fechaNac));
}
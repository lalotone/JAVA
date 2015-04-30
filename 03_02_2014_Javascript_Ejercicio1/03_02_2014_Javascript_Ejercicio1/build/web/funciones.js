function modificarColorDeFondo(capa){
        //var caja1 = document.getElementById("cuadro1");
        //cuadro.style.backgroundColor = "green";
        //document.bgColor = capa.style.backgroundColor;
        alert("1. Ejecutando función");    
        document.bgColor = capa.getAttribute("style").
                backgroundColor;
        capa.setAttribute("style","background-color:green;");
        //document.bgColor = caja1.style["background-color"];
        //document.bgColor = cuadro.style["background-color"];
        //cuadro.style["background-color"] = 'green';
        //[background-color]
        alert("Ejecutando función");
        }
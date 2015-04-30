function cliente(codClien, nom, apell, fechaNac){
    this.codCliente = codClien;
    this.nombre = nom;
    this.apellidos = apell;
    this.fechaNacimiento = fechaNac;
}
cliente.prototype = {//toString
    get mostrarTodo() {
        return this.codCliente + " " + this.nombre + " " + this.apellidos + " " + this.fechaNacimiento;
    },
    set modificarTodo(datos){
        var dato = datos.toString().split(' ');
        this.nombre = dato[0] || '';
        this.apellidos = dato[1] || '';
        this.fechaNacimiento = dato[3] || '';
    }
};
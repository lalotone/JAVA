/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author lalotone
 */
public class Cliente {
    //Aqui cliente se utiliza para rellenar la tabla que mas aelante se gestiona con el CLiente DAO.
    private int idCLiente;
    private String user;
    private String pass;

    public Cliente(int idCLiente, String user, String pass) {
        this.idCLiente = idCLiente;
        this.user = user;
        this.pass = pass;
    }

    public int getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(int idCLiente) {
        this.idCLiente = idCLiente;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCLiente=" + idCLiente + ", user=" + user + ", pass=" + pass + '}';
    }
    
    
}

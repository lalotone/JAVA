/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author lalotone
 */
public interface IPersonaje {
    public static int cantidadEnergia = 150;
    
    public void alimentarse();
    public void atacar();
}

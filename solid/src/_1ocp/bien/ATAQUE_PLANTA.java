/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author CltControl
 */
public abstract class ATAQUE_PLANTA extends Ataque {
    
  private Pokemon pokemon;
        
    public void ManejarAtaque(Ataque ataque){
        this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*0.70);
    }
}

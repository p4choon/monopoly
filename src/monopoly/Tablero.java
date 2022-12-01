/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoly;
import java.util.HashMap;

/**
 *
 * @author davidgp
 */
public class Tablero extends Monopoly {
    Integer [] dados;
    HashMap <Integer, Casilla> casillas = new HashMap<Integer, Casilla>();
    
    public Integer[] tirarDados() {
        
        Integer [] dados = new Integer[2]; //Se tiran tres dados

        dados[0] = (int)(Math.random()*6 + 1); //Primer dado
        dados[1] = (int)(Math.random()*6 + 1); //Segundo dado

        return dados;
    }
    
    public Boolean dadosRepes(Integer[] dados){
        Boolean repe = false;
        if (dados[0] == dados[1]){
            repe = true;
        }
        return repe;
    }
    
    
   public Tablero(){
       casillas.put( 1, new Casilla() );
   }

    
    
}

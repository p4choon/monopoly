/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoly;

/**
 *
 * @author davidgp
 */
public class InterfazGrafica extends Monopoly {
    
    public void printarTirada(Integer[] tirada){
        
        for(int i=0; i<tirada.length; i++){
            System.out.println(tirada[i]);
        }
        
    }
    
    
}

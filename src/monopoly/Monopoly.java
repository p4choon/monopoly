/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monopoly;

/**
 *
 * @author davidgp
 */
public class Monopoly{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tablero tablero = new Tablero();
        InterfazGrafica ig = new InterfazGrafica();
        Integer[] tirada = tablero.tirarDados();
        ig.printarTirada(tirada);
        
        if (tablero.dadosRepes(tirada).equals(true)){
            tirada = tablero.tirarDados();
            ig.printarTirada(tirada);
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoly;
import java.util.Scanner;

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
    
    public void printMenu(){
        
        System.out.println("1. Crear jugadores");
        System.out.println("2. Opcion 2");
        System.out.println("3. Opcion 3");
        System.out.println("4. Salir");
        
        System.out.println("Escribe una de las opciones");
        
    }
    
    public void printJugadores(){
        
        System.out.println("Has seleccionado la opcion 1");
        System.out.println("Introduce un numero de jugadores entre 2-5");
        
    }
    
    public void recogerVariables(){
        
        InterfazGrafica p = new InterfazGrafica();
        Scanner sn = new Scanner(System.in);
        
        Integer jugador;
        
        p.printJugadores();
        jugador = sn.nextInt();
        
    }
    

    
    
}

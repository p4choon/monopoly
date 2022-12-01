/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoly;

/**
 *
 * @author davidgp
 */
public class Casilla implements Describible{
    
    /* Atributos */
    private Integer idCasilla = null;
    private String tituloCasilla = "";

    /* Getters & Setters*/
    public Integer getIdCasilla() {
        return idCasilla;
    }

    public void setIdCasilla(Integer idCasilla) {
        this.idCasilla = idCasilla;
    }

    public String getTituloCasilla() {
        return tituloCasilla;
    }

    public void setTituloCasilla(String tituloCasilla) {
        this.tituloCasilla = tituloCasilla;
    }  

    /* Constructor */
    public Casilla(Integer idCasilla, String tituloCasilla, Integer movimiento){
        this.idCasilla = idCasilla;
        this.tituloCasilla = tituloCasilla;
    }

    /*Métodos*/  

    
}

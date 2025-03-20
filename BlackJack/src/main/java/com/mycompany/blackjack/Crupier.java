
package com.mycompany.blackjack;

public class Crupier extends Persona{
                    
         
    
    public Crupier() {
    }

    public Crupier(int numJugador, int puntaje) {
        super(numJugador, puntaje);
    }

    public int getNumJugador() {
        return numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
      
    public void revolver () {
        
    }
     
}

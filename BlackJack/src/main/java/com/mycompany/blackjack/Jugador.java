
package com.mycompany.blackjack;

public class Jugador extends Persona{
     
                int darValor;
    
    public Jugador() {
    }

    public Jugador(int numJugador, int puntaje) {
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
    
    public void pedirCarta () {
        
    }
    
    public void plantarse () {
        
    }
    
      
}

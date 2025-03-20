
package com.mycompany.blackjack;

public class Persona {
    
   int numJugador;
   int puntaje;

    public Persona() {
    }

    public Persona(int numJugador, int puntaje) {
        this.numJugador = numJugador;
        this.puntaje = puntaje;
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
    
    
}

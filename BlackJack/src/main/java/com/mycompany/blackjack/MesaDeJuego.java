package com.mycompany.blackjack;

public class MesaDeJuego extends Persona {
    
    int cantidadDeJugadores;

    public MesaDeJuego() {
    }

    public MesaDeJuego(int cantidadDeJugadores, int numJugador, int puntaje) {
        super(numJugador, puntaje);
        this.cantidadDeJugadores = cantidadDeJugadores;
    }

    public int getCantidadDeJugadores() {
        return cantidadDeJugadores;
    }

    public void setCantidadDeJugadores(int cantidadDeJugadores) {
        this.cantidadDeJugadores = cantidadDeJugadores;
    }
    
       public void mostrarGanador() {
        
    }
    
    public void mostrarPuntaje() {
        
    }
    
    public void asignarNumJugador() {
        
    }
}

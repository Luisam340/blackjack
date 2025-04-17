/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisa.blackjack.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luisa
 */
class MesaDeJuego {
    private Mazo mazo;
    private List<Jugador> jugadores;
    private Crupier crupier;
    
    public MesaDeJuego(int numJugadores) {
        mazo = new Mazo(numJugadores);
        jugadores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= numJugadores; i++) {
            System.out.println("Ingresa el nombre del jugador " + i + ":");
            jugadores.add(new Jugador(sc.nextLine()));
        }
        crupier = new Crupier();
    }
    
    public void jugar() {
        Scanner sc = new Scanner(System.in);
        
        for (Jugador jugador : jugadores) {
            jugador.recibirCarta(mazo.repartirCarta());
            jugador.recibirCarta(mazo.repartirCarta());
        }
        crupier.recibirCarta(mazo.repartirCarta());
        crupier.recibirCarta(mazo.repartirCarta());
        
        for (Jugador jugador : jugadores) {
            if (jugador.tieneBlackjack()) {
                System.out.println(jugador.nombre + " tiene Blackjack!");
                continue;
            }
            
            boolean sigueJugando = true;
            while (sigueJugando) {
                jugador.mostrarMano();
                System.out.println(jugador.nombre + " ¿Qué deseas hacer? (1: Pedir carta, 2: Plantarse)");
                int opcion = sc.nextInt();
                
                if (opcion == 1) {
                    jugador.recibirCarta(mazo.repartirCarta());
                    if (jugador.calcularPuntaje() > 21) {
                        System.out.println("¡Te pasaste de 21! Pierdes.");
                        sigueJugando = false;
                    }
                } else {
                    sigueJugando = false;
                }
            }
        }
        
        crupier.jugar(mazo);
        
        System.out.println("Manos finales:");
        for (Jugador jugador : jugadores) {
            jugador.mostrarMano();
        }
        crupier.mostrarMano();
        
        for (Jugador jugador : jugadores) {
            int puntajeJugador = jugador.calcularPuntaje();
            int puntajeCrupier = crupier.calcularPuntaje();
            
            if (jugador.tieneBlackjack() && !crupier.tieneBlackjack()) {
                System.out.println(jugador.nombre + " gana con Blackjack!");
            } else if (puntajeJugador > 21) {
                System.out.println(jugador.nombre + " perdió");
            } else if (puntajeCrupier > 21 || puntajeJugador > puntajeCrupier) {
                System.out.println(jugador.nombre + " ganó");
            } else if (puntajeJugador == puntajeCrupier) {
                System.out.println(jugador.nombre + " quedó empatado");
            } else {
                System.out.println(jugador.nombre + " perdió contra el crupier");
            }
        }
    }
}

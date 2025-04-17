/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisa.blackjack.blackjack;

/**
 *
 * @author Luisa
 */
class Crupier extends Jugador {
    public Crupier() {
        super("Crupier");
    }
    
    public void jugar(Mazo mazo) {
        while (calcularPuntaje() < 17) {
            recibirCarta(mazo.repartirCarta());
        }
    }
}
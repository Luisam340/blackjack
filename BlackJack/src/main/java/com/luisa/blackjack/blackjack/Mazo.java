/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.luisa.blackjack.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Luisa
 */
class Mazo {
    private List<Carta> cartas;
    
    public Mazo(int numJugadores) {
        cartas = new ArrayList<>();
        String[] palos = {"corazon", "diamante", "trebol", "pica"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] puntajes = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        
        for (int n = 0; n < numJugadores; n++) {
            for (String palo : palos) {
                for (int i = 0; i < valores.length; i++) {
                    cartas.add(new Carta(valores[i] + " de " + palo, puntajes[i]));
                }
            }
        }
        Collections.shuffle(cartas);
    }
    
    public Carta repartirCarta() {
        Carta carta = cartas.remove(0);
        return carta;
    }
}

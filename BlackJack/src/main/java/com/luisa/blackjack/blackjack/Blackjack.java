/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.luisa.blackjack.blackjack;

import java.util.Scanner;

/**
 *
 * @author Luisa
 */
public class Blackjack {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de jugadores");
        int numJugadores = teclado.nextInt();
        teclado.nextLine();
        MesaDeJuego mesa = new MesaDeJuego(numJugadores);
        mesa.jugar();
    }
}

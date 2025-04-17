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
class Jugador {
    protected String nombre;
    protected List<Carta> mano;
    protected Scanner teclado = new Scanner(System.in);
    
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
    }
    
    public void recibirCarta(Carta carta) {
        if (carta.getValor() == 11) {
            System.out.println(nombre + " desea que su 'A' valga 1 u 11?");
            int valorElegido = teclado.nextInt();
            if (valorElegido == 1 || valorElegido == 11) {
                carta.setValor(valorElegido);
            } else {
                System.out.println("Opcion incorrecta su 'A' vale 11");
            }
        }
        mano.add(carta);
    }
    
    public int calcularPuntaje() {
        int total = 0;
        for (Carta c : mano) {
            total += c.getValor();
        }
        return total;
    }
    
    public boolean tieneBlackjack() {
        return mano.size() == 2 && calcularPuntaje() == 21;
    }
    
    public void mostrarMano() {
        System.out.println(nombre + " tiene:");
        for (Carta c : mano) {
            System.out.println(" - " + c.getNombre());
        }
        System.out.println("Puntaje: " + calcularPuntaje());
    }
}

package com.mycompany.blackjack;

public class Mazo {
    String llave;
    int valor;
    int cantidad;

    public Mazo() {
    }

    public Mazo(String llave, int valor, int cantidad) {
        this.llave = llave;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
   public void restarCartas () {
       
   }
}

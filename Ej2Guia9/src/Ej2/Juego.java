/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.ArrayList;

/**
 *
 * @author Andrelo
 */
public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revovler;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.revovler = new Revolver();
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevovler() {
        return revovler;
    }

    public void setRevovler(Revolver revovler) {
        this.revovler = revovler;
    }

    public void llenarJuego(ArrayList<Jugador> listaJugadores, Revolver rev) {
        this.jugadores = listaJugadores;
        this.revovler = rev;

    }

    public void ronda() {
        System.out.println(jugadores);
        int c = 1;
        boolean band = false;
        do {
            System.out.println("Ronda " + (c++));
            for (Jugador jugador : jugadores) {
                if (jugador.disparo(revovler)) {
                    System.out.println(jugador);
                    System.out.println(revovler);
                    band = true;
                    break;
                }
            }

        } while (!band);
    }
}

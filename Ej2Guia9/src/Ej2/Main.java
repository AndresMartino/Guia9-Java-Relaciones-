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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador=new Jugador();
        Revolver revolver=new Revolver();
        Juego juego=new Juego();
        ArrayList<Jugador> jugadores=new ArrayList();
        revolver.llenarRevovler();
        System.out.println(revolver);
        jugadores=jugador.jugadores();
        juego.llenarJuego(jugadores, revolver);
        juego.ronda();
        
    }
    
}

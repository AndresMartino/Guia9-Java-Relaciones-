/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public ArrayList<Jugador> jugadores(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese cantidad de jugadores");
        ArrayList<Jugador> listaJugadores=new ArrayList<>();
        int nJugadores=read.nextInt();
        if (nJugadores<1 || nJugadores>6) {
            nJugadores=6;
        }
        System.out.printf("La cantidad de jugadores es %d \n",nJugadores);
        for (int i = 0; i < nJugadores; i++) {
            this.id=i+1;
            this.nombre="Jugador "+id;
            this.mojado=false;
            
            listaJugadores.add(new Jugador(id,nombre,mojado));
        }  
        return listaJugadores;
    }
    public boolean disparo(Revolver r){
        if (r.mojar()) {
            this.mojado=true;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}

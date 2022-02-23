/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej2;

/**
 *
 * @author Andrelo
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posocionActual, int posicionAgua) {
        this.posicionActual = posocionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosocionActual() {
        return posicionActual;
    }

    public void setPosocionActual(int posocionActual) {
        this.posicionActual = posocionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public void llenarRevovler() {
        
        this.posicionActual = (int) (Math.random() * 6)+ 1;
        
        this.posicionAgua = (int) (Math.random() * 6)+ 1;

    }

    public boolean mojar() {
        if (this.posicionActual == this.posicionAgua) {
            return true;
        } else {
            siguienteChorro();
        }
        return false;
    }

    public void siguienteChorro() {
        if (this.posicionActual==6) {
            this.posicionActual=1;
        }else{
            this.posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
}

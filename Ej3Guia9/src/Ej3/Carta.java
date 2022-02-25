/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

/**
 *
 * @author andrelo
 */
public class Carta {
    private int numCarta;
    private EnumMaso palo;

    public Carta() {
    }

    public Carta(int numCarta, EnumMaso palo) {
        this.numCarta = numCarta;
        this.palo = palo;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public EnumMaso getPalo() {
        return palo;
    }

    public void setPalo(EnumMaso palo) {
        this.palo = palo;
    }

    
    @Override
    public String toString() {
        return  "numCarta=" + numCarta + ", palo=" + palo+"\n";
    }
    
    
}

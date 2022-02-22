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
    private int actualPosition;
    private int waterPosition;

    public Revolver() {
    }

    public Revolver(int actualPosition, int waterPosition) {
        this.actualPosition = actualPosition;
        this.waterPosition = waterPosition;
    }

    public int getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int actualPosition) {
        this.actualPosition = actualPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(int waterPosition) {
        this.waterPosition = waterPosition;
    }
    
    public void fillRevolver(){
        this.actualPosition=(int)Math.random()*6+1;
        this.waterPosition=(int)Math.random()*6+1;
        
    }
    
    public boolean wet(){
        if (this.actualPosition==this.waterPosition) {
            return true;
        }
        return false;
    }
    
    public void nextBlast(){
        if (wet()) {
            if (this.actualPosition==6) {
                this.actualPosition=1;
            }else{
                this.actualPosition+=this.actualPosition;
            }
        }
    
    }
}

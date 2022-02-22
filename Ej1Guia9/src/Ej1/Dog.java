/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class Dog {
    private String nameDog;
    private String race;
    private int ageDog;
    private String size;

    public Dog() {
    }

    public Dog(String nameDog, String race, int ageDog, String size) {
        this.nameDog = nameDog;
        this.race = race;
        this.ageDog = ageDog;
        this.size = size;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void setAgeDog(int ageDog) {
        this.ageDog = ageDog;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void addDog(){
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Enter name's Dog");
        this.nameDog=read.next();
        System.out.println("Enter the race of the dog");
        this.race=read.next();
        System.out.println("Enter the age of the dog");
        this.ageDog=read.nextInt();
        System.out.println("Enter the size of the dog");
        this.size=read.next();
        
    }
    
    
    @Override
    public String toString() {
        return  "nameDog=" + nameDog + ", race=" + race + ", ageDog=" + ageDog + ", size=" + size + '}';
    }
    
    
}

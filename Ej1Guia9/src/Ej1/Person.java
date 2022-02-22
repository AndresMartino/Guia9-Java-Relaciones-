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
public class Person {

    private String namePerson;
    private String surname;
    private int agePerson;
    private long docPerson;
    private Dog dog;

    public Person() {
    }

    public Person(String namePerson, String surname, int agePerson, long docPerson, Dog dog) {
        this.namePerson = namePerson;
        this.surname = surname;
        this.agePerson = agePerson;
        this.docPerson = docPerson;
        this.dog = dog;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAgePerson() {
        return agePerson;
    }

    public void setAgePerson(int agePerson) {
        this.agePerson = agePerson;
    }

    public long getDocPerson() {
        return docPerson;
    }

    public void setDocPerson(long docPerson) {
        this.docPerson = docPerson;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void addPerson() {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Enter person's name");
        this.namePerson = read.next();
        System.out.println("Enter person's surname");
        this.surname = read.next();
        System.out.println("Enter person's age");
        this.agePerson = read.nextInt();
        System.out.println("Enter person's Id");
        this.docPerson = read.nextLong();

    }

    public void relateDog(Dog dogy) {
        this.dog = dogy;

    }

    @Override
    public String toString() {
        return "Person{" + "namePerson=" + namePerson + ", surname=" + surname + ", agePerson=" + agePerson + ", docPerson=" + docPerson + ", dog=" + dog + '}';
    }
    
}

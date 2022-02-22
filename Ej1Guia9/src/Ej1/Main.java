/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author Andrelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println("First Dog");
        dog1.addDog();
        System.out.println("Second Dog");
        dog2.addDog();
        System.out.println("First Person");
        person1.addPerson();
        person1.relateDog(dog1);
        System.out.println("Seconf person");
        person2.addPerson();
        person2.relateDog(dog2);

        System.out.println(person1);
        System.out.println(person2);
    }

}

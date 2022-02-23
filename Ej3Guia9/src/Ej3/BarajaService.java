/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andrelo
 */
public class BarajaService {

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    ;
    private static Carta carta;
    private static ArrayList<Carta> maso = new ArrayList();
    private static ArrayList<Carta> masoAux = new ArrayList();

    public BarajaService() {

    }

    public static Scanner getRead() {
        return read;
    }

    public static void setRead(Scanner read) {
        BarajaService.read = read;
    }

    public static Carta getCarta() {
        return carta;
    }

    public static void setCarta(Carta carta) {
        BarajaService.carta = carta;
    }

    public static ArrayList<Carta> getMaso() {
        return maso;
    }

    public static void setMaso(ArrayList<Carta> maso) {
        BarajaService.maso = maso;
    }

    public static ArrayList<Carta> getMasoAux() {
        return masoAux;
    }

    public static void setMasoAux(ArrayList<Carta> masoAux) {
        BarajaService.masoAux = masoAux;
    }

    public void crearMaso() {
        for (int i = 0; i < 13; i++) {
            if (i > 0 && i < 8 || i > 9 && i < 13) {
                BarajaService.maso.add(new Carta(i, "Espada"));
                BarajaService.maso.add(new Carta(i, "Basto"));
                BarajaService.maso.add(new Carta(i, "Oro"));
                BarajaService.maso.add(new Carta(i, "Copa"));
            }
        }

    }

    public void barajar() {
        Collections.shuffle(BarajaService.maso);
        System.out.println("Maso mezclado");

    }

    public void siguienteCarta() {
        Iterator<Carta> iterator = BarajaService.maso.iterator();
        if (!BarajaService.maso.isEmpty()) {
            Carta retirada = iterator.next();
            System.out.println("La siguiente carta retirada es " + retirada);
            BarajaService.masoAux.add(retirada);
            iterator.remove();

        } else {
            System.out.println("No quedan mas cartas disponibles");
        }

    }

    public void darCartas(int n) {
        if (!BarajaService.maso.isEmpty()) {
            if (BarajaService.maso.size() >= n) {
                System.out.println("Las cartas sacadas son: ");
                Iterator<Carta> iterator = BarajaService.maso.iterator();
                for (int i = 0; i < n; i++) {
                    Carta retirada = iterator.next();
                    System.out.println(retirada);
                    BarajaService.masoAux.add(retirada);
                    iterator.remove();
                }
            } else {
                System.out.println("No hay suficientes cartas");
            }
        } else {
            System.out.println("Ta vacio el maso");
        }

    }

    public void cartasDisponibles() {
        System.out.printf("La cantidad de cartas disponibles es %d \n", BarajaService.maso.size());
        System.out.printf("La cantidad de cartas retiradas es %d \n", BarajaService.masoAux.size());

    }

    public void cartasMonton() {
        System.out.println("Las cartas extraidas son: ");
        System.out.println(BarajaService.masoAux);
    }

    public void mostrarBaraja() {
        System.out.println("Las cartas disponibles en el amso son:");
        System.out.println(BarajaService.maso);
    }

    public void menu() {
        int opc, n;
        boolean band = false;                                         // bandera para saber si existe o no el maso antes
        do {
            System.out.println("----MENU----");
            System.out.println("1-Crear nuevo maso de cartas");
            System.out.println("2-Barajar");
            System.out.println("3-Retirar Siguiente carta");
            System.out.println("4-Retirar varias cartas");
            System.out.println("5-Mostrar cantidad de cartas que quedan disponibles");
            System.out.println("6-Mostrar cartas extraidas");
            System.out.println("7-Mostrar baraja");
            System.out.println("8-SALIR");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    masoAux.clear();
                    crearMaso();
                    System.out.println("Maso nuevo creado;");
                    band = true;
                    break;

                case 2:
                    if (band) {
                        barajar();
                        
                    } else {
                        System.out.println("Cree un maso de cartas!");
                    }
                    break;
                case 3:
                    if (band) {
                        siguienteCarta();

                    } else {
                        System.out.println("Cree un maso de cartas!");

                    }
                    break;
                case 4:
                    if (band) {
                        System.out.println("ingrese cuantas cartas desea retirar del maso");
                        n = read.nextInt();
                        darCartas(n);
                    } else {
                        System.out.println("Cree un maso de cartas!");
                    }
                    break;
                case 5:
                    if (band) {
                        cartasDisponibles();
                    } else {
                        System.out.println("Cree un maso de cartas!");
                    }
                    break;
                case 6:
                    if (band) {
                        cartasMonton();
                    } else {
                        System.out.println("Cree un maso de cartas!");
                    }
                    break;
                case 7:
                    if (band) {
                        mostrarBaraja();
                    } else {
                        System.out.println("Cree un maso de cartas!");
                    }
                    break;
                case 8:
                    System.out.println("BYE!");
                    break;
                default:
                    System.out.println("Ingrese opcion valida");
            }
        } while (opc != 8);
    }
}
/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número
entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.*/

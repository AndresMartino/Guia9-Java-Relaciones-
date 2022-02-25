/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author andrelo
 */
public class BarajaService {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private ArrayList<Carta> maso = new ArrayList();
    private ArrayList<Carta> masoAux = new ArrayList<>();
   
    private Carta carta;

    public void crearBaraja() {
        
        for (int i = 0; i < 13; i++) {
            if (i > 0 && i < 8 || i > 9 && i < 13) {
                for (EnumMaso enum1 : EnumSet.range(EnumMaso.ESPADA, EnumMaso.COPA)) {
                   carta=new Carta(i,enum1);
                   maso.add(carta);
                }
            }
        }
        System.out.println(maso);
    }

    public void mezclarCartas() {
        System.out.println("Cartas mezcladas");
        Collections.shuffle(maso);

    }

    public void siguienteCarta() {
        if (!maso.isEmpty()) {
            Iterator<Carta> iterator = maso.iterator();
            Carta sacar = iterator.next();
            System.out.println("La carta sacada es " + sacar);
            masoAux.add(sacar);
            iterator.remove();
        } else {
            System.out.println("El maso no contiene cartas");
        }
    }

    public void darCartas(int nScar) {
        if (!maso.isEmpty()) {
            if (nScar <= maso.size()) {
                Iterator<Carta> iterator = maso.iterator();
                for (int i = 0; i < nScar; i++) {
                    Carta sacar = iterator.next();
                    System.out.println("La carta sacada es" + sacar);
                    masoAux.add(sacar);
                    iterator.remove();
                }

            } else {
                System.out.println("La cantidad que quiere sacar es mayor a la cantidad que hay en el maso");
            }
        } else {
            System.out.println("El maso esta vacio");
        }
    }

    public void cartasDisponibles() {
        System.out.printf("La cantidad de cartas restantes en el maso es %d\n", maso.size());
        System.out.printf("La cantidad de carats sacadas del maso fueron %d\n", masoAux.size());

    }

    public void cartasMonton() {
        System.out.println("Las cartas extraidas son: ");
        if (!masoAux.isEmpty()) {
            for (Carta carta : masoAux) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No se ha extraido ninguna");

        }

    }

    public void mostrarBaraja() {
        System.out.println("Las cartas en el maso son: ");
        if (!maso.isEmpty()) {
            for (Carta carta : maso) {
                System.out.println(carta);
            }
        } else {
            System.out.println("El maso esta vacio");

        }

    }

    public void menu() {
        int opc, nSacar;
        boolean band = false;
        do {
            System.out.println("------MENU-----");
            System.out.println("1-Crear Baraja");
            System.out.println("2-Mezclar cartas");
            System.out.println("3-Sacar carta");
            System.out.println("4-Repartir cartas");
            System.out.println("5-Ver cantidad de cartas disponibles en el maso");
            System.out.println("6-Ver cartas que ya salieron");
            System.out.println("7-Mostrar baraja");
            System.out.println("8-SALIR");
            System.out.print("Ingrese opcion ->");
            opc = read.nextInt();
            System.out.println();
            switch (opc) {
                case 1:
                    maso.clear();
                    masoAux.clear();
                    band = true;
                    System.out.println("Baraja creada!");
                    crearBaraja();
                    break;
                case 2:
                    if (band) {
                        mezclarCartas();
                    } else {
                        System.out.println("Cree el maso primero");
                    }

                    break;
                case 3:
                    if (band) {
                        siguienteCarta();
                    } else {

                        System.out.println("Cree el maso primero");
                    }

                    break;
                case 4:
                    if (band) {
                        System.out.println("Ingrese numero de cartas a sacar");
                        nSacar = read.nextInt();
                        darCartas(nSacar);
                    } else {
                        System.out.println("Cree el maso primero");
                    }

                    break;
                case 5:
                    if (band) {
                        cartasDisponibles();
                    } else {
                        System.out.println("Cree el maso primero");
                    }

                    break;
                case 6:
                    if (band) {
                        cartasMonton();
                    } else {
                        System.out.println("Cree el maso primero");
                    }

                    break;
                case 7:
                    if (band) {
                        mostrarBaraja();
                    } else {
                        System.out.println("Cree el maso primero");
                    }

                    break;
                case 8:
                    System.out.println("BYE!");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
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

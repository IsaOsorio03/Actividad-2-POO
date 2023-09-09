
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Resuelto_15 {
    public static void main(String[] args) {
        int PESOA, PESOB, PESOC, PESOD;
        
        System.out.println("Ingrese el peso de la esfera A: ");
        Scanner entrada1 = new Scanner(System.in);
        PESOA = entrada1.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        Scanner entrada2 = new Scanner(System.in);
        PESOB = entrada2.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        Scanner entrada3 = new Scanner(System.in);
        PESOC = entrada3.nextInt();
        System.out.println("Ingrese el peso de la esfera D: ");
        Scanner entrada4 = new Scanner(System.in);
        PESOD = entrada4.nextInt();
        
        if ( (PESOA == PESOB) && (PESOA == PESOC)){
            if (PESOD > PESOA) {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        } else {
            if ( (PESOA == PESOB) && (PESOA == PESOD)) {
                if (PESOC > PESOA) {
                    System.out.println("La esfera C es la diferente y es de mayor peso");
                } else {
                    System.out.println("La esfera C es la diferente y es de menor peso");
                }
            } else {
                if ( (PESOA == PESOC) && (PESOA == PESOD)) {
                    if (PESOB > PESOD) {
                        System.out.println("La esfera B es la diferente y es de mayor peso");
                    } else {
                        System.out.println("La esfera B es la diferente y es de menor peso");
                    }
                } else {
                    if (PESOA > PESOB) {
                        System.out.println("La esfera A es la diferente y es de mayor peso");
                    } else {
                        System.out.println("La esfera A es la diferente y es de menor peso");
                    }
                }
            }
        }
    }   
}
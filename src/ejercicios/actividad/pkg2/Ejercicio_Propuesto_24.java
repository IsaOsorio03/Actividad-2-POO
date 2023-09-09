
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Propuesto_24 {
    public static void main(String[] args) {
        int PESOA, PESOB, PESOC;
        
        System.out.println("Ingrese el peso de la esfera A: ");
        Scanner entrada1 = new Scanner(System.in);
        PESOA = entrada1.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        Scanner entrada2 = new Scanner(System.in);
        PESOB = entrada2.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        Scanner entrada3 = new Scanner(System.in);
        PESOC = entrada3.nextInt();
        
        if ((PESOA>PESOB) && (PESOA>PESOC)) {
            System.out.println("La esfera A es la de mayor peso");
        } else if ((PESOB>PESOA) && (PESOB>PESOC)) {
            System.out.println("La esfera B es la de mayor peso");
        } else {
            System.out.println("La esfera C es la de mayor peso");
        }
    }
}

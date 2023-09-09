
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Propuesto_23 {
    public static void main(String[] args) {
        double a, b, c, x1, x2;
        
        System.out.println("Ingrese el valor de A: ");
        Scanner entrada1 = new Scanner(System.in);
        a = entrada1.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        Scanner entrada2 = new Scanner(System.in);
        b = entrada2.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        Scanner entrada3 = new Scanner(System.in);
        c = entrada3.nextDouble();
        
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a); 
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        
        if (x1==x2) {
            System.out.println("La ecuacion tiene unica respuesta:");
            System.out.println("X = " + x1);
        } else {
            System.out.println("Las posibles soluciones para la ecuacion son:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }    
}

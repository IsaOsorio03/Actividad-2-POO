
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Resuelto_7 {
    public static void main(String[] args) { 
        int numeroA;
        int numeroB;
        Scanner entradaA = new Scanner (System.in);
        System.out.println("Ingresa el primer número: ");
        numeroA = entradaA.nextInt();
        
        Scanner entradaB = new Scanner (System.in);
        System.out.println("Ingresa el segundo número: ");
        numeroB = entradaB.nextInt();
        
        if (numeroA > numeroB) {
            System.out.println(numeroA + " Es mayor que " + numeroB);
        }
            
        else if(numeroA < numeroB) {
            System.out.println(numeroA + " Es menor que " + numeroB);
        }     
        else {
            System.out.println(numeroA + " Es igual que " + numeroB);
        }     
                    }        
                    
}

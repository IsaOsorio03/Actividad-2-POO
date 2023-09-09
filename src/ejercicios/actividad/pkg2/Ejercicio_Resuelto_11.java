
package ejercicios.actividad.pkg2;

import java.util.Scanner;


public class Ejercicio_Resuelto_11 {
    public static void main (String[] args){
        int numero1, numero2, numero3;
        
        Scanner entrada1 = new Scanner (System.in);
        System.out.println("Ingresa el primer numero: ");
        numero1 = entrada1.nextInt();
        
        Scanner entrada2 = new Scanner (System.in);
        System.out.println("Ingresa el segundo numero: ");
        numero2 = entrada2.nextInt();
        
        Scanner entrada3 = new Scanner (System.in);
        System.out.println("Ingresa el tercer numero: ");
        numero3 = entrada3.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println ("El número mayor es: " + numero1);
        }
        
        else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("El numero mayor es" + numero2);
        }
        
        else {
            System.out.println("El numero mayor es " + numero3);
        }       
    }
}


package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Resuelto_14 {
        public static void main(String[] args) {
        int VD1, VD2, VD3, SALAR, TOTVEN, a, b, c;
        double PORVEN, SALAR1, SALAR2, SALAR3;
        
        System.out.println("Ingrese las evntas del departamento 1: ");
        Scanner entrada1 = new Scanner(System.in);
        VD1 = entrada1.nextInt();
        System.out.println("Ingrese las evntas del departamento 2: ");
        Scanner entrada2 = new Scanner(System.in);
        VD2 = entrada2.nextInt();
        System.out.println("Ingrese las evntas del departamento 3: ");
        Scanner entrada3 = new Scanner(System.in);
        VD3 = entrada3.nextInt();
        System.out.println("Ingrese las evntas del departamento 1: ");
        Scanner entrada4 = new Scanner(System.in);
        SALAR = entrada4.nextInt();
        
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;   
        
        if ( VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else{
            SALAR1 = SALAR;
        }
        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }
        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }
        
        a = (int) SALAR1;
        b = (int) SALAR2;
        c = (int) SALAR3;
        
        System.out.println("El salario de los vendedores del departamento 1 es " + a);
        System.out.println("El salario de los vendedores del departamento 2 es " + b);
        System.out.println("El salario de los vendedores del departamento 3 es " + c);
    }
    
}

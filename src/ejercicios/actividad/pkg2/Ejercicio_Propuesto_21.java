
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Propuesto_21 {
    public static void main(String[] args) {
        double ladoA, ladoB, ladoC;
        double perimetro, semiperimetro, area;
        
        Scanner entraladoA = new Scanner (System.in);
        System.out.println("Ingrese el valor del lado A del triangulo: ");
        ladoA = entraladoA.nextDouble();
        
        Scanner entraladoB = new Scanner (System.in);
        System.out.println("Ingrese el valor del lado B del triangulo: ");
        ladoB = entraladoB.nextDouble();
        
        Scanner entraladoC = new Scanner (System.in);
        System.out.println("Ingrese el valor del lado C del triangulo: ");
        ladoC = entraladoC.nextDouble();
        
        perimetro = ladoA + ladoB + ladoC;
        semiperimetro = perimetro/2;
        area = Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));
        
        System.out.println("El valor del perimetro del triangulo: " + perimetro);
        System.out.println("El valor del semiperimetro del triangulo: " + semiperimetro);
        System.out.println("El valor del area del triangulo: " + area);
    }
}

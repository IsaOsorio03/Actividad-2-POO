

package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Propuesto_19 {
    public static void main(String[] args) {
        double number, perimetro, area, valoraltura, numeromitad, cuadradoA, cuadradoB;
        Scanner entradanumber = new Scanner (System.in);
        System.out.println("Ingrese el valor del lado del triangulo: ");
        number = entradanumber.nextDouble();
        
        numeromitad = number/2; 
        cuadradoA = Math.pow(number, 2);
        cuadradoB = Math.pow(numeromitad, 2);
        
        perimetro = 3*number;              
        valoraltura = Math.sqrt(cuadradoA - cuadradoB);
        area = (number*valoraltura)/2;       
        
        System.out.println("El perimetro del triangulo es: " + perimetro);
        System.out.println("El valor de la altura del triangulo es: " + valoraltura);
        System.out.println("El area del triangulo es: " + area);
        
    }
    
}

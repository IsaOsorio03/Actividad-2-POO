
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Resuelto_10 {
    public static void main (String[] args){
        int inscripcion;
        String name;
        int patrimonio, constante, pat;
        int estrato;
        
        constante = 50000;
        
        Scanner entradains = new Scanner (System.in);
        System.out.println("Ingresa el numero de inscripción: ");
        inscripcion = entradains.nextInt();
        
        Scanner entradaname = new Scanner (System.in);
        System.out.println("Ingresa el nombre: ");
        name = entradaname.nextLine();
        
        Scanner entradapatri = new Scanner (System.in);
        System.out.println("Ingresa el patrimonio: ");
        patrimonio = entradapatri.nextInt();
        
        Scanner entradaestra = new Scanner (System.in);
        System.out.println("Ingresa el numero de estrato: ");
        estrato = entradaestra.nextInt();
        
        
        if (patrimonio <= 2000000) {
            System.out.println("Número de inscripción: " + inscripcion);
            System.out.println("Nombre: " + name);
            System.out.println("Pago por matrícula: " + constante);
        }
        
        else {
            System.out.println("Número de inscripción: " + inscripcion);
            System.out.println("Nombre: " + name);
            System.out.println("Pago por matrícula: " + patrimonio*0.03);     
        }       
    }    
}

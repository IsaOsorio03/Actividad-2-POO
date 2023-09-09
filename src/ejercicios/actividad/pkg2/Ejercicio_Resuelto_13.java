
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Resuelto_13 {
    public static void main (String[] args) {
        int compra;
        String colorb;
        float verde, amarilla, azul;
        
        Scanner entrada1 = new  Scanner (System.in);
        System.out.println("Ingrese el valor de la compra: ");
        compra = entrada1.nextInt();
        
        Scanner entrada2 = new  Scanner (System.in);
        System.out.println("Color de la bolita: ");
        colorb = entrada2.nextLine();
        
        verde = (compra*10)/100;
        amarilla = (compra*25)/100;
        azul = (compra*50)/100;
        
        
        if (colorb.equals("Blanca")){
            System.out.println("El valor a pagar es: $" + compra);
        }
        
        else if (colorb.equals("Verde")){
            System.out.println("Su valor apagar es: $" + (compra - verde));            
        }
        
        else if (colorb.equals("Amarilla")){
            System.out.println("Su valor apagar es: $" + (compra - amarilla));            
        }
        
        else if (colorb.equals("Azul")){
            System.out.println("Su valor apagar es: $" + (compra - azul));
        }
        
        else{
            System.out.println("Su valor apagar es: $0");
        }
    }
    
}

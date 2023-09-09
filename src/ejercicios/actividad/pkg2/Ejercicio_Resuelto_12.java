
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Resuelto_12 {
    public static void main (String[] args) {
        String name;
        int horas, ex, ex2;
        int valor, valor2, valor3, valorextra, valorex2, devengado;
        int costo2, costo3;
        
        Scanner entrada1 = new  Scanner (System.in);
        System.out.println("Ingrese el nombre del trabajador: ");
        name = entrada1.nextLine();
        
        Scanner entrada2 = new  Scanner (System.in);
        System.out.println("Numero de horas trabajadas: ");
        horas = entrada2.nextInt();
        
        Scanner entrada3 = new  Scanner (System.in);
        System.out.println("Valor hora de trabajo: ");
        valor = entrada3.nextInt();
        
        if (horas > 48) {
            ex2 = horas - 48;
            valor3 = valor * 3;
            valorex2 = valor3*ex2;
            
            ex = horas - 40 - ex2;
            valor2 = valor * 2;
            valorextra = valor2*ex;
            
            costo2 = (valor*40)+valorextra+valorex2;

            devengado = (horas - 40)*valor;
            
            System.out.println("Nombre del trabajador: " + name);
            System.out.println("Salario Devengado: " + costo2);
        }
        
        else if (horas > 40 || horas <= 48) {
            ex = horas - 40;
            valor2 = valor * 2;
            valorextra = valor2*ex;
            System.out.println("Nombre del trabajador: " + name);
            System.out.println("Salario Devengado: " + (valorextra+40*valor));
        }
        else {
            System.out.println("Nombre del trabajador: " + name);
            System.out.println("Salario Devengado: " + valor*horas);
        }   
    }
}

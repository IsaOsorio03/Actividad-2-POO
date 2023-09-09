
package ejercicios.actividad.pkg2;

import java.util.Scanner;

public class Ejercicio_Propuesto_22 {
    public static void main(String[] args) {
        String nombre;
        int salario_hora, horas_mes, salario_mensual;
        
        System.out.println("Ingrese el nombre del empleado: ");
        Scanner entrada1 = new Scanner(System.in);
        nombre = entrada1.nextLine();
        System.out.println("Ingrese su salario basico por hora: ");
        Scanner entrada2 = new Scanner(System.in);
        salario_hora = entrada2.nextInt();
        System.out.println("Ingrese el numero de horas trabajadas al mes: ");
        Scanner entrada3 = new Scanner(System.in);
        horas_mes = entrada3.nextInt();
        
        salario_mensual = salario_hora * horas_mes;
        
        if (salario_mensual > 450000) {
            System.out.println("El salario mensual de " + nombre + " es: " + salario_mensual);
        } else {
            System.out.println("El nombre del empleado es: " + nombre);
        }
    }   
}

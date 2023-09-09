
package ejercicios.actividad.pkg2;
 
import java.util.Scanner;

public class Ejercicio_Propuesto_18 {

    public static void main(String[] args) {
        double salariobruto, salarioneto, retencion, valorretencion;
        String name;
        int hourswork, code;
        double costhourworked;
        double porcentretencion;
        
        Scanner entradacode = new Scanner (System.in);
        System.out.println ("Ingrese el código del empleado: ");
        code = entradacode.nextInt();
        
        Scanner entradaname = new Scanner (System.in);
        System.out.println ("Ingrese el nombre del empleado: ");
        name = entradaname.nextLine();
        
        Scanner entrada_hor_traba = new Scanner (System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        hourswork = entrada_hor_traba.nextInt();
        
        Scanner entrahourworked = new Scanner (System.in);
        System.out.println ("Ingrese el valor por hora trabajada: ");
        costhourworked = entrahourworked.nextDouble();
        
        Scanner entradaporcentretencion = new Scanner (System.in);
        System.out.println ("Ingrese el porcentaje de la retencion en la fuente: ");
        porcentretencion = entradaporcentretencion.nextDouble();
        
        salariobruto = costhourworked*hourswork;
        valorretencion = porcentretencion/100;
        retencion = salariobruto*valorretencion;
        salarioneto = salariobruto - retencion;
           
        System.out.println("Código del empleado: " + code);
        System.out.println("Nombre del empleado: " + name);
        System.out.println("El salario bruto es: " + salariobruto);
        System.out.println("El salario neto es: " + salarioneto);       
    }    
}

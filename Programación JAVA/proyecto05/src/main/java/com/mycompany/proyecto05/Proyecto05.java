
package com.mycompany.proyecto05;
/*



CREAR UNA APLICACION QUE PERMITA CALULAR EL PROMEDIO PONDERADO DE 3 NOTAS
LA NOTA MÁXIMA ES 20



NOTA1 EQUIVALE AL 25% DEL PROMEDIO
NOTA2 EQUIVALE AL 45% DEL PROMEDIO
NOTA3 EQUIVALE AL 30% DEL PROMEDIO



*/
import java.util.Scanner;


public class Proyecto05 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       
       //Variable
       float nota1, nota2, nota3;
       float prom;
       //ingresao de datos
        System.out.println("Ingresar Nota 1: ");
        nota1= sc.nextFloat();
        System.out.println("Ingresar Nota 2: ");
        nota2= sc.nextFloat();
        System.out.println("Ingresar Nota 3: ");
        nota3= sc.nextFloat();
        
        //procesos
        nota1=(float)(nota1*0.25);
        nota2=(float)(nota1*0.45);
        nota3=(float)(nota1*0.3);    
        prom=(float)(nota1+nota2+nota3);
        
        //salida 
        System.out.println("La nota 1 es equivale a: "+nota1);
        System.out.println("La nota 1 es equivale a: "+nota2);
        System.out.println("La nota 1 es equivale a: "+nota3);
        System.out.println("El promedio es:"+prom);

    
    
    }
}

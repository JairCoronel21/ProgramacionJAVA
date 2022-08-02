/*
GENENAR UNA APLICACION QUE SOLICITE 3 NOTAS
OBTENGA EL PROMEDIO
E INDIQUE SI EL ESTUDIANTE ESTA APROBADO O DESAPROBADO.



*/


package com.mycompany.proyecto06;

import java.util.Scanner;
public class Proyecto06 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         
        //Variable
        double nota1, nota2, nota3, prom;
        String condicion;
        
        //Entrada de  Datos 
        System.out.println("Ingrese Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Ingrese Nota 2: ");
        nota2 = sc.nextDouble();
        System.out.println("Ingrese Nota 3: ");
        nota3 = sc.nextDouble();
        
        //Procesos
         prom= (nota1+nota2+nota3)/3;
         
         if (prom > 10.4){
             condicion ="APROBADO";
         }
         else{
             
             condicion="DESAPROBADO";
         }
         
         //SALIDA
         System.out.println("Tu promedio es:" +prom);
         System.out.println("Tu estado es: "+condicion);
    }
}

/*
GENERE UNA APLICACION QUE SOLICITE EL NOMBRE DEL ESTUDIANTE
4 NOTAS, Y DEFINIR SU ESTADO
* ESTADO
REPITE -> SI EL PROMEDIO EL MENOR A 8
SUBSANACION -> SI EL PROMEDIO ES MENOR A 10.5
RECUPERACION -> SI EL PROMEDIO ES MENOR A 12
APROBADO -> SI EL PROMEDIO ES 12 EN ADELANTE



*/
package com.mycompany.proyecto07;
import java.util.Scanner;

public class Proyecto07 {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       double nota1,nota2,nota3,nota4,prom;
       String nombre,estado;
       

       //ENTRADA
       System.out.println("INGRESE NOMBRE:");
       nombre= sc.next();
       System.out.println("Ingrese Nota 1: ");
       nota1 = sc.nextDouble();
       System.out.println("Ingrese Nota 2: ");
       nota2 = sc.nextDouble();
       System.out.println("Ingrese Nota 3: ");
       nota3 = sc.nextDouble();
       System.out.println("Ingrese Nota 4: ");
       nota4 = sc.nextDouble();
       
       //PROCESO
       prom= (nota1+nota2+nota3+nota4)/4;
       
       if(prom<8){
           estado = "REPITE";
       }else if(prom<10.5){
           estado ="SUBSANACION";
       }else if(prom<12){
           estado ="RECUPERACION";
       }else if(prom>=12){
           estado = "APROBADO";
       }else{
           estado="";
       }
          
       //SALIDa
        System.out.println(nombre+",SU PROMEDIO ES: "+prom);
        System.out.println("SU ESTADO ES: "+estado);
    }
}

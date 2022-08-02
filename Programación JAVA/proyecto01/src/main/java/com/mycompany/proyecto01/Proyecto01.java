
package com.mycompany.proyecto01;

import java.util.Scanner;


public class Proyecto01 {

    public static void main(String[] args) {
        
        //Imprimir mensaje
        //System.out.println("d");
        /*
        Utilizar sout como metodo abreviado de System.out.print line*/
        System.out.println(" Aplicacion 01 - java ");
            
        // Capturar datos ingrasados por  teclado
        // Crear una instancia de la clase Scanner
        //utilizar la clase scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        
        System.out.println( "BIENVENIDO: " + sc.nextLine()); 
             
        
       
    }
}



package com.mycompany.proyecto02;

import java.util.Scanner;

public class Proyecto02 {

    public static void main(String[] args) {
        //crear una palicacion que sume 2 numeros
        Scanner sc = new Scanner(System.in);
        System.out.println("APLICACION 02- SUMA DE NUMEROS");
        System.out.println("Ingresar Primer numero: ");
        int n1= sc.nextInt();
        System.out.println("Ingresar Segundo Numero: ");
        int n2= sc.nextInt();
        int s = n1 + n2;
        System.out.println("La suma de " +n1+ "+" +n2+ " = " +s );//ok
        System.out.println("La suma de " +n1+ "+" +n2+ " = " + n1+n2); //no hacer calculos en println
        System.out.println("La suma de " +n1+ "+" +n2+ " = " + (n1+n2) );
       
    }
}

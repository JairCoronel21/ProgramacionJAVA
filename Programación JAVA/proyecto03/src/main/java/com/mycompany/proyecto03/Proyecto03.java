/*
crear una aplicacion que sume reste  multiplique y divida 3 numerop 
enteros
 */

package com.mycompany.proyecto03;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Proyecto03 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1=0,  n2=0, s=0, r=0, d=0, m=0;
        System.out.println("Ingresar Primer numero: ");
        n1= sc.nextInt();
        System.out.println("Ingresar Segundo Numero: ");
        n2= sc.nextInt();
        s = n1 + n2;
        r= n1-n2;
        d= n1/n2;
        m= n1*n2;
        System.out.println("La suma de " +n1+ "+" +n2+ " = " +s );
        System.out.println("La resta de " +n1+ "-" +n2+ " = " +r );
        System.out.println("La division de " +n1+ "/" +n2+ " = " +d );
        System.out.println("La multiplicacion de " +n1+ "*" +n2+ " = " +m );
    }
}

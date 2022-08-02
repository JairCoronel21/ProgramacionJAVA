

package com.mycompany.proyecto04;

import java.util.Scanner;
public class Proyecto04 {



public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Aplicacion04 - JAVA");
//declaracion
int b, h, area;
System.out.println("Ingresa la base del triangulo: ");
b = sc.nextInt();
System.out.println("Ingresa la altura del triangulo: ");
h = sc.nextInt();
//proceso
area = (b*h)/2;
System.out.println("el area del triangulo es: " + area);

}

}
/*
CREAR UNA APLICACION QUE SOLICITE EL NOMBRE DE UN TRABAJADOR
LOS DIAS TRABAJADOS Y SU CATEGORIA
CALCULAR PAGO (DIAS TRABAJADOS X PAGO DIA) 
CATEGORIA   PAGO DIARIO
A                80
B                 70
C                 50
D                 40
E                 20*/


package com.mycompany.proyecto09;
import java.util.Scanner;

public class Proyecto09 {

    public static void main(String[] args) {
                      Scanner sc = new Scanner(System.in);
                     // VARIABLES
                     String nombre, categoria;
                     int dia, pagoDia, pagoTotal;
                     
                     
                     // ENTRADA DE DATOS
                     System.out.println("Ingrese su nombre: ");
                     nombre = sc.nextLine();
                     // Validar si se ingreso el nombre del usuario
                     if (nombre.equalsIgnoreCase("")) {
                     System.out.println("No s eingreso el nombre de usurio");
                     System.out.println("Fin del programa");
                     System.exit(0);
                     }
                     System.out.println("Ingrese su categoria (A/B/C/D/E): ");
                     categoria = sc.nextLine();
                     // vallidar categoria
                     if (!(categoria.equalsIgnoreCase("A") || categoria.equalsIgnoreCase("B") || categoria.equalsIgnoreCase("A") || categoria.equalsIgnoreCase("D") || categoria.equalsIgnoreCase("E"))) {
                     System.out.println("Error en la categoria");
                     System.out.println("Fin del programa");
                     System.exit(0);
                     }

                     System.out.println("Ingrese dias trabajados: ");
                     dia = sc.nextInt();
                     // Validar
                     if (dia == 0) {
                     System.out.println("No ingreso los dias trabajados");
                     System.out.println("Fin del programa");
                     System.exit(0);
                     }
                     // PROCESOS
                     // SOLUCION CON LA INSTRUCCION SWITCH
                     // switch se utiliza para abreviar If ... else if ....
                     // Utilizar si la condicion de if evalua una sola variable
                     switch (categoria){
                     case "A":
                     pagoDia = 80;
                     break;
                     case "B":
                     pagoDia = 70;
                     break;
                     case "C":
                     pagoDia = 50;
                     break;
                     case "D":
                     pagoDia = 40;
                     break;
                     case "E":
                     pagoDia = 20;
                     break;
                     default:
                     pagoDia = 0;
                     break;
                     }
                     /*
                     Obtener el pago dia -> Resolver con If... Else if ....

                      if (categoria.equalsIgnoreCase("A")) {
                     pagoDia = 80;
                     }else if (categoria.equalsIgnoreCase("B")) {
                     pagoDia = 70;
                     }else if (categoria.equalsIgnoreCase("C")) {
                     pagoDia = 50;
                     }else if (categoria.equalsIgnoreCase("D")) {
                     pagoDia = 40;
                     }else if (categoria.equalsIgnoreCase("E")) {
                     pagoDia = 20;
                     }else{
                     pagoDia = 0;
                     }
                     */
                     // Calcular el pagoTotal
                     pagoTotal = dia * pagoDia;
                     // SALIDAS
                     if (pagoDia == 0) {
                     System.out.println("Error al ingresar la categoria");
                     }else{
                     System.out.println("Pago dia: " + pagoDia);
                     System.out.println("Pago Total: " + pagoTotal);
                     }
    }
}

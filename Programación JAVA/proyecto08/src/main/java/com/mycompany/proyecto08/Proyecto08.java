
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


package com.mycompany.proyecto08;
import java.util.Scanner;

public class Proyecto08 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Variable
        String nombre,categoria;
        int dia, pagoDia,pagoTotal;
        //entrada
        System.out.println("Ingrese su nombre: ");
        nombre= sc.nextLine();
        System.out.println("Ingrese su categoria (A/B/C/D/E): ");
        categoria = sc.nextLine();       
        System.out.println("Ingrese  dias trabajados:");
        dia= sc.nextInt();

        //Proceso
            //obterner el pago dia -> Resolver  con if.. else if...
         if(categoria.equalsIgnoreCase("A")){
             pagoDia = 80;
         }else if(categoria.equalsIgnoreCase("B")){
             pagoDia= 70;
         }else if(categoria.equalsIgnoreCase("C")){
             pagoDia= 50;
         }else if(categoria.equalsIgnoreCase("D")){
             pagoDia=40;
         }else if(categoria.equalsIgnoreCase("E")){
             pagoDia=20;
         }else{
             pagoDia=0;
         }
            //calcular el pagoTotal
            
            pagoTotal = dia * pagoDia;
                           
        
        //Salida
        System.out.println("Pago dia: "+pagoDia);
        System.out.println("Pago Total; "+pagoTotal);
        
    }
}

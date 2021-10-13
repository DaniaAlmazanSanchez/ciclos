package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        //ciclo for
        //for(condicion){
             ....
          // }

      /*
        System.out.println("ingrese numero:");
        int numero=sc.nextInt();

        for (int i=1; i<=10; i++){

            System.out.println(numero + "x" + i + "=" + (numero*i));
        }
*/
        //ciclo for Fibonacci
        //for(condicion){
             ....
        // }
        /*
        System.out.println("ingresa numero:");
       int dato=sc.nextInt();
         int  numero1=0;
         int  numero2=1;
         int  suma=1;
        System.out.println("serie de fibonacci: \n" + numero1);
        for(int i=1;i<=dato; i ++){
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
            System.out.println(suma);

        }

        */
        //ciclo while
        //for(condicion){
             ....
        // }
        System.out.println("ingrese numero");
        int numero=sc.nextInt();
        int i=1;
        int factorial=1;
         do {

             factorial*=i;
             i++;
         }
        while (i<= numero);

            System.out.println(factorial);

    }

}

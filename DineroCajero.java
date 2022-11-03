/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dinerocajero;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class DineroCajero {

    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         
         int money;
         int tot;
         int tot2;
         int tot3;
         int tot4;
         int mont;
         int tot2_2;
    
         System.out.println("Extracción");
         System.out.println("Monto: ");
         money = leer.nextInt();
         
         if (money >=1000){
             //1)En caso de que el monto sea más o igual de 1000 pesps
             mont = money / 1000;
             tot = money % 1000;
             if (tot > 500){
                 //2)si lo que sobra, aparte de los miles de pesos, son más de 500 pesos entonces...
                 tot2 = tot/500;
                 tot2_2 = tot - 500;
                 if (tot2 >200){
                     //3) Si lo que sobra, aparte de los 500 pesos, son más de 200, entonces...
                     //Esto sirve para que si el monto es de 1900 pesos entonces no ponga esos 400 con billetes de 100
                     tot3 = tot2/200;
                     if (tot2 % 200 ==0){
                         //Si no sobra nada...
                           System.out.println("Billetes 1000: " + mont + ", billetes 500: " + tot2 + ", billetes 200: " + tot3 );
                     }else{ 
                         //Si sobra, agregamos los billetes de 100. Por ejemplo 1700 pesos 
                         tot4 = tot3/100;
                         System.out.println("Billetes 1000: " + mont + ", billetes 500: " + tot2 + ", billetes 200: " + tot3 + ", billetes 100: " + tot4 );  
                     }
                 }else{
                     //3) Si sobra menos de 200 pesos, entonces que sea con billetes de 100
                     tot3 = (tot2_2 / 100);
                     System.out.println("Billetes 1000: " + mont + ", billetes 500: " + tot2 + ", billetes 100: " + tot3 );
                 }
             }else{
                 //2) Si son menos de 500 pesos entonces...
                 if (tot > 200){
                     //Pero son más de 200 pesos
                     tot2 = tot / 200;
                     tot2_2 = tot - 200;
                     if (tot % 200==0){
                         //Si no sobra nada, solo ponemos los billetes 200
                         System.out.println("Billetes 1000: " + mont + ", billetes 200: " + tot2  );
                     }else{
                         //Si son más de 200, entonces agregamos los billetes de 100
                         tot3 = tot2_2 / 100;
                         System.out.println("Billetes 1000: " + mont + ", billetes 200: " + tot2 + ", billetes 100: " + tot3 );
                     }
                 }else{
                     //Por otro lado, si lo que sobra es menos que de 200 pesos entonces directamente ponemos los de 100
                     tot2 = tot/100;
                     System.out.println("Billetes 1000: " + mont + ", billetes 100: " + tot2 );
                 }
             }
         }else{
             //En caso de que el monto total sea menor a 1000 pesos entonces... FALTA SEGUIR PAULAAAA, haceloooooo
             if (money > 500){
                 tot = money/500;
                 tot2 = money % 500;
                 //Si el resto es mayor o igual, entonces...
                 if (tot2 >=200){
                     tot2_2 = tot / 200;
                     tot3 = tot2 - tot2_2;
                     //Si el resto es mayor a 100, entonces...
                     if (tot3 >=100){
                          tot4 = tot3 /100;
                         System.out.println("Billetes 500: " + tot + ", billetes 200: " + tot2_2 + ", billetes 100: " + tot4 );
                         //Sino, ponemos directamente sin billetes de 100
                     }else{
                         System.out.println("Billetes 500: " + tot + ", billetes 200: " + tot2_2  );
                     }
                     //Si es menor a 200, entonces ponemos los billetes de 100
                 }else{
                     tot2_2 = tot2 / 100;
                     System.out.println("Billetes 500: " + tot + ", billetes 100: " + tot2_2 );
                 }
                 //Si el monto total es menor a 500, entonces
             }else{
                 //Pero es mayor a 200
                 if (money >=200){
                     tot = money / 200;
                     tot2 = money % 200;
                     //Si el resto es menor a 100 (dudo que haga falta pero así funciona), entonces...
                     if (tot2 >=100){
                         tot3 = tot2/100;
                         System.out.println("Billetes 200: " + tot + ", billetes 100: " + tot3 );
                     }else{
                         //Si no hay resto, entonces solo ponemos los billetes de 100
                         System.out.println("Billetes 200: " + tot);
                     }
                 }else{
                     //Si el monto a sacar es menor a 200, entonces...
                     tot = money / 100;
                     System.out.println("Billetes 100: " + tot );
                 }
             }
         }     
    }
}

package com.iplacex.practicadesarrollologica;
import java.util.Scanner;
/**
 *
 * @author PatoCode Robinson Concha
 * 
 * realizar series numéricas utilizando for , while, do while:
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 * 
 * 1, 99, 2, 98, 3, 97, 4, 96, 5, 95
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 * 
 */
public class PracticaDos {
    public static void main(String[] args) { 
        System.out.println("Wena Patito");
       //Primera serie numérica
        int i = 0;
        //serie con for
        System.out.println("Serie con for");
        for(i = 1; i <= 10; i++){
        if(i < 10){
        System.out.print(i + ", " );
        }else{
            System.out.print(i);  
        }
        }
        i = 1;
        System.out.println("");
        System.out.println("Serie con while");
        while(i <= 10){
         if(i < 10){
        System.out.print(i + ", " );
        }else{
            System.out.print(i);
        }
         i++;
        }
        i = 1;
        System.out.println("");
        System.out.println("serie con do while");
        
        do{
         if(i < 10){
        System.out.print(i + ", " );
        }else{
        System.out.print(i);   
        }
         i++;
        }while(i <= 10);
        System.out.println("");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        //segunda serie numérica
        int j = 1, k = 99;
        System.out.println("Serie con for");
        for(j = 1; j<= 5; j++){
        if(j < 5){
        System.out.print(j + ", ");
        System.out.print(k + ", ");
        }else{
        System.out.print(j +", ");
        System.out.print(k);
        }
        k--;
        }
        System.out.println("");
        j = 1;
        k = 99;
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("Serie con while");
        while(j <= 5){
        if(j < 5 ){
        System.out.print( j +", ");
        System.out.print( k +", ");
        }else{
        System.out.print( j +", ");
        System.out.print( k);
        }
        j++;
        k--;
        }
        System.out.println("");
        j = 1;
        k = 99;
    System.out.println("*************************************************");
    System.out.println("*************************************************");
    System.out.println("Serie con do while");
    do{
        if(j < 5 ){
        System.out.print( j +", ");
        System.out.print( k +", ");
        }else{
        System.out.print( j +", ");
        System.out.print( k);
        }
        j++;
        k--;
         
    }while(j <= 5);
    System.out.println("");
    System.out.println("*************************************************");
    System.out.println("*************************************************");
    
    //Sucesión Fibonacci ultima serie numérica
    
    
    
    }
}


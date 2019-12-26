/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tp;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
/**
 *
 * @author pasha
 */
public class TP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String[] A = {"Ivanov1","Ivanov2","Ivanov3"};
       String[] It = {"Kondratyev1","Kondratyev2","Kondratyev3","Kondratyev4"};
       String[] Km = {"student1","student2","student3","student4","student5"};
       
       Scanner in = new Scanner(System.in);
       System.out.println("Введите название группы: \n");
       String x =  in.next();
              
       switch(x){
           case "A":
               System.out.print("Студенты группы А:\n");
              for (int i = 0; i < A.length; i++) 
            System.out.println(A[i]);       
               break;
           case "It":
               System.out.print("Студенты группы ИТ:\n");
              for (int i = 0; i < It.length; i++) 
            System.out.println(It[i]);      
               break;
           case "Km":
               System.out.print("Студенты группы КМ:\n");
              for (int i = 0; i < Km.length; i++) 
            System.out.println(Km[i]);       
               break;
    }
    }
    
}

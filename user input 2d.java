/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author Ac0b
 */
public class JavaApplication17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of rows");
        int rows=sc.nextInt();
        System.out.println("enter the size of the column");
        int column=sc.nextInt();
        int[][] multi = new int[rows][column];
        for(int i=0;i<multi.length;i++) {   
           for (int x=0;x<column;x++){
            System.out.println("Enter value for row "+i+" column"+x+":");
            int columnvalue=sc.nextInt();
            multi[i][x]=columnvalue;
           }
        }
         for(int i=0;i<multi.length;i++) {   
           for (int x=0;x<column;x++){
            System.out.println("row "+i+" column "+x+":"+multi[i][x]);
           }
        }
    }
    
}

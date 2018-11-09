/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Ac0b
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
     System.out.println("ENTER A NUMBER");
     double number = sc.nextDouble();
     System.out.println("ENTER A NUMBER");
     double number2 = sc.nextDouble();
     System.out.println("ENTER THE ARITHMETHIC OPERATION ");
      String  op=sc.next();
      
      switch (op){
          case "+":
          System.out.println(number+number2);
        break; 
          case "/":
          System.out.println(number/number2);
        break; 
          case "-":
          System.out.println(number-number2);
        break; 
          case "*":
          System.out.println(number*number2);
        break; 
          
     
    }
}
}
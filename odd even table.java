/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


/**
 *
 * @author Ac0b
 */
public class NewClass {
  public static void main(String[]args)  {
 int numbers []={2,4,6,8,10,1,3,5,7,9};
      System.out.println("even"+"\t"+"add");
 for (int i =0; i<numbers.length;i++){
      if (numbers[i]%2==0){
         System.out.println(numbers[i]);
      } else if (numbers[i]%1==0){
          System.out.println("\t"+numbers[i]);
      }  else {
          System.out.println("------------");
      }
        }

  }
}

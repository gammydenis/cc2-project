
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ac0b
 */
public class guessinggame {
    public static void main(String[] args) {
        Scanner logger = new Scanner(System.in);
   int times = 0;
 
   int a ;
   int guess = 0;
   int input;
   int limit = 10;
   /*
    System.out.println("Enter a number");
    input = logger.nextInt();
*/
   System.out.println("Enter a number:");
   a = logger.nextInt();
   System.out.println("\n"+ "\n"+ "\n"+ "\n"+ "\n"+ "\n"+ "\n"+ "\n"+ "\n"+ "\n");
  
   System.out.println("Guese the number");
   
   while(guess != a){
       guess = logger.nextInt();
       times ++;
       if (guess < a){
           System.out.println("Higher!");
         if (a % 2 == 0){
         System.out.println("Hint:The number is even.");
         }
         else{
         System.out.println("Hint:The number is odd.");
         }
       }
       else if (guess > a){
           System.out.println("Lower!");
           if (a % 2 == 0){
         System.out.println("Hint:The number is even.");
         }
         else{
         System.out.println("Hint:The number is odd.");
         }
       }
        
   }
    
    System.out.println("Congratulations. You guessed the number with "
        + times + " tries!");
    
    }
}

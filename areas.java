/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author cc2_1d-7
 */
public class NewClass {
    public static void main(String [] args ){
  Scanner sc = new Scanner (System.in);
  System.out.println("enter the side of the square: ");
  double square = sc.nextDouble();
  double area = Math.pow(square,2) ;
  System.out.println("The area of the square is: "+ area);
  
   System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
 
  System.out.println("enter the the raduis of the circle ");
  double circle = sc.nextDouble();
  double area2 = Math.PI * (circle * circle);
      System.out.println("The area of circle is: " + area);
      //Circumference = 2*PI*radius
      double circumference= Math.PI * 2*circle;
      System.out.println( "The circumference of the circle is:"+circumference) ;
      
       System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
       
     System.out.println("Enter the width of the Triangle:");
      double base = sc.nextDouble();

      System.out.println("Enter the height of the Triangle:");
      double height = sc.nextDouble();
      double area3 = (base* height)/2;
      System.out.println("Area of Triangle is: " + area);      
}
}
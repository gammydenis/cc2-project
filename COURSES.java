/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Ac0b
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("SELECT YOUR DEPARTMENT (CITCS,COA,LAW,NURSING,CTE,BSED");
    String dept=sc.next();
    
    if (dept .equals("CITCS")){
    System.out.println("select your course code ");
    String course = sc.next();
    if (course.equals("BSCS"))
        System.out.println("DISCRIPTION: The Bachelor of Science in Computer Science program provides the students with an in-depth understanding on the theoretical and applied aspects of computing");
    else if(course.equals("BSIT")){
         System.out.print("DISCRIPTION: The Bachelor of Science in Information Technology (BSIT) is comprised of two tracks: Network Security and Web Technology. ");
    }
     else if(course.equals("BSIS")){
        System.out.print("DISCRIPTION: The curriculum Bachelor of Science in Information Systems (BSIS) program is designed to respond to the needs of the students for critical skills and knowledge required to direct and to control computerized information resources within diverse organizational settings");
    }
     else if(course.equals("ACT")){
        System.out.print(" DISCRIPTION: The Associate in Computer Technology program provides the students with the skills and understanding to manage, improve and take care of computer systems and computer applications. Students will be prepared to work with advanced computer and communications equipments, computer applications and as support for offices and IT organizations.");
    }
     else {
         
     System.out.println("please select your course code");
      
  }
   
   } if (dept .equals("COA")){
       System.out.println("slect your source code "); 
       String coa = sc.next();
       if (coa .equals("BSA")){
         System.out.println("Bachelor of Science in Accountancy");  
       } 
       else if (coa . equals("BSMA ")){
          System.out.println("Bachelor of Science in Management Accounting");    
       }
       else if (coa.equals("BSAIS")){
           
           System.out.println("  Bachelor of Science in Accounting Information System ");   
       }
       else if (coa.equals("BSFA")){
             System.out.println("  Bachelor of Science in Forensic Accounting");  
        
       }
       
    }  if (dept . equals ("LAW")){
        
        System.out.println("Bachelor of law");
    }  if (dept.equals("CAS")) {
         System.out.println("select your course code");
          String cas = sc.next();
          if (cas.equals("BSAP")){
           System.out.println("Bachelor of Arts in Political Science ");
          } 
          else if (cas . equals("BSA")){
            System.out.println("Bachelor of Arts in Communication");   
          }
           else if (cas . equals("BAELS")){
            System.out.println("Bachelor of Arts in English Language Studies");   
          }
           else if (cas . equals("BSP")){
            System.out.println("Bachelor of Science in Psychology");   
          }
           else if (cas . equals("BSBS")){
            System.out.println("Bachelor of Science in Bahavioral Science");   
          }
          
    }   if (dept . equals ("NURSING")){
        System.out.println("Bachelor of Science in Nursing");   
    
    } if (dept.equals("CTE")){
        System.out.println("Select your course code ");
        String CTE = sc.next();
        if (CTE .equals("BSED")){
           System.out.println("Bachelor of Science in Elementary Education"); 
        }
        
         else if (CTE . equals("BSEE")){
           System.out.println("Bachelor of Science in Elementary Education");   
        } else if (CTE .equals("BSSE")){
            System.out.println("Bachelor of Science in Secondary Education");   
        }
    } 
     
       
  }
}

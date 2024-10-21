/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myprojects.assignment_1;

/**
 *
 * @author IHSANULLAH PC
 */
import java.util.Scanner;
public class Leap_Year {
   public static void main(String[] args){
      int year;
      System.out.println("Enter an Year : ");
      Scanner scn = new Scanner(System.in);
      year = scn.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
         System.out.println("entered year is a leap year");
         
         /*Check if the year is divisible by 4 but not 100 or divisible by 400
         , DISPLAY "leap year ; Otherwise, DISPLAY "not leap year" */
         
      }
      else{
         System.out.println("entered year is not a leap year");
      }
      
   }
}    


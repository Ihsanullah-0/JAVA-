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
public class Marks_category {
public static void main (String args[]){
Scanner scn = new Scanner(System.in);
System.out.print("Please enter your Grade with Capital letter: ");
char Grade;
Grade=scn.next().charAt(0);
switch(Grade){
case 'A' :
System.out.println(" Grade's Message : Excellent");
break;
case 'B' :
System.out.println(" Grade's Message : Very Good");
break;
case 'C' :
System.out.println(" Grade's Message : Well Done");
break;
case 'D' :
System.out.println(" Grade's Message : Satisfactory ");
break;
case 'F' :
System.out.println(" Grade's Message : Fail");
break;
default:
System.out.println(" Grade's Message : invalid input");
}
}
}


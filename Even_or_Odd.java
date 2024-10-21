/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package myprojects.assignment_1;

/**
 *
 * @author IHSANULLAH PC
 */
import java.util.Scanner; 
public class Even_or_Odd { 
public static void main(String[] args) { 
Scanner scn = new Scanner(System.in); 
System.out.print("Please enter a number: "); 
int number; 
number = scn.nextInt();
if (number % 2 == 0) { 
System.out.println(number + " must be an Even number."); } 
else { 
System.out.println(number + " must be an odd number."); 
}
 }
 }

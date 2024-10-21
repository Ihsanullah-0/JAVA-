/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myprojects.assignment_1;

import java.util.Scanner;

/**
 *
 * @author IHSANULLAH PC
 */
public class Integers {
public static void main (String arg[]){

int number;
Scanner scn = new Scanner(System.in);
System.out.print("please enter the number : ");

number=scn.nextInt();
System.out.println();

if(number > 0){
System.out.print(+number);
System.out.println(" : is a Positive number");
}

else if(number < 0){   
System.out.print(+number);
System.out.println(" : is a Negative number"); 
}

else{
System.out.print(+number);
System.out.println(" : is zero");
} 

}
}

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
public class Comparison {
public static void main (String arg[]){

int num1 , num2 ,num3 ;
Scanner scn = new Scanner(System.in);
System.out.println("please enter those three numbers : ");

num1=scn.nextInt();
num2=scn.nextInt();
num3=scn.nextInt();

if(num1>num2 && num1>num3){
System.out.println("the greatest number is :" +num1);
}
else if(num2>num1 && num2>num3){
System.out.println("the greatest number is :" +num2);
}
else if(num3>num1 && num3>num2){
System.out.println("the greatest number is :" +num3);
}
else{
System.out.println("some of these numbers are equal");
}
}
}

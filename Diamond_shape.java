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
public class Diamond_shape {
        public static void main(String[] args)
    {
 
        int number;
        System.out.println("please enter the number of rows :");
        Scanner sca = new Scanner(System.in);
        number=sca.nextInt();
        int m, n;
 
        for (m = 1; m <= number; m++) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
 
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
 
            System.out.println();
        }
 
        for (m = number - 1; m > 0; m--) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }

            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }  
}

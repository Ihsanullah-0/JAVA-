/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myprojects.assignment_1;

/**
 *
 * @author IHSANULLAH PC
 */
public class Average {
public static void main(String[] args) {   
       
        int[] numbers = new int[]{10, 12, 34, 23, 56, 78};
        int sum = 0;
        double average;
        
       
        for (int i = 0; i < numbers.length; i++) {
          
            sum = sum + numbers[i];
        }
        
        average = sum / numbers.length;
        
        System.out.println("Average value of the array elements is : " + average); 
    }
    
}

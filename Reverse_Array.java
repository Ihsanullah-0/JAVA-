/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myprojects.assignment_1;

/**
 *
 * @author IHSANULLAH PC
 */
public class Reverse_Array {
     public static void main(String[] args) {  
         
        int [] values = new int [] {3,4,6,1,9,7,5,8}; 
        
        System.out.println("Original array: ");  
        
        for (int i = 0; i < values.length; i++) {  
            System.out.print(values[i]);  
        }  
        
        System.out.println(); 
        System.out.println(); 
        
        System.out.println("Array in reverse order: ");  
        
        for (int i = values.length-1; i >= 0; i--) {  
            System.out.print(values[i]);  
        }  
    }  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myprojects.assignment_1;

/**
 *
 * @author IHSANULLAH PC
 */
public class Largest_in_array {
        public static void main(String[] args) {  
    
        int [] arr = new int [] {34,23,12,45,67,89,234,26,10,30,43}; 
        
        //Initialize max with first element of array.  
        int max = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    } 
}

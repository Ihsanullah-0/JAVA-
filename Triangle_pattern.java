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
public class Triangle_pattern {
    public static void main(String[] args) {
        
        int row_num = 7;

        for (int i = 1; i <= row_num ; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }   
}

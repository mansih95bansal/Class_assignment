/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.class_projectt;

/**
 *
 * @author 91706
 * Group Task 
 * how r u 
 * 
 */
public class Class_projectt {

    public static void main(String[] args) {
        double[] numArray = { 45.3, 42.5, 20.3, 55,56,100,151};
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}

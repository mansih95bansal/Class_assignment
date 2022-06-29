/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.class_assignment;

/**
 *
 * @author 91706
 */
public class Class_assignment {

    public static void main(String[] args) {
      int i,total;
      int a[] = {6,9,7,8};
      int n = 5;
      total = 0;

      for(i=0; i<n; i++) {
         total += a[i];
      }
      System.out.println("Average ::"+ total/(float)n);
    }
}

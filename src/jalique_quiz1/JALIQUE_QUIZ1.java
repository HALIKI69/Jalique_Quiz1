/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalique_quiz1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JALIQUE_QUIZ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Choose quiz number: ");
       Scanner scn = new Scanner(System.in);
       int choice = scn.nextInt();
       switch (choice){
           case 1:
               printArray();
               break;
           case 2:
               System.out.println("Wala koy 2 :( ");
               break;
           case 3:
               Num3();
               break;
       }
        
        
       
        }
        
    
    
    
    public static void printArray(){

       int arr[] = {82,44,96,7,13,56,74,14,98,36};
        System.out.println(" #1 Default Array: " + Arrays.toString(arr));
        
}
    public static void Num2() {
        System.out.println("Enter number of array elements:");
         Scanner scanner = new Scanner(System.in);
        int elemArr = scanner.nextInt();
        int[] newArr = new int[elemArr];
            
        System.out.println("Enter Array Elements");
        for (int i = 0; i < elemArr; i++) {
            newArr[i]=scanner.nextInt();
        }
        
        System.out.println("Array created: " + Arrays.toString(newArr));
        System.out.println("Delete an element: ");
        int deleteElem = scanner.nextInt();
        
        for (int i = 0; i <= deleteElem; i++) {
            newArr[i - 1]= 
        }
    }
    
    public static void Num3() {
        System.out.println("Enter number of array elements:");
         Scanner scanner = new Scanner(System.in);
        int elemArr = scanner.nextInt();
        int[] newArr = new int[elemArr];
            
        System.out.println("Enter Array Elements");
        for (int i = 0; i < elemArr; i++) {
            newArr[i]=scanner.nextInt();
             }
        System.out.println("Array" + Arrays.toString(newArr));
        
        
        insertionSort(newArr);
        System.out.println("Sorted Array" + Arrays.toString(newArr));
       
            
        }
     public static void insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int insert = arr[i];
            int j = i -1;
            
            while (j >= 0 && arr[j] > insert) {                
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            
            arr[j + 1] = insert;
            
        }
    }
   
    
    
   
    }

    


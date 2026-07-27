/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semester2;

/**
 *
 * @author Owethu
 */


public class BubbleSort 
{

    public static void main(String[] args) 
    {
        //Array of numbers - random list
        //dataType ArrayName [Size] = {e1,e2,e3,e3,e4};
        
        int [] numbers = {8,4,5,1,20,9,12};//Size has been set to 7 elements
        
        //for-each loop / for-in loop - display the sorted array
        System.out.println("Unsorted Arrays:\n");
        for(int number: numbers)
        {System.out.print(number + ", ");}
        
        //bubble sort will use a nested structure to do the sorting
        //2 Loops (Outer Loop & Inner Loop)
        //Selection Statement - Single Selection
        
        // Outer Loop: Repeat for each pass
        for(int pass = 0; pass < numbers.length-1;pass++)
        {
        for (int index = 0; index < numbers.length-1-pass; index++)
            
        {
        //inner loop body
            
            //Selection Statement - Swap if the left number is larger
            if (numbers[index] > numbers[index+1])
            {
            int temp = numbers[index];//This is to ensure we don't lose / wipe-out an value
            numbers[index] = numbers[index + 1];
            numbers[index+1] = temp;

            }
        }
        }
        //for-each loop / for-in loop - display the sorted array
        System.out.println("Sorted Arrays:\n");
        for(int number: numbers)
        {System.out.print(number + ", ");}
    }
}

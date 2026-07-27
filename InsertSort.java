/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semester2;

/**
 *
 * @author Owethu
 */


public class InsertSort 
{

    public static void main(String[] args) 
    {
        //1D Array - Single Array
        int[] numbers = {8,3,4,11,0,34,1,10};
        
        //Display the unsolved array
        for(int number: numbers)
        {System.out.print(number + " ");}
        
        System.out.println(""); 
        
        for(int index = 1; index < numbers.length; index++)
        {
        int current = numbers[index];
        int position = index-1;
        
        //shift any larger value to the right
        while(position >= 0 && numbers[position]>current)
        {
        numbers[position + 1] = numbers[position];
        position--;
        }
        //insert the value
        numbers[position +1] = current;
        }
        //Display the sorted array
        for(int number : numbers)
        {System.out.print(number + " ");}
    }
}

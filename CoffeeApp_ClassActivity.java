/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semester2;

/**
 *
 * @author Owethu
 */

import java.util.Scanner; //Console App

public class CoffeeApp_ClassActivity
{

    public static void main(String[] args) 
    {
        //Scanner object used to recive input from user
        //ClassName objectName = new ClassName(paramiters) {constructor is the name for a method}       
        Scanner input = new Scanner(System.in);
        
        //1D Array - Days of the week (Rows for the 2D Array)
        //datatype [] arrayName = {e1, e2, e3, e4};
        String [] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        
        //1D Array - drinkTypes (Columns for the 2D array)
        String [] drinkTypes = {"Coffee", "Tea", "Hot Chocolate"};
        
        //Create the 2D array by calling the length of each of the 1D Arrays
        //2D Array:  7 rows + 3 columns (Size: 21 (7*3))
        
        int[][] drinkSales = new int[days.length][drinkTypes.length];
        
        
        //1D Array to store the total sales for each drink
        int[] drinkTotals = new int[drinkTypes.length];
        
        //1D Array to store the total drinks sold on each day
        int [] dailyTotals = new int[days.length];
        
        //Store the total number of drinks sold for the week
        int OverallTotal = 0; //accumulator (Counter variable)
        
        System.out.println("COFFEE SHOP SALES App");
        System.out.println("========================");
        
        //Outer loop: moves through each row/day
        //Inner loop
        
        for(int row = 0; row < days.length; row++)
        {
            System.out.print(days[row] + ": ");
            
            //inner loop: Moves through each column / drink type
            for(int column =0; column < drinkSales[row].length; column++)
            {
                //Sales
                //validation: Sales <0 & not a negative value
                //do-while loop + if statement
                int sales = 0;
                
                do{
                System.out.println(drinkTypes[column] + ": ");
                drinkSales[row][column] = input.nextInt();
                if(sales < 0)
                {
                    System.out.println("Sales cannot be negative. Try again");
                }
                }
                while(sales > 0);
                // Stored the captured value in the row & column of the 2D array
                drinkSales[row][column]=sales;
            }
        }
        //calculate all the totals
        //outer loop: moves through the days
        //inner loop: moves through the drinks
        //display table
        
        /*
        String format Specifiers:
        %
        */
  
        
        
    }
}

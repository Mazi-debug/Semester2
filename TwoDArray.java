/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semester2;

/**
 *
 * @author Owethu
 */

import javax.swing.JOptionPane; //Imports the JOptionPane class for the GUI

public class TwoDArray 
{

    public static void main(String[] args) 
    {
        /*
        Table / Spreadsheet 
        
           COLUMNS
           |    | C0  |  C1  |  C2  |
           --------------------------
        R  | R0 | 400 | 800  | 1000 |
        O  | R1 | 550 | 950  | 1100 |
        W  | R2 | 600 | 1000 | 1250 |
        S  | R3 | 750 | 1250 | 1500 |
        */
        
        //Declare a 2D array of size 12 (4 Rows & 3 Columns)
        int[][] rental =
        {
            {400, 800, 1000},  //Floor 1
            {550, 950, 1100},  //Floor 2
            {600, 1000, 1250}, //Floor 3
            {750, 1250, 1500}  //Floor 4
        };
        
        //We are looking for 2 variables 
        String userEntry;
        int floors;
        int bedrooms;
        
        //Prompt to the user to request floor & bedroom choice
        userEntry = JOptionPane.showInputDialog("Enter which floor you would like to rent on (1-4):");
        //Convert the string input to an integer
        floors = Integer.parseInt(userEntry);
        
        userEntry = JOptionPane.showInputDialog("How many bedrooms would you like to rent (1-3):");
        //Convert the string input to an integer
        bedrooms = Integer.parseInt(userEntry);
        
        //Access the combined Row & Column choice & display the result back
        JOptionPane.showMessageDialog(null, "The rent on for a " 
                + bedrooms 
                + " bedrooms apartment of floor " 
                + floors 
                + " is R "
                + rental[floors-1][bedrooms-1]);
    }
}
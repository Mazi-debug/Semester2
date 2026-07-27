/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owethu
 */



public class Cinema 
{
    //create a 2D array that will be 3x4
    
    /*
    Small cinema has 3 rows of seats & 4 seats per row
    Each seat stores one of the following values:
    A: Available
    B: Booked

    */
    
    /*dataType[][] arrayName = {{},
                                {},
                                    };
    */
    
    //Method that will return the 2D Array
    public char [][] creatingSeatingPlan()
    {
        char[][] seats =
        {
            {'A','B','A','A'},  
            {'B','B','A','A'},  
            {'A','A','A','B'}   
        };
        
        return seats;
    }
    
    //Method that receives a 2D array - count of booked seats
    public int countBookedSeats(char [][] seats)
    {
        int booked = 0; //accumulator variable
        
        //outer loop: looka at the row of 2D array
        for(int row = 0; row < seats.length; row++)
        {
            //inner loop
            for(int column = 0; column < seats[row].length; column++)
            {
                if(seats[row][column] == 'B')
                {
                    booked++;
                }
            }
        }
        
        return booked;
    }
    
    //Method that will diplay the seating plan (this method will receive the 2D array)
    public void displaySeatingPlan (char [][] seats)
    {
        System.out.println("CINEMA SEATING PLAN");
        System.out.println("---------------------------");
        
        //create the loop structure that will display the seating plan
        for(int row = 0; row < seats.length; row++)
        {
            //inner loop
            for(int column = 0; column < seats[row].length; column++)
            {
                System.out.print(seats[row][column] + " ");
            }
            System.out.println();
        }
    }
    
    /*
    1. Method Signature:accessType ReturnType MethodName(parameter)
    2.Method Body
    3.Return from the method: return variable;
    */
}

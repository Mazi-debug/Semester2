/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owethu
 */

//Demo of using 2D Arrys within methods

/*
Small cinema has 3 rows of seats & 4 seats per row
Each seat stores one of the following values:
A: Available
B: Booked

Create a program that generates the seating plan with the use of 
methods & display the plan
*/
public class CinemaApp 
{
    public static void main(String[] args) 
    {
        //create an object from the cinema class
        //ClassName objectName = new ClassName();
        Cinema cinema = new Cinema();
        
        //receive the 2D array from a method
        char[][] seatingPlan = cinema.creatingSeatingPlan();
        
        //pass the 2D array to the methods
        cinema.displaySeatingPlan(seatingPlan);
        
        int bookedSeats = cinema.countBookedSeats(seatingPlan);
        
        System.out.println("\nBooked Seats: " + bookedSeats);
        
    }
}

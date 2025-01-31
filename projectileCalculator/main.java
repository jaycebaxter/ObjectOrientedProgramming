// Program:       projectileCalculator
// Author:        Jayce Baxter
// Date:          January 31st, 2025
// Description:   Calculates the x and y coordinates of a projectile after
//                a set amount of time


// Importing necessary tools
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class main{
    public static void main(String [] args){

        // Setting gravitational force as a constant with a value of 9.8
        final double gravForce = 9.8;

        // Prompting the user for the initial speed of the projectile
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the initial speed of the projectile in meters/second: ");
    	  
        // Setting it to absolute value so that the program does not return negatives
        double initialSpeed = Math.abs(userInput.nextDouble());
        // double initialSpeed = Math.abs(initialSpeed);

        // Prompting the user for the initial angle of the projectile 
        System.out.print("Please enter the initial angle of the projectile in degrees: ");

        // Setting the angle to an absolute value so that it does not accept negatives
        // Also converting to radians because it's compatible with SIN and COS
        double initialAngle = Math.abs(userInput.nextDouble());
        // double initialAngle = Math.abs(initialAngle);
        double angleRadians = Math.toRadians(initialAngle);
        double angleCOS = Math.cos(angleRadians);
        double angleSIN = Math.sin(angleRadians);

        // Prompting the user for flight time
        System.out.print("Please enter the flight time of the projectile in seconds: ");
        double flightTime = Math.abs(userInput.nextDouble());

        // Setting to absolute value so the program does not accept negatives
        // double flightTime = Math.abs(flightTime);

        // Calculating the x and y coordinate
        double xCoordinate = (initialSpeed * angleCOS) * flightTime;
        double yCoordinate = (initialSpeed * angleSIN) * flightTime - 0.5 * gravForce * flightTime * flightTime;

        // Rounding to 3 decimal places
        // I stole this https://www.geeksforgeeks.org/java-program-to-round-a-number-to-n-decimal-places/
        DecimalFormat roundedDecimal = new DecimalFormat("#.##");
        System.out.println("With a flight time of " + flightTime + ", the x coordinate will be " + roundedDecimal.format(xCoordinate) + " and the y coordinate will be " + roundedDecimal.format(yCoordinate));
    }
}

import java.util.Scanner;
import java.lang.Math;

public class main{
    public static void main(String [] args){
        final double gravForce = 9.8;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the initial speed of the projectile: ");
    	  
        // Initial speed will be in meters per second  
        double initialSpeed = userInput.nextDouble();
        
        // Initial angle is in degrees
        System.out.print("Please enter the initial angle of the projectile: ");
        double initialAngle = userInput.nextDouble();
        double angleCOS = Math.cos(initialAngle);
        double angleSIN = Math.sin(initialAngle);

        // Flight time is in seconds
        System.out.print("Please enter the flight time of the projectile: ");
        double flightTime = userInput.nextDouble();

        double xCoordinate = (initialSpeed * angleCOS) * flightTime;
        double yCoordinate = (initialSpeed * angleSIN) * flightTime - 0.5 * gravForce * flightTime * flightTime;

        System.out.println("With a flight time of " + flightTime + ", the x coordinate will be " + xCoordinate + "and the y coordinate will be " + yCoordinate);
    }
}

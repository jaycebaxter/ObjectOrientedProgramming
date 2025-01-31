import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class main{
    public static void main(String [] args){
        final double gravForce = 9.8;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the initial speed of the projectile in meters/second: ");
    	  
        // Initial speed will be in meters per second  
        double initialSpeed = userInput.nextDouble();
        
        // Initial angle is in degrees
        System.out.print("Please enter the initial angle of the projectile in degrees: ");
        double initialAngle = userInput.nextDouble();
        double angleRadians = Math.toRadians(initialAngle);
        double angleCOS = Math.cos(angleRadians);
        double angleSIN = Math.sin(angleRadians);

        // Flight time is in seconds
        System.out.print("Please enter the flight time of the projectile in seconds: ");
        double flightTime = userInput.nextDouble();

        double xCoordinate = (initialSpeed * angleCOS) * flightTime;
        double yCoordinate = (initialSpeed * angleSIN) * flightTime - 0.5 * gravForce * flightTime * flightTime;

        // I stole this https://www.geeksforgeeks.org/java-program-to-round-a-number-to-n-decimal-places/
        DecimalFormat roundedDecimal = new DecimalFormat("#.###");
        System.out.println("With a flight time of " + flightTime + ", the x coordinate will be " + roundedDecimal.format(xCoordinate) + " and the y coordinate will be " + roundedDecimal.format(yCoordinate));
    }
}

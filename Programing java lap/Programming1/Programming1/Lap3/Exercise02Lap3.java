/*
Exercise02. Given an airplane’s acceleration a and take-off speed v, you can compute
the minimum runway length needed for an airplane to take off using the following
formula:
Write a Java program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length. 
 */

import java.util.Scanner;

public class Exercise02Lap3{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = (speed * speed) / (2 * acceleration);
    
        System.out.printf("The minimum runway length for this airplane is %.2f\n", length);
    }

}
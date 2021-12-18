/*
Homework01. Write a Java program that prompts the user to enter the seconds as a
String (e.g., “1500500500”), converts the received value to long, and displays the
number of years and days for the received seconds. For simplicity, assume a year has
365 days.
 */
import java.util.Scanner;

public class Homework01Lap3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
        System.out.println("Enter the number of seconds:");
        long number =input.nextLong();
        long c= Long.valueOf(number);
        long year =c/315360000;
        long days=(c%315360000)/86400;
        System.out.println("'"+number+""+"second is aproximately"+"'"+year+"'"+"years"+"and"+"'"+days+"'"+"days");
    }
}
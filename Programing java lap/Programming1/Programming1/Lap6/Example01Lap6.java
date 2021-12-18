/**Example01. Write a Java program that prompts the user to enter a positive integer in 
order to print the multiplication table of that number.  */
import java.util.Scanner;
public class Example01Lap6{
  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
         
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();
                 
          System.out.println("The multiplication table of " + number);
         
        for(int i=1; i<=10; i++)
        {
          System.out.println(number +" x " + i + " = "  + (number * i) );
        }
    }  
}
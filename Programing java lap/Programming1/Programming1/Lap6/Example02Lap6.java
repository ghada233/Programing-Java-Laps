/**Example02. Write a Java program that uses a do-while statement to find the factorial 
value of any positive integer received from the user, and the program will be terminated 
only if the user entered 999 */
import java.util.Scanner;
public class Example02Lap6{
  public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int userInput;  
        int factorial;
        int i;
         
        do
        {
            System.out.print("Enter a positive integer: ");
            userInput = input.nextInt();
             
            if(userInput == 999)
            {
    System.out.println("The program will be terminated...\n"
                +"Good Bye...");
                System.exit(0);
            }
            factorial=1;
            i=1;
            while(i<=userInput)
            {
                factorial *= i;
                 
                i++;
            }
             
            System.out.println("The factorial of  "
            + userInput
            + " = " + factorial);
             
        }while(userInput != 999);
         
    }
}
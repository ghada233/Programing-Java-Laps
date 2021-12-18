package lab04;
import java.util.Scanner;

public class Exercise1 {
	public Exercise1() {
		
	}


	public static void main(String[] args) {
		System.out.println("Program To Sum Two Numbers : ");
		Scanner number = new Scanner(System.in);
		int number1 ;
		int number2 ;
		
		while(true) {
	                   
	            try {
	            	System.out.println("Enter The First Number : ");
	            	number1 = number.nextInt();
	            	System.out.println("Enter The Second Number : ");
	            	number2 = number.nextInt();
	          
	            			break;
	                
	            } 
	            catch (java.util.InputMismatchException ime) {
	               System.out.println("You Must Enter Two Numbers !");
	               number.nextLine(); 
	            }
	           
	            
	       } 
		 System.out.println("The Sum of Two Numbers Is : " + ( number1 + number2) );
         
		 
	  
			
	    }
		

	}



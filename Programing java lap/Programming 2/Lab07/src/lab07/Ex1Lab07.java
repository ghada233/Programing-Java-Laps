package lab07;
import java.util.Scanner;

public class Ex1Lab07 {
	public static int countdown(int n) {
		
	    if (n > 0) {
	    	
	    	System.out.println(n);
	    	return countdown(n - 1) ;
	    } 
	    else {
	        return 0 ;
	      }
	}


	public Ex1Lab07() {
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = input.nextInt();
		System.out.println("The Countdown For The Number Is : ");
		countdown(n);

	}

}

package lab07;
import java.util.Scanner;


public class Ex2Lab07 {
	
	public static void reverseDisplay(int value) {
		if (value <= 0) 
			return;
		else {
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
			}
	
	public Ex2Lab07() {
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter An Integer : ");
		int i = input.nextInt();
		System.out.println("The Reverse Display Of " + i + " Is :  ");
		reverseDisplay(i);
		

	}
	

}

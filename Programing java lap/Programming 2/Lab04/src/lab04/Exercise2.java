package lab04;

import java.util.Scanner;

public class Exercise2 {

	public Exercise2() {
		
	}
	
		
		

	public static void main(String[] args) {

	        int[] array = new int[100];
	        for (int a = 1; a < array.length; a++) {
	            array[a] = (int) (Math.random() * 100);
	        }
	        Scanner input = new Scanner(System.in);
	        System.out.print(" Enter The Index Of An Array : ");
	        try {
	            int index = input.nextInt();
	            System.out.println(" The Corresponding Index Value Is : " + array[index]);
	        }
	        catch (ArrayIndexOutOfBoundsException ex) {
	            System.out.println(" Out of Bounds ! ");
	        } 
	    }
	}

	
	

	



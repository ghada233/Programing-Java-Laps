package lab06;

import java.io.*;

public class Lab06

{
	public static void main(String[] args) {
	try (
			      PrintWriter numbers = new PrintWriter(new FileOutputStream(new File("Lab06.txt"), true));
		) 
				{
			      for (int a = 0; a <= 100; a++) {
			       
			    	  numbers.print( (int) (Math.random() * 100) + "  " );
			      }
			    } 
			    catch (FileNotFoundException print) {
			    
			    	System.out.println(" Can't Create a Text File ");
			      
			    	print.printStackTrace();
			     }

										  }
}
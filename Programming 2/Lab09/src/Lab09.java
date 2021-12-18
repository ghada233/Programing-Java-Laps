import java.io.*;

import java.util.Scanner;

public class Lab09 {

    public static void main(String[] args) {
    	
    	System.out.println("The Program Displays The Number Of Vowels And Consonants In The File:  ");
    	
    	 Scanner input = new Scanner(System.in);
    	 
         System.out.print("Enter The File Name: ");
         
         String filename = input.nextLine();
         
         File file = new File(filename);
    	
        
        try {
        	
            Scanner scan = new Scanner(file);
            
            int c = 0;
            int v = 0;
            char ch;
           
            
            while(scan.hasNextLine()) {
            	
               String l = scan.nextLine();
                
                for(int a = 0; a < l.length(); ++a) {
                	
                    ch = l.charAt(a);
                    
                    if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'|| ch == 'I' || ch == 'o' || ch == 'O' || 
                    		ch == 'u'||ch == 'U' )
                    	
                    {
                    	++v;
                    }
                    
                    else {
                    	
                        ++c;
                        
                    }
                }
            }
            
            System.out.println(" The Number Of Vowels Is " + v);
            
            System.out.println(" The Number Of Consonants Is " + c);
            
            scan.close();
        } 
        
        catch (FileNotFoundException a) {
        	
            System.out.println("Can't Read The File " + file.getAbsolutePath());
        }
    }
    
}


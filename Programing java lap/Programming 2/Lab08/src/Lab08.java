import java.util.*;

import java.io.*;


public class Lab08 {
   
	public static void main(String[] args) throws FileNotFoundException {

    	File f = new File("/Users/alaqilah/Documents/Lab08/src/file.txt");
    	
    	try (Scanner s = new Scanner(f)) {
			
    		ArrayList<String> ws = new ArrayList<String>();
      
			while (s.hasNext()) {
			   
				String w = s.next();
			   
				if (Character.isLetter(w.charAt(0))) {

			        if (!ws.contains(w)) {
			            ws.add(w);
			        }
			    }
			}
			
			Collections.sort(ws);
			
			for (int a = 0; a < ws.size(); ++a) {
				
			    System.out.println(ws.get(a));
			}
			s.close();
		}

    }
}
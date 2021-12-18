/**Example01. Write a Java program that uses a for statement to sum the even integers 
from 5 to 35 and store the result in an integer variable called total.  */
public class Example01Lap7{
    public static void main(String[] args)
    {
      int total=0;
      for(int i=5; i<=35; i++)
          total+=i;
      System.out.println("The total is "+total);
    }
  }  
  
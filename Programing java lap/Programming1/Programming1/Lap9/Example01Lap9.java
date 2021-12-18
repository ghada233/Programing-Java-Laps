/*Example01. Write Java program to show the value of x variable before and after passing 
a value to increment(int n) function*/
public class Example01Lap9 {
    public static void increment(int n) {  
      n++;
      System.out.println(" inside the method is " + n);
    }
      
    public static void main(String[] args) {
      int x = 1;
      System.out.println("Before the call, x is " + x);
      increment(x);
      System.out.println("After the call, x is " + x);
    }  
    } 
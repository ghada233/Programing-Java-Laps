/**Example03. Write Java program to define and call myMethod(int firstNumber, int 
secondNumber) function with a return value, where myMethod(int firstNumber, 
int secondNumber) function returns the sum of firstNumber and secondNumber 
parameters: */

public class Example03Lap8{
   
    public static void main(String[] args) {
      System.out.println(myMethod(4, 6));
    }
    static int myMethod(int firstNumber, int secondNumber) { 
        return firstNumber + secondNumber;
    }
  }
/**Example02. Write Java program to create two functions named max. The first max(int
num1, int num2) finds the maximum integer between two integer number, and the 
second max(double num1, double num2) finds the maximum double between two 
double numbers */
public class Example02Lap9 {
    public static void main(String[] args) {
    int num1 =0;
    int num2 =1;
    System.out.println("The max of 3 and 4 is "+ max(3, 4));
    System.out.println("The max of 9.45 and 2.9 is " + max(9.45, 2.9));
    }
       
    public static int max(int num1, int num2) {
    if (num1 > num2) return num1;
    else
    return num2;
    }
    public static double max(double num1, double num2) {
    if (num1 > num2) return num1;
    else
      return num2;
    }
    }
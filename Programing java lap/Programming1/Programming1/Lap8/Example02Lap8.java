/**Example02. Write Java program to define void myMethod() function with a 
single formal parameter ‘fname’, where myMethod(String fname) function print a 
string. Call myMethod() function with a single actual parameter “Muhammad”  */

public class Example02Lap8 {
   
    public static void main(String[] args) {
      myMethod("Muhammad");
    }
    static void myMethod(String fname) {
        System.out.println(fname + " Al-Ali");
      }
  }
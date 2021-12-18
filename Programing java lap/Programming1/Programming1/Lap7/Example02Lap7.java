/**Example02. Write a Java program that uses nested for loops to display a specific 
pattern */
public class Example02Lap7{
    public static void main(String[] args)
    {
       int number=16;
      for(int i=5; i>=1; i--)
          {
              for(int j=1; j<=i; j++)
              {
                  number=number - 1;
                  System.out.printf("%-3d", number);
              }
              System.out.println();
          }   
    }
  }
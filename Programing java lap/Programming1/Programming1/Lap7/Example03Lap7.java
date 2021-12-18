/**Example03. Write a Java program that uses a continue statement to find the sum of 
odd integers only, and uses a break statement to end the loop if the sum is greater than 
500.  */
public class Example03Lap7{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=1; i<=1000; i++)
        {
            if(i % 2 == 0)
              continue;
              
            sum += i;
           if(sum > 500)
             break;
       }
       System.out.println("Sum = "+ sum);
    }
  }
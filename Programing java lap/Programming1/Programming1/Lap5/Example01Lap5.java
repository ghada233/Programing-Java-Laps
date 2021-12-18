/**
 Example01. Write a Java program that asks the user to enter three integers and then 
 displays the largest one.
 راح نكتب برنامج نسأل المستخدم انه يدخل اعداد صحيحه ونطبع الاكبر 
 */
import java.util.Scanner;
public class Example01Lap5{
  public static void main(String[] args)
    {
        int number1, number2, number3;  
        int largestOne;
        Scanner input = new Scanner(System.in);
              /* 
        اسمح للمستخدم بأخذ بيانات بإستخدام الدالة التاليه
        -
        Scanner :استخدام كلاس معرف من قبل جافا 
        -
        input :عبارة عن كائن (object)
        -
        new Scanner(System.in):الجملة الاساسية للاستدعاء من كلاس سكنراللي هوالماسح الضوئي 
        -
        (System.in):لاستدعاء باستخدام انواع البيانات اللي هيا التالي 
        int /double /foult 
        -
        لازم نسوي استيرادعشان نستدعيها وبالأخص 
        (import ):import java.util.Scanner;
        -
        import :عباره عن مكتبة تصريح للدخول اليها للاستفادة من الخصائص 
        -
        Scanner:أخذالقيمه  من المستخدم 
        -
        import java.util *:مكتبة تصريح دخول كل المكتبات في جافا
        */ 

        System.out.print("Enter the first integer: ");// جملة الطباعه نخلي المستخدم يدخل الرقم الاول 
        number1 = input.nextInt();
         //.nextInt()راح يدخل القيمه من نوع انتجر (0) وعرفت القيمه الرقم الصحيح والمدخل اللي عرفناه بالماسح الضوئي 
        System.out.print("Enter the second integer: ");// جملة الطباعه نخلي المستخدم يدخل الرقم الثاني 
        number2 = input.nextInt();//.nextInt()راح يدخل القيمه من نوع انتجر (0) وعرفت القيمه الرقم الصحيح والمدخل اللي عرفناه بالماسح الضوئ
        System.out.print("Enter the third integer: ");// جملة الطباعه نخلي المستخدم يدخل الرقم الثالث 
        number3 = input.nextInt();//.nextInt()راح يدخل القيمه من نوع انتجر (0) وعرفت القيمه الرقم الصحيح والمدخل اللي عرفناه بالماسح الضوئي
        
        if ( (number1 > number2) && (number1 > number3) )//ندخل بالشرط اذا كان الرقم الول اكبر من الثاني وكمان اكبر من الثالث اذا الرقم الكبير الاول 
        {
            largestOne = number1;
        }
        else if (number2 > number3)//اما اذا كان الرقم الثاني اكبر من الثالث معناتوا الثاني اكبر 
        {
            largestOne = number2;
        }
        else//غبر كذا الثالث اكبر 
        {
            largestOne = number3;  }
            System.out.println("The largest integer is "  + largestOne);//جملة الطباعه الرقم الاكبر 
        }   
    }  

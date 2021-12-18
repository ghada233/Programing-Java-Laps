/**Example01. Write a Java program that converts a Fahrenheit degree to Celsius  */

import java.util.Scanner;

public class Example01Lap3 {

   
    public static void main(String[] args) {
        

       /*مع الشرح   java البرنامج على ال */


         //1:شرح السطر الاول 
        Scanner input = new Scanner(System.in);  
        /* 1
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
        

        System.out.print("Input a degree in Fahrenheit: ");//جملة طباعه للمستخدم عشان يخل القيمه 
        
        double fahrenheit = input.nextDouble();// .nextDouble()راح يدخل القيمه من نوع دبل (0.0) وعرفت القيمه فهرنهايت والمدخل اللي عرفناه بالماسح الضوئي 

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);//برضوا القيمة دبل هنا بالسليلوز عرفنها واعطينها القانون 
        
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        //بجملة الطباعة راح يطبع القيمه الخاصة ب الفهرنهايت ويخبرنا انها مساويه لقيمة السيلوز ويطبع قيمتها ب السليلوز 
       //جملة الطباعة القيمة والتوقف 
    }
    
}
/*Exercise01. Write a Java program that reads an integer between 0 and 1000 and adds
all the digits in the integer. For example, if an integer is 932, the sum of all its digits is
14. Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93. */

import java.util.Scanner;

public class Exercise01Lap3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Create new Scanner object
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

		//let user  enter a number between 0 and 1000.
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
         //.nextInt()راح يدخل القيمه من نوع انتجر (0) وعرفت القيمه الرقم الصحيح والمدخل اللي عرفناه بالماسح الضوئي 

		// Compute the sum of the digits in the integer.
		int lessThan10 = number % 10;		// Extract the digit less than 10
		number /= 10;							// Remove the extracted digit
		int tens = number % 10;				// Extract the digit between 10 to 99
		number /= 10;							// Remove the extracted digit
		int hundreds = number % 10;		// Extract the digit between 100 to 999
		number /= 10;							// Remove the extracted digit
		int sum = hundreds + tens + lessThan10;	

		// Display results
		System.out.println("The sum of the digits is " + sum);
	}
}
/*Exercise01. Write a Java program that prompts the user to enter a three-digit integer 
and determines whether it is a palindrome number. A number is palindrome if it reads 
the same from right to left and from left to right. 
راح نخلي المستخدم يدخل 3 ارقام متتالية وبعدين نشيك اذا هيا متناظرة 
اي يقراء من اليمين الى اليسار نفس الشيء من اليسار الى اليمين
 */
import java.util.Scanner;

public class Exercise01Lap5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// let user  enter a three-digit integer
		System.out.print("Enter a three-digit integer: ");//جملة طباعه لثلاث ارقام صحيحه 
		int number = input.nextInt();
        //.nextInt()راح يدخل القيمه من نوع انتجر (0) وعرفت القيمه الرقم الصحيح والمدخل اللي عرفناه بالماسح الضوئي 
	
        // Test for palindrome راح نختبر التناظر 
		int digit1 = (int)(number / 100);
		int remaining = number % 100;
		int digit3 = (int)(remaining % 10);

		// Display result
		System.out.println(
			number + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
	}
}
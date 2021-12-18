/*
  Example02. Write a Java program that prompts the user to enter a grade. Your program 
should display the corresponding meaning of that grade using a switch statement.
راح نكتب برنامج يخلي المستخدم يدخل الدرجات ويطبع وصف القيمه ب استخدام التبديل 
 */
import java.util.Scanner;
public class Example02Lap5{
  public static void main(String[] args)
    {
        char userGrade; //عرفنا قيمه الحرف  
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
        System.out.print("Enter a grade: ");//يدخل الدرجه 
        userGrade = input.next().charAt(0);//يعرف انه القيمه حرف 
        switch (userGrade)//راح نغير بناء على الحرف المطبوع
        {
        case 'A'://راح تنطبع الجملهA اذا كانت 
           System.out.println("\'A\' grade <==> Excellent");
            break;//ونوقف
        case 'B'://راح تنطبع الجملهB اذا كانت
            System.out.println("\'B\' grade <==> Good");
            break;
        case 'C':
            System.out.println("\'C\' grade <==> Average");
            break;
        case 'D':
           System.out.println("\'D\' grade <==> Deficient");
            break;
        case 'F':
            System.out.println("\'F\' grade <==> Failing");
            break;
        default://Invalid gradeاذا دخلنا احد الحروف غير القيم دي راح تنطبع ال 
            System.out.println("Invalid grade");
        }
    }
}
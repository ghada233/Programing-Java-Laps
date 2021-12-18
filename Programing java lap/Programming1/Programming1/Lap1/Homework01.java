
//written by ghada 


/*Homework01. الواجب 
Please do the following: اتباعا للخطوات التالية 

 a-) Write a pseudocode that receives a positive number from the user, and then,
 starts printing and keep printing the word “CS” until the number of the printings
 matches the received number from the user.
 ناخذ قيمة من المستخدم تكون موجبة 
نفس عددالرقم اللي دخله المستخدم  CS وبعدين نطبع 
 b-) Write an algorithm for the same problem.
 نكتب خوارزمية 
 c-) Draw a flowchart for the same problem. 
 نرسم العمليات 
 
 */

package Programming1;
import java.util.Scanner;

public class Homework01{
    public static void main(String[] args) {
        
        System.out.print("Input a postiv number: ");//جملة طباعه للمستخدم عشان يخل القيمه
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
        
        int PostiveNumber = input.nextInt();
        //.nextInt()راح يدخل القيمه من نوع انتجر (0) وعرفت القيمه الرقم الصحيح والمدخل اللي عرفناه بالماسح الضوئي 
       for(int i=PostiveNumber; i>=1;i--)
       {
           /*استخدمنا لوب عشان نعطيه قيمة اللي دخلها المستخدم ويتاكد من انها عدد صحيح من خلال الشرط 
           i>=1 
          CS وبعدين يخل ويطبع جملة ال 
          ونطرح القيمة اللي استخمناها ونرجع نكرر العملية في اللوب الا ان تنتهي ويخرج منها 

           */
       System.out.println(  " CS ");}
    }
}
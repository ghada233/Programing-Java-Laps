//written by ghada 
//Algorithms, Pseudocodes and Flowcharts
package Programming1;
import java.util.Scanner;

public class Lap1 {

   
    public static void main(String[] args) {
        
         //نكتب الحل بالطريقتين 
        //الطريقة الاولى راح اكتب الحل الكود المزيف
       //Example01
       
      /* First a)
      A:
           Write a pseudocode to convert a temperature from Fahrenheit (℉)to Celsius (℃)
       راح نكتب كود مزيف نحول فيه درجة الحراره من الفهرينهايت الى السيليوز       
                    
                   
1=> Input a temperature in Fahrenheit  ندخل اول شيء درجة الحراة بالفهرينهايت
2=> Calculate temperature with formula C=5/9*(F-32) نحسب درجة الحراره باستخدام القانون الواضح
3=> Print C نرجع او نطبع قيمة السليلوز 

       Pseudocode (remember this is not the only solution) 
       لازم تعرفي انه هذي طريقتي بالحل وهو  مو الحل الوحيد 

               Fahrenheit_Celsius_conversion تحويل الفهرينهايت والسليوز 
       
       /////////////////////////////////////////////////////////////////////////////////////////////
       Second  b)
        Write an algorithm for the same problemنكتب خوارزمية 
       B:
       Step1 Start البداية

       Step2 Read the input of temperature in Fahrenheit (say F)نقراء القيمة المدخلة

       Step3 C=5/9*(F-32)نستعمل القانون

       Step4 Print temperature in Celsius is C نرجع القيمة بالسليلوز

       Step5 Stop انتهاء البرنامج 
       
       /////////////////////////////////////////////////////////////////////////////////////////////
        third   c)
        
        Draw a flowchart for the same problem نرسم 
       C:
       Flowcharts: Start----> input F----->C=5/9*(F-32)----> print C ---->Stop من فهرينهايت الى السليلوز 
       Flowcharts: Start----> input C----->F=(9*C)/5+32----> print F ---->Stop  من السليلوز الى فهرينهايت
      ////////////////////////////////////////////////////////////////////////////////////////////////
*/
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
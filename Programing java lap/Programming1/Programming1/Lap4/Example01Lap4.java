/*Example01. Write a Java program that calculates the amount of paint needed to paint
the walls and the ceiling of a room. Your program should ask the user to provide the
values of length, width, and height of the room. Assuming that the room has doors
and windows but they don't need painting. Also the floor in the room will not be
painted. Ask the user to enter the number of doors and number of windows in the
room, and adjust the total square feet to be painted accordingly. Assume that each door
is 20 square feet and each window is 15 square feet. Suppose the paint covers 350
square feet per gallon.*/
import java.util.Scanner;
public class Example01Lap4{
  public static void main(String[] args)
    {
        double roomLength, roomWidth, roomHeight;//انشئت المتغيرات اللي راح نتعامل معاها من نوع دبل 
        int roomDoors, roomWindows;// عرفنا المتغيرات اللي نحتاجها بقيمة انتجر لانها ارقام صحيحه من الابواب والنوافذ ما عمره كان في نافذه ونص  
         
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
        System.out.print("Enter the length: ");//جملة طباعه ليدخل قيمة الطول 
        roomLength = input.nextDouble();//ادخلنا الطول بقيمة دبل 
  
        System.out.print("Enter the width: ");//ادخلنا الوزن 
        roomWidth = input.nextDouble();
         
        System.out.print("Enter the height: ");//ادخل الارتفاع 
        roomHeight = input.nextDouble();
         
        System.out.print("Enter the number of doors: ");//عدد الابواب 
        roomDoors = input.nextInt();
         
        System.out.print("Enter the number of windows: ");//عدد النوافذ 
        roomWindows = input.nextInt();

        double totalSurfaceArea = 2 *(roomLength * roomWidth   + roomLength * roomHeight   + roomWidth * roomHeight);//عدد الاسصح 
        double floorArea = roomLength * roomWidth;
         
        int doorsArea = 20 * roomDoors;
         
        int windowsArea = 15 * roomWindows;
         
        double totalPaintArea = totalSurfaceArea -floorArea - doorsArea - windowsArea;
         
        double requiredPaint = totalPaintArea / 350;
        System.out.println("Paint required = "+ requiredPaint + " gallons");
    
    }   
}
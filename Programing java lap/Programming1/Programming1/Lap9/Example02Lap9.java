/**Example02. Write Java program to create two functions named max. The first max(int
num1, int num2) finds the maximum integer between two integer number, and the 
second max(double num1, double num2) finds the maximum double between two 
double numbers */
public class Example02Lap9 {
    public static void main(String[] args) {
    System.out.println("The max of 6 and 3 is "+ max(6,3));//راح احسب التالي القيمة الصحيحة الاكبر 
    System.out.println("The max of 10.25 and 27.5 is " + max(10.25, 27.5));//راح احسب القيمة الدبل الاكبر 
    }
       
    public static int max(int num1, int num2) {//راح ادخل ب الميثود الرقمين اللي استدهينها من المين 
    if (num1 > num2)//نشوف الرقم الاول اكبر نرجع القيمة الاولى او اذا ما تحقق الشرط نرجع القيمة الثانية 
     return num1;//
    else
    return num2;
    }
    public static double max(double num1, double num2) {//راح ادخل ب الميثود الرقمين اللي استدهينها من المين 
    if (num1 > num2) //نشوف الرقم الاول اكبر نرجع القيمة الاولى او اذا ما تحقق الشرط نرجع القيمة الثانية 
    return num1;
    else
      return num2;
    }
    }
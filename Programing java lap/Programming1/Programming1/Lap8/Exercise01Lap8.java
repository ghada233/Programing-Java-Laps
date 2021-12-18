/**Exercise01. Write a class that contains the following two methods: 
x public static double footToMeter(double foot) Convert from feet to meters 
x public static double meterToFoot(double meter)  Convert from meters to 
feet  
Where the formula for the conversion is 1 meter = 0.305 * foot, and 1 foot = 3.279 * 
meter. Consider the following values feets (1.0, 2.0, 3.0) and meters (20.0, 21.0, 22.0):  */

//writing by ghada
public class Exercise01Lap8{
public static void main(String[] args) {
    System.out.println( footToMeter(1.0));
    System.out.println( footToMeter(2.0));
    System.out.println( footToMeter(3.0));
    System.out.println( meterToFoot(20.0));
    System.out.println( meterToFoot(21.0));
    System.out.println( meterToFoot(22.0));
}
public static double footToMeter(double foot){
    return 0.305 * foot;
}
public static double meterToFoot(double meter){
    return 3.279 *  meter;
}
}

import java.util.Scanner;
public class TestRectangle {
  static int Rectangle(int width, int heigh) {
    return width * heigh;
  }

  public static void main(String[] args) {
    System.out.println("Alaqilah Alqasir - 4153692 - IS3 "); 
    System.out.println("Rectangle Area : "); 
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the width: ");
        int w = a.nextInt();
        System.out.println("Enter the height:  ");
        int h = a.nextInt();
        System.out.println("The area is : " + Rectangle(w,h));
  }
}
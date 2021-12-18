package lab05;
import java.util.Scanner;
public class TestTriangle {


	public static void main(String[] args) {
		System.out.println("Enter Three Sides Of a Triangle :");
        Scanner input = new Scanner(System.in);
       
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.println("Enter The Color Of Triangle :  ");
        String color = input.next();
        System.out.println("Is The Triangle Filled (true or false)? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(s1 , s2 , s3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        System.out.println("The Sides Are : "  + triangle.toString());
        System.out.println("The Triangle Area Is : "  + triangle.getArea());
        System.out.println("The Triangle Perimeter Is :" + triangle.getPerimeter());
        System.out.println("The Triangle Color Is : " + triangle.getColor());
        System.out.println("Is The Triangle Filled ? " + triangle.isFilled());		
	}
}

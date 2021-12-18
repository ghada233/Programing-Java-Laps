package lab05;

public class Triangle extends GeometricObject {
	private double side1 ;
    private double side2 ;
    private double side3 ;

    Triangle() {

    }

    Triangle (double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        return side1 + side2 + side3 / 2;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "side one = " + side1 +" , "+ " side two = " + side2 +" , "+ " side three = " + side3;
    }
}
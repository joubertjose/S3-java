package javalabes;


class Shape{
	public int area(int side) {
		System.out.println("I am a Square");
	return side*side;
	}
	public int area(int l,int b) {
		System.out.println("I am a Rectangle");
	return l*b;
	}
	public double area(double radius) {
		System.out.println("I am a Circle");
	return 3.14*(radius)*(radius);
	}
	public double area(double l,double b) {
		System.out.println("I am a Triangle");
	return 0.5*l*b;
	}
public class polymorphism {

	public static void main(String[] args) {
			Shape Shape=new Shape();
			int rectangleArea = Shape.area(4,5);
			System.out.println("Area of rectangle;"+rectangleArea);
			int squareArea = Shape.area(4);
			System.out.println("Area of square;"+squareArea);
			double circleArea = Shape.area(4.5f);
			System.out.println("Area of circle;"+circleArea);
		}
	}
}	
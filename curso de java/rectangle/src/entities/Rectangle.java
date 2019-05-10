package entities;

public class Rectangle {

	public double widht;
	public double height;
	
	public double area() {
		return	widht * height;	
	}
	
	public double perimeter() {
		return (widht * 2) + (height * 2);				
	}
	
	public double diagonal() {;
		return Math.hypot(widht, height);
	}
	
	public String toString() {
		return "Area = "
			+ String.format("%.2f\n", area())
			+ "Perimeter = "
			+ String.format("%.2f\n", perimeter())
			+ "Diagonal = "
			+ String.format("%.2f", diagonal());
	}
}

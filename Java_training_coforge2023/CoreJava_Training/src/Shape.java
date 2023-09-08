
public class Shape {

	public String shape = "Shape";
	
	void draw() {
		System.out.println("Draw shape");
	}
	
	void area() {
		System.out.println("Area method");
	}
	
}

class Square extends Shape{
	// Square is-a Shape(relationship)
	void preimeter() {
		System.out.println("2x(a)");
	}
	
}

class Rectangle extends Shape{
	// Rectangle is-a Shape(relationship)
	void info() {
		System.out.println("Opposite sides of a rectangle have equal length ");
	}
	
}

// Abstract class
abstract public class MyShape {

	abstract void draw();
	
}

class MyCircle extends MyShape{
	@Override
	void draw() {
		System.out.println("This is a circle");
	}
}

class MyRectangle extends MyShape{
	@Override
	void draw() {
		System.out.println("This is a reactangle");
	}
}

class MyShapeMain{
	
	public static void main(String[] args) {
		
		// MyShape m1 = new MyShape(); Can't instantiate abstract class
		MyCircle c1 = new MyCircle();
		MyRectangle r1 = new MyRectangle();
		
		c1.draw();
		r1.draw();
		
		//c1 = (MyCircle)r1; Can't cast from rectangle to circle
	}
	
}

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape rect = new Rectangle();// OR Rectangle rect = new Rectangle();
		
		Square sq = new Square();// OR Shape sq = new Square();
		
		System.out.println("Shape is "+ rect.shape);
		rect.area();
		rect.draw();
		//rect.info(); //Error 'cause we are using it as a shape object which doesn't have properties of subclass Rectangle
		
		System.out.println("Shape is "+ sq.shape);
		sq.area();
		sq.draw();
		sq.preimeter(); //No error 'cause we are using it as square object which does have properties of subclass square and parent
						//class Shape
		
	}
	
}

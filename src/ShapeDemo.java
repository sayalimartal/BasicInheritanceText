//Create objects of various classes that inherit Shape class and draw those shapes
public class ShapeDemo {
	public static void main(String[] args) {
		
		Circle circle=new Circle();
		circle.draw(); //Drawing circle
		
		Polygon polygon=new Polygon();
		polygon.draw(); //Drawing polygon
		
		Rectangle rectangle=new Rectangle();
		rectangle.draw(); //Drawing rectangle
		
	}
}

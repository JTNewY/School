package Day08.EX02_Shape;

public class Circle extends Shape{

	double radius;

	public Circle() {
		
	}

	public Circle(double radius) {
		
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return  Math.PI*radius* radius ;
	}

	@Override
	double round() {
		// TODO Auto-generated method stub
		return 2* radius*Math.PI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}

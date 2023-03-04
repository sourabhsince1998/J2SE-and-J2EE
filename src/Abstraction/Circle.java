package Abstraction;

public class Circle extends Shape
{
double radius;
	


	public Circle(String color, double radius) {
	super(color);
	this.radius = radius;
}



	public void area() {
		System.out.println("circle radius "+radius);
		// TODO Auto-generated method stub
		
	}
	
	

	
}

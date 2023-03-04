package Abstraction;

public class Rectangle extends Shape
{
	double length;
	double width;


	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}


	public void area() {
		System.out.println("rectangle length is " +length + "width is"+ width);
		
	}
	

}

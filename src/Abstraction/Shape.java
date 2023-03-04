package Abstraction;

abstract class  Shape 
{
private String color;


public Shape(String color) {
	super();
	this.color = color;
}


abstract void area();


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}





}

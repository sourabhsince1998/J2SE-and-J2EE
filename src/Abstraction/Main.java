package Abstraction;

public class Main {

	public static void main(String[] args) {
		Circle c= new Circle("black",2.2);
		Rectangle r=new Rectangle("blue",2.2,4.5);
		//Shape s=new Shape();
		ShapeOf s11=new ShapeOf();
		
	s11.areaOf(c);
	//System.out.println(s11);

	}

}

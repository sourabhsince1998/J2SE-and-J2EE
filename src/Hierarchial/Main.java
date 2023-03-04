package Hierarchial;

public class Main {

	public static void main(String[] args) {
		Car c=new Car();
		Bus b=new Bus();
		c.applyBrakes();
		c.applyBrakescar();
		System.out.println("---------------");
		b.applyBrakes();
		b.applyBrakesBus();
		

	}

}

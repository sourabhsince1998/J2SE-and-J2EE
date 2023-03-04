package Demo;

interface A {
	void show();
	//void show (int i)
}

/*class Xyz implments A
{
	public void show () {
		System.out.println("Hello");
	}
}*/
public class Lambda 
{
	public static void main(String[] args) {
	A obj;
	
	/*obj= new A () {
		public void show (    //Anonymous inner class
				) {
			System.out.println("Hello");
		}
		};
	obj.show();*/
	
	obj=()->System.out.println("Hello");
	obj.show();
	
//obj=(i)->System.out.println(i)
//obj.show(9);
		
		}
	}

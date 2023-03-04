package Demo;
interface I {
	void call ();
	default void message () 
	{
		System.out.println("message sent");
		
	};
}
class phone implements I {
	public void call () {
		System.out.println("calling");
	}
}

public class AndriodPhone {
	public static void main(String[] args) {
		
	
	I i = new phone ();
	i.call();
	i.message();

}
}

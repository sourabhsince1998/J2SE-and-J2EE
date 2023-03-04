package Normal;

public class Demo2 {
	public static void main(String[] args) 
	{
		try {
			System.out.println(10/0);
		}
	/*	catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid index");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Invalid denomenator");
		} */
		catch (Exception e) {
			//System.out.println("superclass handler");
			//System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
	}

}

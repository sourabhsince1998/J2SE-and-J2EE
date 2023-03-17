package stringPackage;

public class DemoStringBuf 
{
	public static void main(String[] args)
	{
		
		String s1=new String ("Java");
		
		s1.concat("Program");
		
		System.out.println(s1);
		System.out.println("------------");
		
	    String s2=new String ("Java");
		
		String s3=s2.concat("Program");
		
		System.out.println(s3);
		
		System.out.println("------------");
		
		StringBuffer s4=new StringBuffer("Hii");
		
		s4.append("Hello");
		
		System.out.println(s4);
		
		System.out.println("------------");
		
		
	    StringBuilder s5=new StringBuilder("Good");
		
		s5.append("Morning");
		
		System.out.println(s5);
		
	    System.out.println("------------");
		
	
		
	
}

}

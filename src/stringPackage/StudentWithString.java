package stringPackage;

public class StudentWithString
{
	public static void main(String[] args)
	{
		String s1=new String("A");
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		System.out.println("-----------");
		
		System.out.println(s1.hashCode());
		
		System.out.println("-----------");
		
	    String s2=new String();
		
		String s3=new String();
		
		System.out.println(s2.equals(s3));
		
	
	}

}


